package chap06_07.Ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Test_error {

	
	
	public static void main(String[] args) {
		//[����] : ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		
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
	System.out.println("=======�հ�=======");
	 for(int i = 0; i < values.length; i++) {
		 sum += values[i];
	 }
	 System.out.println(sum);
	 
	 System.out.println("======���========");
	 
	 System.out.println(sum/values.length);
	}

}
