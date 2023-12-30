import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] dial = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		char [] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int time = 0;
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		char [] letters = new char[word.length()];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = word.charAt(i);
					}//for
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < c.length; j++) {
			if(c[j]==letters[i]) {
				time+=dial[j];
				}//if
			}//for
		
		}//for
		System.out.println(time);
	}//main

}//class
