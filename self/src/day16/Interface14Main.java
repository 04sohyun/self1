package day16;

public class Interface14Main {
	public static void main(String[] args) {
		SeperateVolume sv1 = new SeperateVolume("1111", "����", "�޹�");
		SeperateVolume sv2 = new SeperateVolume("2222", "java", "ȫ�浿");
	
		//�뿩
		printState(sv1);
		sv1.checkOut("����", "2021/10/15");
		printState(sv1);
		//�ݳ�
		sv1.checkIn();
	
		//�뿩
		printState(sv2);
		sv2.checkOut("����", "2021/08/15");
		printState(sv2);
		//�ݳ�
		sv2.checkIn();
	}
	static void printState(SeperateVolume sv) {
		if(sv.state==sv.BORROWED) {
			System.out.println("====�������� å====");
			System.out.println("������: "+sv.name);
			System.out.println("������: "+sv.date);
		}else {
			System.out.println("====���Ⱑ�� å====");
		}
	}
}
