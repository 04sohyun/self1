package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex5 {
	public static void main(String[] args) {
		try {
			//1.����̹��ε� //2.���ᰴü ����
			Connection con = Daoconnector.getInstance().getConnection();
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
			String sql = "select name from customer c1 "
					+ "where (select count(distinct publisher) "
					+ "from customer, orders, book "
					+ "where customer.custid=orders.custid "
					+ "and book.bookid=orders.bookid "
					+ "and name like c1.name) >= 2";
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("����:"+rs.getString(1));
			}
			//6.�ڿ�����
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
