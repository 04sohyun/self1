package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//db�ݿ� ����ó���ϱ�(setAutoCommit-false�ιٲٱ�)
public class Ex12 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			//1.����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.���ᰴü ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userid="madang";
			String pwd="madang";
			con = DriverManager.getConnection(url,userid,pwd);
			//3-1.�������۰�ü ����
			Statement stmt = con.createStatement();
			//3-2.db�ݿ� ���� ó��
			con.setAutoCommit(false);
			//4.������ �ۼ�
			String sql = "delete from customer where custid=(select max(custid) from customer)";
			//5-1.������ ���� �� ��� �ޱ�
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("��������");
			}else {
				System.out.println("��������");
			}
			//5-2.�޸𸮿��� �۾��� ��� db�� ���� �ݿ�
			con.commit();
			//6.�ڿ�����
			stmt.close(); con.close();
		}catch(Exception e) {
			try {
				con.rollback();//�޸𸮿��� ���� �߻��� db�� �ݿ����� �ʰ� ���� ���·� �ǵ�����
			}catch(Exception e1) {
			e1.printStackTrace();
			}
		}finally {
			try {
				con.setAutoCommit(true);//java�� default������ autocommit true�� ���� ����ó��
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
