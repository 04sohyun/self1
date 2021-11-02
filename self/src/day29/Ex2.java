package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		try {
			//1.드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.연결객체 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.전달객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문작성
			Scanner scanner = new Scanner(System.in);
			System.out.println("조회할 책 제목을 입력하세요>");
			String title = scanner.next();
			String sql = "select bookname, publisher from book where bookname like '%" + title + "%'";
			//5.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String bookname = rs.getString(1);
				String publisher = rs.getString(2);
				System.out.println(bookname + "|" + publisher);
			}
			//6. 자원해제
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
