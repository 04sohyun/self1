package day19;

import java.text.MessageFormat;

public class MessageFormatEx1 {
	public static void main(String[] args) {
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-4567";
		
		String text = "ȸ�� ID:{0}\nȸ���̸�:{1}\nȸ����ȭ:{2}";
		String result1 = MessageFormat.format(text,id,name,tel);
		System.out.println(result1);
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {id,name,tel};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
