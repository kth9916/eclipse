package chap06_07.Ex06;



import java.util.Scanner;



public class Test {
	

	
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 운동의 이름을 넣고 해당 운동 구성원(명수)를 넣으세요");
		
		int sum = 0;
		String sports = sc.nextLine();
				
		String[] array1 = sports.split(" ");
		
		
		System.out.println("출력 >>");
		for(int i = 0; i < array1.length; i+=2) {
			System.out.printf("%s : %s , ",array1[i], array1[i+1]);
		}
		
		for(int i = 1; i<array1.length; i+=2) {
				sum = sum + Integer.parseInt(array1[i]);	
		}
		System.out.println();
		System.out.println("운동종목의 구성원 총 합계 : " + sum);
		int a = array1.length;
		int b = a/2;
		System.out.println("운동종목의 평균 구성원 수 : " + (sum/b));
		
		if(sc.equals("그만")) {
			sc.close();
			System.out.println("프로그램을 종료합니다.");
		}
		
		
		
		
	}

}
