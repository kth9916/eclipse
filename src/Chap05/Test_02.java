package chap05;

import java.util.Arrays;

public class Test_02 {
	public static void main(String[] args) {
		
		/*
		 * 배열변수명 : arr2[300]
		 * 0번째방 : 3
		 * 1번째방 : 6
		 * 2번째방 : 9
		 * 3 : 9
		 * 4 : 12
		 * ....
		 * for 문을 사용해서 3의 배수만 저장
		 * 
		 * 1. 출력은 : for, 향상된 for, Arrays.toSting
		 * 2. 홀수번방의 값만 출력( 범위 : 100번 ~ 300번
		 */
		
		int[] arr2 = new int[300];
		
		for(int a = 0; a < arr2.length; a++) {
			arr2[a] = (a*3) + 3; 
		}
		
		//1
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("===================");
		
		//2
		for (int k : arr2) {
			System.out.println(k);
		}
		
		System.out.println("===================");
		
		//3
		System.out.println(Arrays.toString(arr2));
		
		//       ================
		
		System.out.println("===================");
		
		int[] arr3 = new int[300];
		
		for(int a = 0; a < arr3.length; a++) {
			arr3[a] = (a*3) + 3; 
		}
		
		//홀수번방의 값만 출력(범위 : 100번~299번)
		for(int i = 100; i < arr3.length; i++) {
			if(i%2 == 1) {
				System.out.println(arr2[i]);
			}
		}
		

		

		
	}

}
