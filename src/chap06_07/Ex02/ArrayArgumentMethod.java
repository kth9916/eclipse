package chap06_07.Ex02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	
	// static�� �����鼭 ���� Ŭ������ �����ϴ� �޼ҵ� : �޼ҵ� �̸����� ȣ���� ����
	// �ٸ� ��Ű������ ���� �����ϵ��� ���� : ���� ������ ( public, protected, default, private)
	// ���� �����ڰ� ���� �Ǿ� ������ : default (���� ��Ű������ ���� ����)
	// default�� ������� �ʴ´�.
	
	static void printArray (int[] a) { 
		System.out.println("========== Arrays.toString()�� ���=========");
		System.out.println(Arrays.toString(a));
		 
		System.out.println("========<<for�� ���� ���>>==========");
		//for ���� ����ؼ� ���
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
		}System.out.println();
		
		System.out.println("======<���� for ������ ���>>==========");
		//enhanced for ���� ����ؼ� ���
		for (int k : a) {
			System.out.print(k + " ");
		}System.out.println();
		
	}
	
	public static void main(String[] args) {
		// �迭�� �Ű� ������ ������ �޼ҵ� ȣ��
		
		int[] b = new int[] {1,2,3};
		
		printArray (b);		// �迭������ �޼ҵ� ȣ��� �迭 ���� �Է�
		
		printArray (new int[] {4,5,6,7,8});
		
//		printArray ({1,2,3}); 	// ���� �߻�
		
		
	}

}
