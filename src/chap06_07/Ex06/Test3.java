package chap06_07.Ex06;

import java.util.Scanner;

public class Test3 {

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
		
		Scanner ed = new Scanner(System.in);
		System.out.println("������ ��� �̸��� �ְ� �ش� � ������(���)�� ��������");
		
		int sum = 0;
		
				
		
		
	while(true) {
		System.out.println();
		System.out.println("��� >>");
		String sports = ed.nextLine();
		String[] array1 = sports.split(" ");
		if(sports.equals("�׸�")) {
			break;
		}
		
		for(int i = 0; i < array1.length; i+=2) {
			if(i<array1.length-2) {
				System.out.printf("%s : %s�� , ",array1[i], array1[i+1]);
			}else {
				System.out.printf("%s : %s��  ",array1[i], array1[i+1]);}
		}
		for(int i = 0; i < array1.length; i++) {
			if(i%2 == 1) {
				sum = sum + Integer.parseInt(array1[i]);
			}
		}
			System.out.println();
			System.out.println("������� ������ �� �հ� : " + sum);

		int a = array1.length;
		int b = a/2;
		System.out.println("������� ��� ������ �� : " + (double)sum/b);
		
		

	}
	ed.close();
	System.out.println("���α׷��� �����մϴ�.");
	}
}
