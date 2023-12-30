import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
		String str1 = "";
		String str2 = "";
		int n2 = n-1;
		int i2 = n-1;
	for (int i = 1; i <= n*2-1; i++) {
			if(i<n) {
				str1 = " ".repeat(n2);
				str2 = "*".repeat(2*i-1);
                n2--;
                System.out.println(str1+str2);
				
			}else if(i==n) {
				System.out.println("*".repeat(2*n-1));
                n2++;
			}else {
				str1 = " ".repeat(n2);
				str2 = "*".repeat(2*i2--+(-1));
                n2++;
                System.out.println(str1+str2);

			}
		}
		sc.close();
    }
}