import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//hashmap
		HashMap<String, Double> level = new HashMap<String, Double>();
		level.put("A+",  4.5);
		level.put("A0",  4.0);
		level.put("B+", 3.5);
		level.put("B0", 3.0);
		level.put("C+", 2.5);
		level.put("C0",2.0);
		level.put("D+", 1.5);
		level.put("D0", 1.0);
		level.put("F", 0.0);
		
		double result = 0;
		double score = 0;
		double grade = 0;
		double totalScore = 0;
		//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
		ArrayList<String[]> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			String str = sc.nextLine();
			String [] s = str.split(" ");
			if(s[2].equals("P")) {continue;}
//			s[0] = ""+i;
//			arr.add(s);
			//학점*과목평점의 합
			result +=Double.parseDouble(s[1])*level.get(s[2]);
			totalScore +=Double.parseDouble(s[1]);
		}//for
		result/= totalScore;
		System.out.println(result);
		sc.close();
	}//main
}//class
