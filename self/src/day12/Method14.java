package day12;

public class Method14 {
	public static void main(String[] args) {
		G1 g = new G1();
		for(int i=0;i<10;i++) {
		String str = g.method();
		System.out.println(str);
		}
	}
}
class G1{
	String method() {
		return "´ë¹Ú";
	}
}