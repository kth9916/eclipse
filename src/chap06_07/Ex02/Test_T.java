package chap06_07.Ex02;

import java.util.Scanner;

public class Test_T {
	// ���� �� �Ŷ� ���ϸ� �ſ� ���õǰ� �Ǹ��ϴ�, �ݺ������� ����
	
	static void math(String...values) {
		int sum = 0;  		// ������ ������ ���ϴ� ����
		double avg;			// ��հ��� ���ϴ� ����
		
		for(int i = 0; i < values.length; i++) {
//			sum += values[i]; 	// values[i] ��° ���� ���� String Ÿ���̹Ƿ� ����Ÿ������ ��ȯ�� �ʿ��ϴ�
			sum += Integer.parseInt(values[i]);
					// Integer.parseInt(String) : String Ÿ���� ������ ��ȯ 
		}
		
		avg = (double) sum/values.length;  	// ����� ����ȯ�� �ݵ�� �ʿ�
		System.out.println();
		System.out.println("���Ƿ� ���� �հ�� : " + sum);
		System.out.println("���Ƿ� ���� ���� ����� : " + avg);
	}
	
	public static void main(String[] args) {
		//��ĳ�ʷ� ������ ���� ���� �Ҵ� �޾Ƽ� �հ�� ����� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ������ �־ �Է��ϼ���. >>>");
		
		String num = sc.nextLine(); // ������ ���Ƿ� ��ü ���� ���� String
		String[] array1 = num.split(" "); //split�� �����ڸ� �������� ���ڸ� �߶� �迭�� ���� <==== �̰͵� �Ǹ��ϴ�
		
		System.out.print("����� �Է��� ������ : ");
		for(int i = 0; i < array1.length; i++) { 		// �Է� ���� ���
			System.out.print(array1[i] + " ");
		}
		
		math(array1);  // ���� ���� �޼ҵ� math�� ȣ���ϸ鼭 �Ű������� array1�� �־��ָ� �ȴ�
		
	}

}
