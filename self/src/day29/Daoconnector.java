package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//DBMS���ᰴü �̱������� �����
public class Daoconnector {
	//Connection con = null;
	//Statement stmt = null;
	//ResultSet rs = null;
	//1.static�������� �ڽ�Ÿ���� �ʵ� ����
	private static Daoconnector instance = new Daoconnector();
	//2.�⺻�����ڸ� private
	private Daoconnector() {}
	//3.public�޼ҵ�� �ڽ�Ÿ���� �ʵ带 ���Ϲ޵��� ����
	public static Daoconnector getInstance() {
		return instance;
	}
	//4.���ᰴü ���� �޼ҵ�
	public static Connection getConnection() throws Exception {
		final String driver = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String userid = "madang";
		final String pwd = "madang";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userid, pwd);
		return con;
	}
}
