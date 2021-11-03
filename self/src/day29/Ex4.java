package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		try {
			//1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.연결객체 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
			Scanner scanner = new Scanner(System.in);
			System.out.println("구매 조건 가격>");
			int cost = scanner.nextInt();
			System.out.println("조회할 구매기준건수>");
			int count = scanner.nextInt();
			String sql = "select custid, count(*) from orders where saleprice>="+cost 
					+ "group by custid having count(*)>="+count+" order by custid";
			//5.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int custid = rs.getInt(1);
				int bookcount = rs.getInt(2);
				System.out.println(custid +"|"+bookcount);
			}
			//6.자원해제
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}
}
