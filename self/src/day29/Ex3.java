package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		try {
			//1.����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.���ᰴü ����
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.���ް�ü ����
			Statement stmt = con.createStatement();
			//4.�������ۼ� : �ֹ����̺��� Ư�� ���� �ֹ��� ������ �� �Ǹž�, ��հ�, ������, �ְ� ���ϱ�
			Scanner scanner = new Scanner(System.in);
			System.out.println("��ȸ�� ����ȣ�� �Է��ϼ���>");
			int id = scanner.nextInt();
			String sql = "select sum(saleprice) as total, "
					+ " avg(saleprice) as average, "
					+ " min(saleprice) as minimum, "
					+ " max(saleprice) as maximum "
					+ " from orders where custid = "+id; 
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int total = rs.getInt(1);
				int average = rs.getInt(2);
				int minimum = rs.getInt(3);
				int maximum = rs.getInt(4);
				System.out.println(total + "|" + average + "|" + minimum + "|" + maximum);
			}
			//6. �ڿ�����
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
