package chap04;

import java.util.Scanner;

public class Switch_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ڸ� �Է����ּ���. ");
		
		int num1 = 10 ;
		int num2 = 2 ;
		char operator = sc.next().charAt(0) ;
		int result = 0;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			
			break;
		case '-':
			result = num1 - num2;
			
			break;
		case '*':
			result = num1 * num2;
			
			break;
		case '/':
			result = num1 / num2;
			
			break;
		default :
			System.out.println(("������ ���� �Դϴ�. "));
		sc.close();
		return;
		
		}
		System.out.println("��� ���� :" + result + " �Դϴ�. ");
		sc.close();
	}

 }
