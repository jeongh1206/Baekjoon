import java.util.Scanner;

public class Main{
//알파벳 배열 index와 입력 단어 쪼갠 배열의 index 헷갈리지 않기
	public static void main(String[] args) {
		String [] alphabet = new String[26];
		int [] results = new int[26];
		for (int i = 0; i < results.length; i++) {
			results[i] = -1;
		}
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = ""+(char)('a'+i);
		}//for
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String [] words = new String [word.length()];
		for (int i = 0; i < words.length; i++) {
			words[i] = word.substring(i,i+1);
		}//for
		
		for (int j = 0; j < alphabet.length; j++) {
			for (int i = 0; i < words.length; i++) {
					if(alphabet[j].equals(words[i])) {
						results[j] = i;
						break;
				}//if
			}//for
		}//for
		
		for (int i : results) {
			System.out.print(i+" ");
		}//for
	}//main
}//class
