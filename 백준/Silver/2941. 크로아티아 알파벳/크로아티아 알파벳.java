//replace(크로아티아 문자,"")로 한 후 전체글자수 - replace한 단어의 크기 /2 (dz=라면 /3) 헸는데
//nljj와 같이 lj가 먼저 빠지면 nj가 남아 크로아티아 문자로 인식되는 경우가 있어 *을 남겨 문자 합쳐짐 방지+ 한 번에 글자수 세도록 수정
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int totalCnt = word.length();
		
		String [] arr = {"c=", "c-", "d-", "lj", "nj", "s=", "z=" };
		
		//dz=
				if(word.indexOf("dz=")!=-1) {
					word = word.replaceAll("dz=", "*");
				}
				
		for (String str : arr) {//dz=를 제외한 크로아티아 알파벳
			if(word.indexOf(str)!=-1) {
				word = word.replaceAll(str, "*");
			}
			totalCnt= word.length();
		}//for
		
		System.out.println(totalCnt);
	}//main

}//class
