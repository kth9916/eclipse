package chap06_07.Ex06;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		System.out.println("������ ��� �̸��� �ְ� �ش� � ������(���)�� ��������");
		
		int sum = 0;
		String sports = dc.nextLine();
				
		String[] array1 = sports.split(" ");
		
		System.out.println("��� >>");
		for(int i = 0; i < array1.length; i+=2) {
			System.out.printf("%s : %s , ",array1[i], array1[i+1]);}
		for(int i = 0; i < array1.length; i++) {
			if(i%2 == 1) {
				sum = sum + Integer.parseInt(array1[i]);
			}
			else if(sports.equals("�׸�")) {
				dc.close();
				System.out.println("���α׷��� �����մϴ�.");
			}
		}
			System.out.println();
			System.out.println("������� ������ �� �հ� : " + sum);

		int a = array1.length;
		int b = a/2;
		System.out.println("������� ��� ������ �� : " + (sum/b));
		
		
		}
		
	}


