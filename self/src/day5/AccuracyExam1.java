package day5;

public class AccuracyExam1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("��� �Ѱ����� 0.7���� ����");
		System.out.println(result+"������ ���´�."); //0.29999999999999993 => ������ ��Ȯ�� �� ���ϱ�
		
		
		int totalPieces = apple*10;
		int temp = totalPieces - number;
		
		result = temp/10.0;
		
		System.out.println("��� �Ѱ����� 0.7���� ����");
		System.out.println(result+"������ ���´�.");
	}

}
