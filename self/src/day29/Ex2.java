package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		try {
			//1.����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.���ᰴü ����
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.���ް�ü ����
			Statement stmt = con.createStatement();
			//4.�������ۼ�
			Scanner scanner = new Scanner(System.in);
			System.out.println("��ȸ�� å ������ �Է��ϼ���>");
			String title = scanner.next();
			String sql = "select bookname, publisher from book where bookname like '%" + title + "%'";
			//5.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String bookname = rs.getString(1);
				String publisher = rs.getString(2);
				System.out.println(bookname + "|" + publisher);
			}
			//6. �ڿ�����
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
