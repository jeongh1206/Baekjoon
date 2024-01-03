import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr [] = {1,1,2,2,2,8};
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			int n = sc.nextInt();
			System.out.print((arr[i]-n)+" ");
		}//for
		sc.close();
	}
}