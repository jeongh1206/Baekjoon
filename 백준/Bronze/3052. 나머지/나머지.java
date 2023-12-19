import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//'중복제거'를 방법으로 풀이
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt()%42;
		}//for
		
		//stream 사용해 중복 제거-> array로 변환
		int [] unqArr = Arrays.stream(arr).distinct().toArray();
		sc.close();
		System.out.println(unqArr.length);
	}

}
