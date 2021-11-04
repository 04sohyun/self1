package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		try {
			//1.드라이버 로딩 //2.연결객체 생성
			Connection con = Daoconnector.getInstance().getConnection();
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성
			Scanner scanner = new Scanner(System.in);
			System.out.println("등록할 고객명을 입력하세요>");
			String name = scanner.next();
			System.out.println("등록할 주소명을 입력하세요>");
			String address = scanner.next();
			System.out.println("등록할 전화번호를 입력하세요>");
			String phone = scanner.next();
			
			String sql = "insert into customer(custid, name, address, phone) "
					+ " values((select max(custid)+1 from customer),'"+name+"','"+address+"','"+phone+"')";
			//5-1.쿼리문 전송 및 결과 받기
			int result = stmt.executeUpdate(sql);
			//5-2.결과조회
			sql = "select * from customer order by custid";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
			}
			//6.자원해제
			rs.close(); stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
