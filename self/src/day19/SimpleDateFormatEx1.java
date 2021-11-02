package day19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일은 올해의 D째일이고, 올해의 w째주에 속하고 이 달의 W째주입니다.");
		System.out.println(sdf.format(now));
	}
}
