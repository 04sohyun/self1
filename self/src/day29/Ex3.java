package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		try {
			//1.드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.연결객체 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.전달객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문작성 : 주문테이블의 특정 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가 구하기
			Scanner scanner = new Scanner(System.in);
			System.out.println("조회할 고객번호를 입력하세요>");
			int id = scanner.nextInt();
			String sql = "select sum(saleprice) as total, "
					+ " avg(saleprice) as average, "
					+ " min(saleprice) as minimum, "
					+ " max(saleprice) as maximum "
					+ " from orders where custid = "+id; 
			//5.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int total = rs.getInt(1);
				int average = rs.getInt(2);
				int minimum = rs.getInt(3);
				int maximum = rs.getInt(4);
				System.out.println(total + "|" + average + "|" + minimum + "|" + maximum);
			}
			//6. 자원해제
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
