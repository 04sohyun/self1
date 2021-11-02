package day19;

import java.text.MessageFormat;

public class MessageFormatEx1 {
	public static void main(String[] args) {
		String id = "java";
		String name = "신용권";
		String tel = "010-123-4567";
		
		String text = "회원 ID:{0}\n회원이름:{1}\n회원전화:{2}";
		String result1 = MessageFormat.format(text,id,name,tel);
		System.out.println(result1);
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {id,name,tel};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
