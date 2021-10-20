package day19;

public class Member2 {
	int sno;

	public Member2(int sno) {
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			return this.sno==((Member2)obj).sno;
		}
		return false;
	}
	
	
}
