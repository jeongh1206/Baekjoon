import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			String word = sc.next();
			System.out.print(word.substring(0,1));
			System.out.println(word.substring(word.length()-1,word.length()));
		}
		sc.close();
	}

}
