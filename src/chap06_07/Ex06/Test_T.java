package chap06_07.Ex06;

import java.util.Scanner;

public class Test_T {

	public static void main(String[] args) {
//		������ ��� �̸��� �ְ� �ش� ��� ������(���)�� �־ ����ϴ� ���α׷��� �ۼ� ��, ��ü �� �� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
//
//		��)
//		�Է� >>
//		Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2 ............  // nextline() asdf.split( )
//
//		��� >>
//		Ź�� : 2 , �߱� : 9 , �౸ : 11 , �� : 6, ���� : 2
//		������� ������ �� �հ� : XX
//		������� ��� �������� : X
//
//		"�׸�"�̶�� �Է� �ϸ� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��̸� ���������� ������ �̿��ؼ� �Է��ϼ���.");
		System.out.println("��) �Է� >>> Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");
		
		String str ; 	// ��ü String ���� ��ǲ �޴� ����
		int sum = 0; 	// � �������� ����� ���� �����ϴ� ����
		int memberCount = 0;
		double avg = 0; 	// ����� ���ϴ� ���� : ��ü�������� �� / ������ �� 
		String [] arr; 	// ������ �������� �߶� �迭�� �����ϴ� ���� 
		int b = 0; 		// �� ������ �������� ��� ����
		
		do {
			str = sc.nextLine(); 	// sc.next(); : ��������� String
									// sc.nextline(); : ����(enter)���� ��ü�� String
			if(str.equals("�׸�")) { 		// str�� ���� �ڷ����̹Ƿ� str.equals()
				break;
			}
			
			arr = str.split(" "); 	// str�� ������ �������� �߶� arr �迭�� ����
			
			for(int i = 0; i < arr.length; i++) { 			// arr.length : �迭�� index 0 ~ ������ �����
				if(i%2 != 0) {  // i : ���� ��ȣ�̰� ���ڸ� �����´�.
					b = Integer.parseInt(arr[i]);	// �� ���� String Ÿ���� ������ ��ȯ
					
					sum += b; 	// sum  = sum + b // sum : ��ü �������� ��
					memberCount++; 	// avg = sum / memberCount
					
				}
			}
			avg = (double)sum/memberCount; 		// ���
			
			System.out.println(str);
			System.out.println("�������� ���� : " + sum);
			System.out.println("�������� ��� : " + avg);
			
		} while(true);
		
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
