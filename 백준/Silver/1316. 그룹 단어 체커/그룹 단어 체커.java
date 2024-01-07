import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int cnt = 0;
		boolean chk = false;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for (int t = 0; t <n ; t++) {
			String word = sc.next();
			//word를 쪼갠 배열
			String [] letters = word.split("");
			
//			//만약에 aa나 bbb등 중복제거해서 값이 1이면 하나의 연속단어만 있는 것. 이 경우 체크
			if(Arrays.stream(letters).distinct().toArray(String[]::new).length==1) {
				cnt++;
				
//			//연속단어가 하나가 아닐 경우 반복문을 돌면서 먼저 연속단어의 경우는 하나의 글자로 줄여준다.
//			//받은 문자열이 연속단어의 모음이라면 앞의 처리 후에는 중복된 글자가 없음.
//			//중복된 글자가 있다면 체크해서 체크하지 않은 경우에만 카운트를 올려준다.
			}else {
				for (int i = 0; i<word.length()-1; i++) {
					if(letters[i].equals(letters[i+1])){
					letters[i] = "";
					}//if
				}//for
				
				
				arrChk: for(int i = 0; i < letters.length; i++) {
					for (int j = i+1; j < letters.length; j++) {
						if(letters[i].length()!=0&&letters[i].equals(letters[j])) {
							chk = true;
							break arrChk;
						}
					}
				}//arrChk
				if(!chk) {
					cnt++;
				}//if
				chk = false;
			}//else
		
			
		}//for
		
		System.out.println(cnt);
		sc.close();
			}//main
}//class
