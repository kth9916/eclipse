package chap05;

import java.util.Arrays;

public class Test_01 {
	public static void main(String[] args) {
		
		/*
		 * ����:
		 * 	�迭������ : arr1[100]
		 * 	0�� : 1
		 *  1�� : 2
		 *  
		 *  99�� : 100
		 *  
		 *  for ���� ����ؼ� ����
		 *  
		 *  - ��� : for,  ���� for, Arrays.toString() 3���� ������� 
		 */
		
		int [] arr1 = new int[100];
		for(int a = 0; a < arr1.length; a++) {		//for ���� ����ؼ� �迪 �濡 ���� �Ҵ�
			arr1[a] = a+1;							//arr1[0~99] = a + 1; �迭 ������ ���� �־��ش�.
		}
		
		//��� ���� for
		for(int i =0; i<arr1.length; i++) {
			System.out.println(i + "��°���� �� : " + arr1[i] + " ");
		}
		
		System.out.println("==================");
		
		// ����(Enhanced) for ��
		for(int k : arr1) {
			System.out.println(k + " ");
		}
		
		System.out.println();
		System.out.println("========");
		
		// Arrays.toString(arr1)
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		
	}

}
