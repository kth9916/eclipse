package chap06_07.Ex06;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		System.out.println("임의의 운동의 이름을 넣고 해당 운동 구성원(명수)를 넣으세요");
		
		int sum = 0;
		String sports = dc.nextLine();
				
		String[] array1 = sports.split(" ");
		
		System.out.println("출력 >>");
		for(int i = 0; i < array1.length; i+=2) {
			System.out.printf("%s : %s , ",array1[i], array1[i+1]);}
		for(int i = 0; i < array1.length; i++) {
			if(i%2 == 1) {
				sum = sum + Integer.parseInt(array1[i]);
			}
			else if(sports.equals("그만")) {
				dc.close();
				System.out.println("프로그램을 종료합니다.");
			}
		}
			System.out.println();
			System.out.println("운동종목의 구성원 총 합계 : " + sum);

		int a = array1.length;
		int b = a/2;
		System.out.println("운동종목의 평균 구성원 수 : " + (sum/b));
		
		
		}
		
	}


