package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex5 {
	public static void main(String[] args) {
		try {
			//1.드라이버로딩 //2.연결객체 생성
			Connection con = Daoconnector.getInstance().getConnection();
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
			String sql = "select name from customer c1 "
					+ "where (select count(distinct publisher) "
					+ "from customer, orders, book "
					+ "where customer.custid=orders.custid "
					+ "and book.bookid=orders.bookid "
					+ "and name like c1.name) >= 2";
			//5.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("고객명:"+rs.getString(1));
			}
			//6.자원해제
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
