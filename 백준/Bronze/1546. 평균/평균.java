import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//원 성적 배열 받기
		int [] scores = new int [n];
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}//for
		//최대값 구하기
		double maxNum = (double)Arrays.stream(scores).max().getAsInt();

		//수정 이후 성적 배열 구하기
		double [] newScores = new double [n];
		for (int i = 0; i < n; i++) {
			newScores[i] = scores[i]/maxNum*100;
//			//처음에 0.0, 100.0만 나왔던 건 정수/정수로 계산했기 때문.
			
		}//for
		//평균
		double average = Arrays.stream(newScores).average().getAsDouble();
		System.out.println(average);
		
		
		sc.close();
	}//main
}//class
