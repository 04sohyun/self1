package day16;

public class Interface4 {
	public static void main(String[] args) {
		//����ȯ - ��üŬ���� ��ü�� �����Ͽ� �ڼ� �������̽��� ����
		H4 h4 = new H5();
		//������
		h4.h1();
		h4.h2();
		h4.h3();
		h4.h4();
	}
}
//�θ��������̽�
interface H1{void h1();}
//�ڽ��������̽�
interface H2 extends H1{void h2();}
interface H3 extends H1{void h3();}
//�ڼ��������̽�
interface H4 extends H2, H3{void h4();}

//��üŬ����
class H5 implements H4{
	@Override
	public void h1() {System.out.println("h1�޼ҵ�");}
	@Override
	public void h2() {System.out.println("h2�޼ҵ�");}
	@Override
	public void h3() {System.out.println("h3�޼ҵ�");}
	@Override
	public void h4() {System.out.println("h4�޼ҵ�");}
}