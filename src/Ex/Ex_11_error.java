package Ex;

import java.util.Scanner;

public class Ex_11_error {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸�");
		
		
		String course[] = {"Java", "C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		
		
		String input = sc.nextLine();
		for(int i = 0; i < course.length; i++) {
		if(course[i].equals(input)) {
			System.out.println(course[i] + " �� ������ " + score[i]);
		}
		else if(course[i]!=input){
			System.out.println("���� �����Դϴ�.");
			break;
		}
		else if(input == "�׸�") {
			sc.close();
			return;
			
		}
		}
		sc.close();
		
		}
	
		
		}
		
	
