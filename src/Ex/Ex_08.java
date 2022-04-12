package Ex;

import java.util.Scanner;

public class Ex_08 {
	public static void main(String[] args) {
		//[문항 8] 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원 동전, 100원 동전
		//50원 동전, 10원 동전, 1원 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		
		int input = sc.nextInt();	//스캐너로 인풋 받을 돈을 저장하는 변수
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	// 환산할 돈의 종류를 배열에 저장
		for(int i = 0; i < unit.length; i++) {
				System.out.println(unit[i] + "원 짜리 : " + input/unit[i] + "개");
				input -=  (unit[i]*(input/unit[i]));
		}
		sc.close();

	}

}
