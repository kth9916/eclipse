package Ex;

import java.util.Scanner;

public class Ex_12 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위(0) 바위(1) 보(2) 게임을 합니다");
		int user = sc.nextInt();
		if(user == 0) {
			System.out.println("사용자 = 가위");
		}
		if(user == 1) {
			System.out.println("사용자 = 바위");
		}
		if(user == 2) {
			System.out.println("사용자 = 보");
		}
		
		int com = (int)(Math.random()*3);
		if(com ==0) {
			System.out.println("컴퓨터 = 가위");
		}
		if(com == 1) {
			System.out.println("컴퓨터 = 바위");
		}
		if(com == 2) {
			System.out.println("컴퓨터 = 보");
		}
		
		if((com-user == -2)||(com-user == 1)){
			System.out.println("컴퓨터가 이겼습니다.");
		}
		if(com-user == 0) {
			System.out.println("비겼습니다.");
		}
		if((com-user == 2)||(com-user == -1)) {
			System.out.println("사용자가 이겼습니다.");
		}
		
		
		
	
		
		
	}

}
