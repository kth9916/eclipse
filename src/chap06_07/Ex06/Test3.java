package chap06_07.Ex06;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
//		임의의 운동의 이름을 넣고 해당 운동의 구성원(명수)를 넣어서 출력하는 프로그램을 작성 후, 전체 합 및 평균을 구하는 프로그램을 작성하세요.
//
//		예)
//		입력 >>
//		탁구 2 야구 9 축구 11 농구 6 씨름 2 ............  // nextline() asdf.split( )
//
//		출력 >>
//		탁구 : 2 , 야구 : 9 , 축구 : 11 , 농구 : 6, 씨름 : 2
//		운동종목의 구성원 총 합계 : XX
//		운동종목의 평균 구성원수 : X
//
//		"그만"이라고 입력 하면 프로그램 종료
		
		Scanner ed = new Scanner(System.in);
		System.out.println("임의의 운동의 이름을 넣고 해당 운동 구성원(명수)를 넣으세요");
		
		int sum = 0;
		
				
		
		
	while(true) {
		System.out.println();
		System.out.println("출력 >>");
		String sports = ed.nextLine();
		String[] array1 = sports.split(" ");
		if(sports.equals("그만")) {
			break;
		}
		
		for(int i = 0; i < array1.length; i+=2) {
			if(i<array1.length-2) {
				System.out.printf("%s : %s명 , ",array1[i], array1[i+1]);
			}else {
				System.out.printf("%s : %s명  ",array1[i], array1[i+1]);}
		}
		for(int i = 0; i < array1.length; i++) {
			if(i%2 == 1) {
				sum = sum + Integer.parseInt(array1[i]);
			}
		}
			System.out.println();
			System.out.println("운동종목의 구성원 총 합계 : " + sum);

		int a = array1.length;
		int b = a/2;
		System.out.println("운동종목의 평균 구성원 수 : " + (double)sum/b);
		
		

	}
	ed.close();
	System.out.println("프로그램을 종료합니다.");
	}
}
