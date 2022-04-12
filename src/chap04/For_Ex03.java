package chap04;
public class For_Ex03 {
	public static void main(String[] args) {
		
		
		//For 기본 작동 
		//for (초기식; 조건식; 증감식){
		//실행내용; > 조건이 true동안 실행
		//}
		
		int a;		//블락 밖에서 선언된 변수 , 선언 (O) , 초기값 (X)
		for ( a = 0; a < 5; a++) {
			System.out.print(a + " ");		//
		}
		
		System.out.println();
		System.out.println("블락 밖에서 출력 : " + a);
		
		System.out.println("=========");
		
		for (int b = 0; b <= 10; b++) {
			System.out.println(b );
		}
		
		//System.out.println(b); //for문 내에서만 유효함 (지역변수)
		
		System.out.println("===========");
		int c;
		for (c = 10; c > 0; c--) {
			System.out.println(c);
		}
		
		// 2의 배수를 출력
		for (int i = 0; i < 100; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		/*for문 내에서 초기값과 증가값은 여러 변수를 할당 할 수 있다. */
		
		for (int i=0, j=0 ; i < 10; i++, j++) {
			System.out.println(i + " * " + j + " : "  + (i * j));
		}
		
		System.out.println("==================");
		
		// * for문을 사용해서 1부터 10까지 곱한 값을 출력해 보세요 
		
		
		int s=1;
		for (int i=1; i <= 10; i++) {
			s *= i;		//s = s * i
		}
		System.out.println("1부터 10까지 곱한 값 : " + s);
		
		System.out.println("==================");
		
		// for문을 사용해서 1부터 100까지 더한 값을 출력해 보세요
		
		int z;
		int sum;
		for (z=1, sum=0; z <= 100; z++) {
			sum += z;
		}
		System.out.println("1부터 100까지 더한 값 : " + sum);
		
		// 이중 for문 : 1단 ~ 9단 까지 구구단 출력
		
		System.out.println("=====구구단 출력======");
		
		
		for ( int i = 1; i <= 9; i++) {		//i : 단을 출력
			for ( int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		System.out.println("================");
		
		/*
		 * for문에서 무한 루프 발생 : 조건이 없을 경우
		 */
		
//		for(int ib = 0 ;; ib++) {
//			System.out.println(ib + " ");
//		}
		
		
//		for(  ;  ;  ) {
//			System.out.println("무한 루프 ");
//		}
		
		System.out.println("============");
		
		//무한루프 탈출
		
		for (int i = 0;  ; i++) {
			if(i > 10) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("=====내가 한 방법=====");
//		FOR 문을 사용해서 1부터 1000까지 4의 배수만 더한 값:         평균값 : double형식으로 
		
		int sa = 0;
		for (int i = 0; i<=1000; i += 4) {
			sa += i;
		}System.out.println(sa);
		
		//for 문을 사용해서 평균값 
		
		double va = 0;
		int qa = 1000/4;
		for (int i = 0; i <= 1000; i += 4) {
			va += i;
		}System.out.println(va/qa);
		
		
		System.out.println("===선생님이 알려주신 방법===");
		
		double sum12 = 0; //더한 값을 저장하는 변수
		double j = 0; 	//4의 배수를 카운트 하는 변수
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0 ) {
				sum12 += i; // sum = sum + i   // 4의 배수만 더한다.
				j++;
			}
		}
		System.out.println("합은 : " + sum12);
		System.out.println("평균은 : " + sum12 / j);
		System.out.println(j);
	}

}
