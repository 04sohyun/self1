package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex11 {
	public static void main(String[] args) throws Exception{
		//1.����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.���ᰴü ����
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
		//3.�������۰�ü ����
		Statement stmt = con.createStatement();
		//4.������ �ۼ�
		String address = "�����";
		String phone = "010-111-1234";
		int custid = 7;
		String sql = "update customer set address= '"+address+"', phone='"+phone+"' "
				+ " where custid="+custid;
		//5.������ ���� �� ��� �ޱ�
		int result = stmt.executeUpdate(sql);
		if(result>0) System.out.println("�����Ϸ�");
		else System.out.println("��������");
		//6.�ڿ�����
		stmt.close(); con.close();
	}
}
