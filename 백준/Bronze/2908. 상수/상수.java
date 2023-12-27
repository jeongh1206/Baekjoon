import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		StringBuffer bf1= new StringBuffer(sc.next());
		StringBuffer bf2= new StringBuffer(sc.next());
		sc.close();
		int n1 = Integer.parseInt(String.valueOf(bf1.reverse()));
		int n2 = Integer.parseInt(String.valueOf(bf2.reverse()));
		if(n1>n2) {
			System.out.println(n1);
		}else {
			System.out.println(n2);
		}
	}//main
}//class
