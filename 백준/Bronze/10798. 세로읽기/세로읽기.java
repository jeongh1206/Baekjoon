import java.util.Arrays;
import java.util.Scanner;
//계산할 배열은 5*15개의 크기가 유지되어야함. 그런데 받은 단어를 글자의 배열로 쪼개 덮어씌우면 5*해당 단어크기로 크기가 줄어든다.
//따라서 원 배열의 크기를 유지하면서 덮어씌우도록함.
public class Main {
	public static void main(String[] args) {
		//세로읽기
		//영대소문자와 숫자 0~9
		Scanner sc = new Scanner(System.in);
		String word = "";
		int n = 0;
		String [][] arr = new String [5] [15];
		
		for (String[] strings : arr) {
			Arrays.fill(strings,"");
		}
		
		
		//배열 덮어쓰기
		for (int i = 0; i < 5; i++) {
			String[] strs = sc.next().split("");
			for (int j = 0; j < 15; j++) {
				if(j==strs.length) {
				break;
				}//if
				arr[i][j] = strs[j];
			}
		}//for
		
		//세로읽기
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				word += arr[j][i];
			}
		}
		System.out.println(word);
	}//main
}//class
