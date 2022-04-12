package chap04;

import java.util.Scanner;

public class Switch_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자를 입력해주세요. ");
		
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
			System.out.println(("연산자 오류 입니다. "));
		sc.close();
		return;
		
		}
		System.out.println("결과 값은 :" + result + " 입니다. ");
		sc.close();
	}

 }
