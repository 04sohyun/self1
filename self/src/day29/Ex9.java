package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		try {
			//1.����̹� �ε� //2.���ᰴü ����
			Connection con = Daoconnector.getInstance().getConnection();
			//3.������ü ����
			Statement stmt = con.createStatement();
			//4.������ �ۼ� - ����Ϸ��� �̸��� ������ �ִ��� Ȯ��
			Scanner scanner = new Scanner(System.in);
			System.out.println("����� ������ �Է��ϼ���>");
			String name = scanner.next();
			System.out.println("����� �ּҸ��� �Է��ϼ���>");
			String address = scanner.next();
			System.out.println("����� ��ȭ��ȣ�� �Է��ϼ���>");
			String phone = scanner.next();
			
			String sql = "select count(*) from customer where name='"+name+"'";
			//5-1.������ ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				if(rs.getInt(1)>0) {
					System.out.println("�̹� ��ϵ� ȸ���Դϴ�.");
				}else {
					//��ϵ� ȸ���� �ƴ϶�� ���� ���
					sql = "insert into customer "
						+ " values((select max(custid)+1 from customer),'"+name+"','"+address+"','"+phone+"'";
					//��Ͻ���
					stmt.executeUpdate(sql);
				}
			}
			//5-2.�����ȸ
			sql = "select * from customer order by custid";
			rs=stmt.executeQuery(sql);
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
