package Ex;

import java.util.Scanner;

public class Ex_12 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ����(0) ����(1) ��(2) ������ �մϴ�");
		int user = sc.nextInt();
		if(user == 0) {
			System.out.println("����� = ����");
		}
		if(user == 1) {
			System.out.println("����� = ����");
		}
		if(user == 2) {
			System.out.println("����� = ��");
		}
		
		int com = (int)(Math.random()*3);
		if(com ==0) {
			System.out.println("��ǻ�� = ����");
		}
		if(com == 1) {
			System.out.println("��ǻ�� = ����");
		}
		if(com == 2) {
			System.out.println("��ǻ�� = ��");
		}
		
		if((com-user == -2)||(com-user == 1)){
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		if(com-user == 0) {
			System.out.println("�����ϴ�.");
		}
		if((com-user == 2)||(com-user == -1)) {
			System.out.println("����ڰ� �̰���ϴ�.");
		}
		
		
		
	
		
		
	}

}
