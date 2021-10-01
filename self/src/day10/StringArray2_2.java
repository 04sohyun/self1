package day10;

public class StringArray2_2 {
	public static void main(String[] args) {
		String title = "성적표";
		String[] head = {"이름","국어","영어","수학","총점","평균"};
		String[] name = {"홍길동","일지매","임꺽정","이순신"};
		System.out.println("\t\t"+title);
		for(String s:head) {
			System.out.print(s+"\t");
		}
		System.out.println();
		System.out.println("=============================================");
		
		//각자의 총점과 평균 구하기
		int score[][] = {{90,80,70},{76,86,90},{90,78,90},{85,65,87}};
		int sum=0;
		int[] total=new int[4]; 
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				total[j] += score[i][j];
			}
			System.out.print(sum+"\t"+sum/score[i].length);
			System.out.println();
			total[total.length-1]+=sum;
			sum=0;
		}
		System.out.println("=============================================");
		//각 과목별 합계구하기
		System.out.print("합 계\t");
		for(int i=0;i<total.length;i++) {
			System.out.print(total[i]+"\t");
		}
	}

}
