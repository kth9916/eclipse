package Ex;

import java.util.Scanner;

public class Ex_11_error {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 이름");
		
		
		String course[] = {"Java", "C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		
		
		String input = sc.nextLine();
		for(int i = 0; i < course.length; i++) {
		if(course[i].equals(input)) {
			System.out.println(course[i] + " 의 점수는 " + score[i]);
		}
		else if(course[i]!=input){
			System.out.println("없는 과목입니다.");
			break;
		}
		else if(input == "그만") {
			sc.close();
			return;
			
		}
		}
		sc.close();
		
		}
	
		
		}
		
	
