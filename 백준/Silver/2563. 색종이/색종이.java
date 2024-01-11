import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//전체 도화지에 해당하는 배열
		boolean [][] arr = new boolean [101][101];
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		//num 수만큼 반복하면서 입력 받음
		for (int i = 0; i < num; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			//n1부터 10 3 이면 13까지
			//n2부터 10
			
			for (int j = 1; j <= 10; j++) {
				for (int k = 1; k <= 10; k++) {
					arr[j+n1][k+n2] = true;
				}//for
			}//for
		}//for
		
		//색종이 크기 구하는 반복문
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if(arr[i][j]) {
					count++;
				}//if
			}//for
		}//for
			System.out.println(count);
	}

}
