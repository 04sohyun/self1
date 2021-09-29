package day8;

public class Array3 {
	public static void main(String[] args) {
		//타입[] 변수명 = new 타입[저장할 요소 갯수];
		int[] scores = new int[10];
		scores[0] = 10;
		scores[1] = 15;
		scores[2] = 5;
		scores[3] = 7;
		scores[4] = 8;
		scores[5] = 3;
		scores[6] = 9;
		scores[7] = 10;
		scores[8] = 5;
		scores[9] = 4;
		
		//타입 변수명[] = new 타입[저장할 요소 갯수];
		int score[] = new int[10];
		score[0] = 10;
		score[1] = 15;
		score[2] = 5;
		score[3] = 7;
		score[4] = 8;
		score[5] = 3;
		score[6] = 9;
		score[7] = 10;
		score[8] = 5;
		score[9] = 4;
		
		//타입 변수명[]; or 타입[] 변수명;
		//변수명 = new 타입[]{초기값1,초기값2,초기값3,...};
		int[] scores1;
		scores1 = new int[] {10,15,5,7,8,3,9,10,5,4};
		
		//타입 변수명[] = {초기값1,초기값2,초기값3,...}
		int scores2[] = {10,15,5,7,8,3,9,10,5,4};
	}

}
