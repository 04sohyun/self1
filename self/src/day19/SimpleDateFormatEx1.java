package day19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd���� ������ D°���̰�, ������ w°�ֿ� ���ϰ� �� ���� W°���Դϴ�.");
		System.out.println(sdf.format(now));
	}
}