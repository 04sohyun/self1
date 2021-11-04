package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		//1.드라이버 로딩 //2.연결객체 생성
		Connection con = Daoconnector.getInstance().getConnection();
		//3.쿼리객체 생성
		Statement stmt = con.createStatement();
		//4.쿼리문작성
		String sql = "select * from customer where custid =(select max(custid) from customer)";
		//5.쿼리문 전송 및 결과 받기
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
		}
		//6.자원해제
		rs.close(); stmt.close(); con.close();
	}
}
