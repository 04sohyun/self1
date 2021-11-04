package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		//1.����̹� �ε� //2.���ᰴü ����
		Connection con = Daoconnector.getInstance().getConnection();
		//3.������ü ����
		Statement stmt = con.createStatement();
		//4.�������ۼ�
		String sql = "select * from customer where custid =(select max(custid) from customer)";
		//5.������ ���� �� ��� �ޱ�
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
		}
		//6.�ڿ�����
		rs.close(); stmt.close(); con.close();
	}
}
