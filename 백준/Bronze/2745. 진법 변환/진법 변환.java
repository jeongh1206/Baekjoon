import java.util.Arrays;
import java.util.Scanner;
//1. 받은 숫자를 자리수별로 쪼개준다.
//2. 쪼개준 숫자에 알파벳이 있다면 숫자로 변환한다.
//3. 각 숫자*진법*자릿수
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		
		//1. 각 숫자를 쪼갠다.	
		String [] nums = n.split("");
		
		//2. 쪼개준 숫자에 알파벳이 있다면 숫자로 변환한다.
		String [] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		//알파벳 -> 숫자 위한 배열
		int [] nums2 = new int [35];
		
		//10,11,12~,..,35 넣어주기
		nums2[0] = 10;
		for (int i = 1; i < 35; i++) {
			nums2[i] = nums2[i-1]+1;
		}//for
		
		//알파벳이 있으면 숫자로 변환
		for (int i = 0; i < nums.length; i++) {
			for (int j=0;j<alphabet.length;j++) {
				if(nums[i].equals(alphabet[j])) {
					nums[i] = String.valueOf(nums2[j]);
				}//if
			}//for
		}//for
		
		//B진법*자리별 숫자*0승, B진법*자리별 숫자*1승,...
		for (int i = 0; i < nums.length; i++) {
			int n2 = 1;
			for (int j = 0; j <nums.length-i-1; j++) {
				n2 *= b;
			}
			nums[i] = String.valueOf(Integer.parseInt(nums[i])*n2);
		}
		//결과값 선언하고 숫자를 모두 취합해 넣는다.
		int result = 0;
		
		for (String s : nums) {
			result += Integer.parseInt(s);
		}
		System.out.println(result);
	}//main

}