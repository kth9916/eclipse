package chap05;

import java.util.Arrays;

public class Test_02 {
	public static void main(String[] args) {
		
		/*
		 * �迭������ : arr2[300]
		 * 0��°�� : 3
		 * 1��°�� : 6
		 * 2��°�� : 9
		 * 3 : 9
		 * 4 : 12
		 * ....
		 * for ���� ����ؼ� 3�� ����� ����
		 * 
		 * 1. ����� : for, ���� for, Arrays.toSting
		 * 2. Ȧ�������� ���� ���( ���� : 100�� ~ 300��
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
		
		//Ȧ�������� ���� ���(���� : 100��~299��)
		for(int i = 100; i < arr3.length; i++) {
			if(i%2 == 1) {
				System.out.println(arr2[i]);
			}
		}
		

		

		
	}

}
