package day19;

public class CloneEx1 {
	public static void main(String[] args) throws Exception {
		A1 a = new A1();
		//¾èÀºº¹Á¦
		A1 b = (A1)(a.clone());
	}
}

class A1 implements Cloneable{
	int a;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}