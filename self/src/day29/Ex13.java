package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex13 {
	public static void main(String[] args) {
		try {
			//1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.연결객체 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userid="madang";
			String pwd="madang";
			Connection con = DriverManager.getConnection(url,userid,pwd);
			//3.쿼리전송객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문작성
			String sql = "select * from customer";
			//5.쿼리문 전송 및 결과 받기
			boolean isResult = stmt.execute(sql);
			if(isResult) {
				ResultSet rs = stmt.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
				}
			}else {
				int resultCount = stmt.getUpdateCount();
				System.out.println("처리행의 수 :"+resultCount);
			}
			//6.자원해제
			stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
