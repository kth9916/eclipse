package chap04;
public class Swithch_Ex02 {
	public static void main(String[] args) {
		
		// 1. Switch ������ Break�� ó�� ���� �ʾ��� �� : �ش� case�� �̵��� �� switch ���� ���������� �ʰ� ������ case�� ��� �����Ѵ�.
		
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A ����");
		case 2:
			System.out.println("B ����");
		case 3:
			System.out.println("C ����");
		default :
			System.out.println("F ����");
		}
		
		System.out.println("=======");
		
		// 2. break�� ���Ե� ���
		
		int value2 = 3;
		switch(value2) {
		case 1:
			System.out.println("A ����");
			break;
		case 2:
			System.out.println("B ����");
			break;
		case 3:
			System.out.println("C ����");
			break;
		default :
			System.out.println("F ����");		//switch�� ������ case(default)�� break�� ���� ����
		}
		
		System.out.println("=======");
		
		//if�� ���������� ������ break�� �ʿ� ����.
		
		value2 = 5;
		
		if (value2 == 1) {
			System.out.println("A ����(if)");
		}else if (value2 == 2){
			System.out.println("B ����(if)");
		}else if (value2 == 3) {
			System.out.println("C ����(if)");
		}else {
			System.out.println("F ����(if)");
		}
		
		System.out.println("=============");
		
		/*
		 * switch�� ����ؼ� ������ 7�� �̻��� pass, 7�� ���ϴ� fail�� ��� (���� : 1 ~ 10)
		 */
		
		int a = 1;
		
		switch (a) {
		case 10: // System.out.println("pass");
				//	break; 
				// ���� ������ �� �־��. ���� �ʿ䰡 ��� ������ ��.
		case 9:
		case 8:
		case 7:
			System.out.println("pass");
			break;
		default :
			System.out.println("fail");
		}
	}

}
