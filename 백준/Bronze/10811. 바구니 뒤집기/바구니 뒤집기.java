//Arrays.sort()를 이용해 인자에 배열을 넣으면 오름차순 정렬.
//내림차순 정렬하려면 sort()인자에 배열, Collections.reverseOrder() 순으로 전달한다.
//기본적으로 객체는 Comparable이 구현되어 있다.
//custom한 객체가 배열에 있으면 Custom 클래스에 Comparable을 구현하여 sort()가 객체를 비교할 수 있도록 만들어야 함.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1부터 n개의 바구니, 역순 바꾸기 m번 진행, i부터 j까지 역순 변경
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 int [] arr = new int [n];
	 //1~n 배열 받기
	 for (int idx = 0; idx <arr.length ; idx++) {
		 arr[idx] = (idx+1); 
		}//for
	
	 //m번 역순 진행
	 for (int num = 0; num < m; num++) {
		 //시작번호,(index)
		 int i = sc.nextInt();
		 //끝번호 받기(index)

		 int j = sc.nextInt();
		
		 
		//배열 잘라서 역순으로 만들기
		 int [] tArr = Arrays.copyOfRange(arr, i-1, j);
		 //끝자리 +1 해야함 주의
		 
		 ArrayList<Integer> rvsArr = new ArrayList<Integer>();
		 for(int idx = tArr.length-1;idx>=0;idx--) {
			 rvsArr.add(tArr[idx]);
		 }//for
		 int idx = 0;
		 while(i<=j) {// i가 2 j가 4 면 2 3 4 3번 
			 //idx = 0 1 2 3번 
			// rvs
				 arr[i++-1] = rvsArr.get(idx++);
		 }
	}//for
///////////
		  
			 for (int INDEX : arr) {
				System.out.print(INDEX+" ");
			}
		 ////////////
sc.close();	 
	}//main

}//class
