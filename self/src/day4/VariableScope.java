package day4;

public class VariableScope {

	public static void main(String[] args) {
		//main�޼ҵ� �������� ����� ���ú���
		int var1;
		
		if(true) {
			//main�޼ҵ� ���� if������ ����� ���ú���
			int var2;
			var1 = 2;
			var2 = 3;
			int result = var1 + var2;
			System.out.println(result);  //5
		}
		
		while(true) {
			//main�޼ҵ� ���� while�������� ����� ���ú���
			int var3;
			System.out.println(var1);  //2
			var1 = 3;
			var3 = 5;
			int result2 = var1 + var3;
			System.out.println(result2);  //8
			break; //�ݺ����� ���������� �ϴ� ��ɹ�
			
		}
		System.out.println(var1);  //3
		//�ڽ��� ����� ���������� ����
		//System.out.println(var2);
		//System.out.println(var3);
	}

}
