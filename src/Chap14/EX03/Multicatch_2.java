package Chap14.EX03;

public class Multicatch_2 {

	public static void main(String[] args) {
		
		// 1. Exception에서 모든 예외를 처리 할 수 있다.
			// 모든 예외는 Exception을 상속 받는다.
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch(Exception e) {
			//try{} 블락에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
			System.out.println("예외 처리(Exception)");
		}
		
		// 2. catch 블락의 순서가 잘못된 경우 : 이미 catch(Exception e)가 모든 예외를 처리했기 때문에 뒤에 catch는 잘못된 경우이다.
		
		/*
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch(Exception e) {
			//try{} 블락에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
			System.out.println("예외 처리(Exception)");
		}catch (ArithmeticException e) {
			
		}catch (NumberFormatException e) {
			
		}
		*/
		
		// 3. catch 블락의 올바른 순서 : 최상의 Exception은 catch 블락의 마지막에 위치
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
			
		}catch (ArithmeticException e) { 	// 최하위의 
			
		}catch (NumberFormatException e) {
			
		}catch(Exception e) { 	// 최상위 부모의 Exception은 마지막에 위치
			
		}
		
		// 4. 여러개의 exception을 통합 해서 적용
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
			
		}catch (ArithmeticException | NumberFormatException e) { 	
			//여러개의 exception을 통합
		} catch (Exception e) {
			
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
