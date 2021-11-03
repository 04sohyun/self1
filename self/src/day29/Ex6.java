package day29;

import java.sql.Connection;
import java.sql.Statement;

public class Ex6 {
	public static void main(String[] args) {
		try {
			//1.드라이버 로딩 //2.연결객체 생성
			Connection con = Daoconnector.getInstance().getConnection();
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성 - book테이블에 축구영웅, 대한출판사, 30000 삽입
			String sql = "insert into book "
					+ " values((select max(bookid)+1 from book),'축구영웅','대한출판사',30000)";
			//5.쿼리문 전송 및 결과 받기
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("입력성공");
			}else {
				System.out.println("입력실패");
			}
			//6.자원해제
			stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
