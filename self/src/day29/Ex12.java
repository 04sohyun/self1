package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//db반영 수동처리하기(setAutoCommit-false로바꾸기)
public class Ex12 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			//1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.연결객체 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userid="madang";
			String pwd="madang";
			con = DriverManager.getConnection(url,userid,pwd);
			//3-1.쿼리전송객체 생성
			Statement stmt = con.createStatement();
			//3-2.db반영 수동 처리
			con.setAutoCommit(false);
			//4.쿼리문 작성
			String sql = "delete from customer where custid=(select max(custid) from customer)";
			//5-1.쿼리문 전송 및 결과 받기
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("삭제성공");
			}else {
				System.out.println("삭제실패");
			}
			//5-2.메모리에서 작업한 결과 db에 수동 반영
			con.commit();
			//6.자원해제
			stmt.close(); con.close();
		}catch(Exception e) {
			try {
				con.rollback();//메모리에서 예외 발생시 db에 반영하지 않고 이전 상태로 되돌리기
			}catch(Exception e1) {
			e1.printStackTrace();
			}
		}finally {
			try {
				con.setAutoCommit(true);//java의 default상태인 autocommit true로 설정 변경처리
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
