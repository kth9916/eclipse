package chap06_07.Ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Test_error {

	
	
	public static void main(String[] args) {
		//[문제] : 스캐너로 임의의 정수값을 받아서 합계, 평균
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int num6 = sc.nextInt();
		int num7 = sc.nextInt();
		int num8 = sc.nextInt();
		int num9 = sc.nextInt();
		int num10 = sc.nextInt();
		
		int[] a = new int[] {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
				
		method1 (a);
		
	}
	
	static void method1(int...values) {
		int sum = 0;
		int avg = 0;
	System.out.println("=======합계=======");
	 for(int i = 0; i < values.length; i++) {
		 sum += values[i];
	 }
	 System.out.println(sum);
	 
	 System.out.println("======평균========");
	 
	 System.out.println(sum/values.length);
	}

}
