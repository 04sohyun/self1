package day19;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			return this.id.equals(((Member)obj).id);
		}
		return false;
	}
	
	
}
