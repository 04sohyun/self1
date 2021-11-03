package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		try {
			//1.����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.���ᰴü ����
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
			Scanner scanner = new Scanner(System.in);
			System.out.println("���� ���� ����>");
			int cost = scanner.nextInt();
			System.out.println("��ȸ�� ���ű��ذǼ�>");
			int count = scanner.nextInt();
			String sql = "select custid, count(*) from orders where saleprice>="+cost 
					+ "group by custid having count(*)>="+count+" order by custid";
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int custid = rs.getInt(1);
				int bookcount = rs.getInt(2);
				System.out.println(custid +"|"+bookcount);
			}
			//6.�ڿ�����
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}
}
