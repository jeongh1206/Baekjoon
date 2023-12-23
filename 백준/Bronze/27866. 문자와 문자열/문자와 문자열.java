import java.lang.Character.Subset;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int i = sc.nextInt();
		sc.close();
		System.out.println(word.substring(i-1,i));
	}//main

}//class
