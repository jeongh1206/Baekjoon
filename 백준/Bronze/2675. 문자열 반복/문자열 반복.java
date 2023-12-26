import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			//문자열 쪼개서 배열로 받기
			String [] arr = new String[s.length()];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = s.substring(j,j+1);
			}//for
			
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();

		}//for
		
		sc.close();
	}//main

}
