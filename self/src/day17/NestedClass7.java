package day17;

public interface NestedClass7 {
	void parentMethod();
}

class Child implements NestedClass7{
	int childF;
	void childM() {}
	@Override
	public void parentMethod() {
		childF=3;
		childM();
	}
	
}