package chap05;

import java.util.Arrays;

public class Test_01 {
	public static void main(String[] args) {
		
		/*
		 * 문제:
		 * 	배열변수명 : arr1[100]
		 * 	0방 : 1
		 *  1방 : 2
		 *  
		 *  99방 : 100
		 *  
		 *  for 문을 사용해서 저장
		 *  
		 *  - 출력 : for,  향상된 for, Arrays.toString() 3가지 방법으로 
		 */
		
		int [] arr1 = new int[100];
		for(int a = 0; a < arr1.length; a++) {		//for 문을 사용해서 배역 방에 값을 할당
			arr1[a] = a+1;							//arr1[0~99] = a + 1; 배열 변수에 값을 넣어준다.
		}
		
		//출력 구문 for
		for(int i =0; i<arr1.length; i++) {
			System.out.println(i + "번째방의 값 : " + arr1[i] + " ");
		}
		
		System.out.println("==================");
		
		// 향상된(Enhanced) for 문
		for(int k : arr1) {
			System.out.println(k + " ");
		}
		
		System.out.println();
		System.out.println("========");
		
		// Arrays.toString(arr1)
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		
	}

}
