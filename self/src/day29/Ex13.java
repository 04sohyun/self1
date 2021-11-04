package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex13 {
	public static void main(String[] args) {
		try {
			//1.����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.���ᰴü ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userid="madang";
			String pwd="madang";
			Connection con = DriverManager.getConnection(url,userid,pwd);
			//3.�������۰�ü ����
			Statement stmt = con.createStatement();
			//4.�������ۼ�
			String sql = "select * from customer";
			//5.������ ���� �� ��� �ޱ�
			boolean isResult = stmt.execute(sql);
			if(isResult) {
				ResultSet rs = stmt.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
				}
			}else {
				int resultCount = stmt.getUpdateCount();
				System.out.println("ó������ �� :"+resultCount);
			}
			//6.�ڿ�����
			stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
