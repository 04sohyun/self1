package day11;

public class Car8 {

 int gas;
 
 void run() {
	 while(true) {
		 if(gas>0) {
			 System.out.println("¥ﬁ∏≥¥œ¥Ÿ.(gas¿‹∑Æ:"+gas+")");
			 gas--;
		 }else {
			 System.out.println("∏ÿ√‰¥œ¥Ÿ.(gas¿‹∑Æ:"+gas+")");
			 return; //∏ﬁº“µÂ ¡æ∑·
		 }
	 }
 }
}
