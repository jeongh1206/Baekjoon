import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		StringBuffer bf= new StringBuffer(sc.next());
		sc.close();
		String word1 = bf.toString();
		String word2 = bf.reverse().toString();
		if(word1.equals(word2)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}//main
}//class
