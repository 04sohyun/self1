package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		try {
			//1.����̹� �ε� //2.���ᰴü ����
			Connection con = Daoconnector.getInstance().getConnection();
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
			Scanner scanner = new Scanner(System.in);
			System.out.println("����� �������� �Է��ϼ���>");
			String name = scanner.next();
			System.out.println("����� �ּҸ��� �Է��ϼ���>");
			String address = scanner.next();
			System.out.println("����� ��ȭ��ȣ�� �Է��ϼ���>");
			String phone = scanner.next();
			
			String sql = "insert into customer(custid, name, address, phone) "
					+ " values((select max(custid)+1 from customer),'"+name+"','"+address+"','"+phone+"')";
			//5-1.������ ���� �� ��� �ޱ�
			int result = stmt.executeUpdate(sql);
			//5-2.�����ȸ
			sql = "select * from customer order by custid";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
			}
			//6.�ڿ�����
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}