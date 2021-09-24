package day5;

public class AccuracyExam1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서 0.7개를 빼면");
		System.out.println(result+"조각이 남는다."); //0.29999999999999993 => 정수로 정확한 값 구하기
		
		
		int totalPieces = apple*10;
		int temp = totalPieces - number;
		
		result = temp/10.0;
		
		System.out.println("사과 한개에서 0.7개를 빼면");
		System.out.println(result+"조각이 남는다.");
	}

}
