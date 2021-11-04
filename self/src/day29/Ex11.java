package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex11 {
	public static void main(String[] args) throws Exception{
		//1.드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.연결객체 생성
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
		//3.쿼리전송객체 생성
		Statement stmt = con.createStatement();
		//4.쿼리문 작성
		String address = "서울시";
		String phone = "010-111-1234";
		int custid = 7;
		String sql = "update customer set address= '"+address+"', phone='"+phone+"' "
				+ " where custid="+custid;
		//5.쿼리문 전송 및 결과 받기
		int result = stmt.executeUpdate(sql);
		if(result>0) System.out.println("수정완료");
		else System.out.println("수정실패");
		//6.자원해제
		stmt.close(); con.close();
	}
}
