package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int nu = 0;			// ��ĳ�ʷ� ��ȣ�� ��ǲ�޴� ����
		
		
		do {
			System.out.println("============================");
			System.out.println(" 1. 19�� ��� | 2. Ȧ���ܸ� ��� | 3. 3�� ����ܸ� ��� | 4. ���α׷� ����");
			System.out.println("==============================");
			System.out.println("��ȣ�� �Է����ּ���.");
			nu = sc.nextInt();
			
			if(nu == 1) { 	// ��ĳ�ʿ��� 1���� �������� �� ���� for ���� ����ؼ� 19�� ���
				for(int i = 1; i < 20; i++) {
					for(int j = 1; j < 20; j++) {
						System.out.println(i + " X " + j + " = " + i*j);
					}
					continue ;
				}
			} else if(nu == 2) { 	// Ȧ���ܸ� ���
				for(int i = 1; i < 20; i+=2) {
					for(int j = 1; j < 20; j++) {
						System.out.println(i + " X " + j + " = " + i*j);
					}
					continue;
				}
			} else if(nu == 3) { 	// 3�� ����ܸ� ���
				for(int i = 3; i < 20; i+=3) {
					for(int j = 1; j < 20; j++) {
						System.out.println(i + " X " + j + " = " + i*j);
					}
					continue;
				}
			} else if(nu == 4) { 	// ���α׷� ����
				break;
			}
			
			
		} while(run);
		
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
