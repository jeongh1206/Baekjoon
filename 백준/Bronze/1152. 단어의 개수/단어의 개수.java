//import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        //공백+공백도 안되게 수정.
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] arr = s.trim().split(" ");
		int count = 0;
		for (String string : arr) {
			if(string.length()!=0) {
				count++;
			}
		}
		
		System.out.println(count);
		//		배열 내용 보기
//		System.out.println(Arrays.toString(arr));
	}//main
}//class
