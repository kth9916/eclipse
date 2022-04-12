package Chap14.EX03;

// �������� Exception�� ���ÿ� �߻��� ��� ó��

public class MultiCatch_1 {

	public static void main(String[] args) {
		
		// 1. ���� Exception ó�� try-catch�� ó��
		// ArithmeticException
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			//catch ����� �ƹ� ������ ��� ����ó��
			System.out.println("�������(ArithmeticException)");
		}
		
		
		// NumberFormatException
		try {
		int num = Integer.parseInt("10A");
		}catch(NumberFormatException e) {
			System.out.println("���� ���(NumberFormatException)");
		}
		
		System.out.println("==========================================");
		
		// 2. ���� Exception ó��
		
		
		try { 		// try ������� ���� ���ܰ� �߻��� ���
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("0 ArithmeticException �߻�");
		}catch (NumberFormatException e) {
			System.out.println("1 NumberFormatException �߻�");
		} 
		
		System.out.println("==================================");
		// 3. ���� Exception ó�� 2
		
		try {
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("���� ���� ó��");
		}

		
		
		System.out.println("���α׷� ����");
	}

}
