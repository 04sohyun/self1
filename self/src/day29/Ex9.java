package day29;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		try {
			//1.드라이버 로딩 //2.연결객체 생성
			Connection con = Daoconnector.getInstance().getConnection();
			//3.쿼리객체 생성
			Statement stmt = con.createStatement();
			//4.쿼리문 작성 - 등록하려는 이름이 기존에 있는지 확인
			Scanner scanner = new Scanner(System.in);
			System.out.println("등록할 고객명을 입력하세요>");
			String name = scanner.next();
			System.out.println("등록할 주소명을 입력하세요>");
			String address = scanner.next();
			System.out.println("등록할 전화번호를 입력하세요>");
			String phone = scanner.next();
			
			String sql = "select count(*) from customer where name='"+name+"'";
			//5-1.쿼리문 전송 및 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				if(rs.getInt(1)>0) {
					System.out.println("이미 등록된 회원입니다.");
				}else {
					//등록된 회원이 아니라면 새로 등록
					sql = "insert into customer "
						+ " values((select max(custid)+1 from customer),'"+name+"','"+address+"','"+phone+"'";
					//등록실행
					stmt.executeUpdate(sql);
				}
			}
			//5-2.결과조회
			sql = "select * from customer order by custid";
			rs=stmt.executeQuery(sql);
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
