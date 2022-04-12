package chap04;
public class IF_Ex01 {
	public static void main(String[] args) {
		
		//if 문 : 
		/*
		 * if (조건) {
		 *    조건이 참일때 실행될 코드;
		 * }
		 */
		
		int value1 = 5;
		if (value1 < 3) {
			System.out.println("실행1 : 조건이 참일때 실행 ");
		}
		
		/*
		 * if (조건) {
		 * 		조건이 참일 때 실행할 문장;
		 * } 
		 * else {
		 * 		조건이 거짓일 때 실행할 문장;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("실행 3");			// 조건이 true일 때 실행
		}
		else {
			System.out.println("실행 4");			// 조건이 false일 때 실행
		}
		
		if (bool2) {
			System.out.println("실행 5");			// 조건이 true일 때 실행
		}
		else {
			System.out.println("실행 6");			// 조건이 false일 때 실행
		}
		System.out.println("==========");
		
		// if ~ else 는 삼항 연산자로 변환이 가능
		
		System.out.println((bool1) ? "실행 7" : "실행 8");		// 참이므로 "실행7"이 출력
		System.out.println((bool2) ? "실행 9" : "실행 10");	// 거짓이므로 "실행10"이 출력
		
		System.out.println("========");
		/*
		 * if의 조건이 여러 개일 때 ?
		 * 
		 * if (조건1) {
		 * 		조건1이 참일 때 실행 코드;
		 * } else if (조건2) {
		 * 		조건2가 참일 때 실행 코드;
		 * } else if (조건3) {
		 * 		조건3이 참일 때 실행 코드;
		 * } else {
		 * 		위의 조건이 모두 만족하지 않을 때 실행 코드;
		 * }
		 * 
		 * 
		 */
		
		int value3 = 65;
		
		if (value3 >= 90) {
			System.out.println("A학점 , 점수 : " + value3);
		}
		else if (value3 >= 80) {
			System.out.println("B학점 , 점수 : " + value3);		//실행 후에 if문을 빠져 나온다.
		}
		else if (value3 >= 70) {
			System.out.println("C학점 , 점수 : " + value3);
		}
		else {
			System.out.println("F학점 , 점수 : " + value3);
		}
		
		/*
		 * IF 문에서 조건의 순서가 바뀌어 있을 경우 
		 */
		value3 = 85;
		if (value3 >= 90) {
			System.out.println("A학점 , 점수 : " + value3);
		}
		else if (value3 >= 70) {
			System.out.println("C학점 , 점수 : " + value3);		//실행 후에 if문을 빠져 나온다.
		}
		else if (value3 >= 80) {
			System.out.println("B학점 , 점수 : " + value3);
		}
		else {
			System.out.println("F학점 , 점수 : " + value3);
		}
		System.out.println("===========");
		
		/*
		 * 조건을 부여 할 때 세밀하게 적용
		 */
		value3 = 85;
		if (value3 <= 100 && value3 >= 90) {
			System.out.println("A 학점");
		}
		else if (value3 < 80 && value3 >= 70) {
			System.out.println("C 학점");
		}else if (value3 < 90 && value3 >= 80){
			System.out.println("B 학점");
		}else {
			System.out.println("F학점");
		}
		
		/*
		 * if 문에서 실행문이 하나일 때 {}를 생략 할 수 있다.
		 */
		
		System.out.println("===================");
		
		if (3 < 5)
			System.out.println("안녕");		//if에서 {} 가 생략된 경우
		
		System.out.println("==============");
		
		if (3 > 5)
			System.out.println("안녕2");
			System.out.println("반갑");
		
		
	}

}
