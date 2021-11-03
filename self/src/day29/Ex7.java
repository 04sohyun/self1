package day29;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		try {
			//1.드라이버 로딩 //2.연결객체 생성
			Connection con = Daoconnector.getInstance().getConnection();
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
			Scanner scanner = new Scanner(System.in);
			System.out.println("등록할 도서명을 입력하세요>");
			String title = scanner.next();
			System.out.println("등록할 출판사명을 입력하세요>");
			String publisher = scanner.next();
			System.out.println("등록할 가격을 입력하세요>");
			int price = scanner.nextInt();
			
			String sql = "insert into book "
					+ "values((select max(bookid)+1 from book),'"+title+"','"+publisher+"',"+price+")";
			//5.쿼리문 전송 및 결과 받기
			int result = stmt.executeUpdate(sql);
			if(result>0) System.out.println("입력성공");
			else System.out.println("입력실패");
			//6.자원해제
			stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
