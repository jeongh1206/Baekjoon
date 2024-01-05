import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		
		
			String [] letters = new String [word.length()];
			
			
			for (int i = 0; i < word.length(); i++) {
				letters[i] = (word.substring(i,i+1));
			}
			
			String[] std = Arrays.stream(letters).distinct().toArray(String[]::new);
			
        //같은 글자만 중복해서 썼을 때 오류나지 않도록 수정
        //if(word.length>1에서 중복 제거 후 돌리는 것으로 수정)
        if(std.length>1) {
			int [] nums = new int [std.length];
			
			int idx = 0;
			for (String s : std) {
				nums[idx++] = letters.length - word.replaceAll(s, "").length();
			}//for
			
			int [] nums2 = new int[nums.length];
			for (int i = 0; i < nums2.length; i++) {
				nums2[i] = nums[i];
			}
			//오름차순 정렬해 최대값 찾기
			Arrays.sort(nums2);
			
			//가장 큰 값이 그 다음으로 큰 값과 같으면
			if(nums2[nums2.length-1]==nums2[nums2.length-2]) {
				System.out.println("?");
				
			}else {//중복이 아닐 때
				for (int i = 0; i<nums.length;i++) {
					if(nums[i]==nums2[nums2.length-1]) {
						System.out.println(std[i]);
					}
				}
			}//else
			
		}//if
		else {
            
			System.out.println(std[0]);
		}
		
	}

}
