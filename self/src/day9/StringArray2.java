package day9;

public class StringArray2 {
	public static void main(String[] args) {
		String[] snake = {"±¸··ÀÌ","ÆÈ··ÀÌ","Ä¥··ÀÌ","À°··ÀÌ","¿À··ÀÌ"};
		String[] insect = {"¸Ş¶Ñ±â","°³¹Ì","Áö··ÀÌ"};
	
		//µÎ ¹è¿­ ÇÕÄ¡±â
		String[] animal = new String[snake.length+insect.length];
		
		for(int i=0;i<snake.length;i++) {
			animal[i]=snake[i];
		}
		for(int i=0;i<insect.length;i++) {
			animal[snake.length+i]=insect[i];
		}
		
		for(String s:animal) {
			System.out.print(s+" ");
		}
	}

}
