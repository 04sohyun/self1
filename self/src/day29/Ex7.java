package day29;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		try {
			//1.����̹� �ε� //2.���ᰴü ����
			Connection con = Daoconnector.getInstance().getConnection();
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ�
			Scanner scanner = new Scanner(System.in);
			System.out.println("����� �������� �Է��ϼ���>");
			String title = scanner.next();
			System.out.println("����� ���ǻ���� �Է��ϼ���>");
			String publisher = scanner.next();
			System.out.println("����� ������ �Է��ϼ���>");
			int price = scanner.nextInt();
			
			String sql = "insert into book "
					+ "values((select max(bookid)+1 from book),'"+title+"','"+publisher+"',"+price+")";
			//5.������ ���� �� ��� �ޱ�
			int result = stmt.executeUpdate(sql);
			if(result>0) System.out.println("�Է¼���");
			else System.out.println("�Է½���");
			//6.�ڿ�����
			stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
