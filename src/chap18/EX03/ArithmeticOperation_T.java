package chap18.EX03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ �޽��ϴ�.
//2. ��� 1. ���ٽ��� ����ؼ� ��ǲ���� �� ���� +,-,*,/ ��Ģ������ �����ؼ� ���.
//3. ��� 2. �������̽��� ������ �ڽ� ��ü ����ؼ� ��ǲ���� �� ���� +,-,*,/ ��Ģ������ �����ؼ� ���.
//4. ��� 3. �͸� �̳�Ŭ������ ����ؼ� ��ǲ���� �� ���� +,-,*,/ ��Ģ������ �����ؼ� ���
//5. AritimeticException ó�� : 0���� ������ ���� �߻��� �ǹǷ� ���� ó��, int(0) , double <<== �ش� ������ �ƴ�

// �����԰� �ٸ��� :��� 1���� ���� ������ ����� ���ߴ�.



@FunctionalInterface
interface Arithmetic2{
	void arithmeticOpr(double a, double b);
}

// 2��° ���
class ArithmeticImpl implements Arithmetic2{
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("a + b : " + (a + b) + " , " + "a - b :" + (a-b) + " , " + "a * b : " + 		(a*b) + " , " + "a / b" + (a /b)) ;
	}
}

public class ArithmeticOperation_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Ǽ��� ������ �����ؼ� �Է� �ϼ���>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		// 1. ���ٽ� : �������̽��� �߻�޼ҵ带 �͸� Ŭ������ ������ ���� ���ǥ���̴�.
		
		Arithmetic2 b1 = (x,y) -> {System.out.println("a + b : " + (x + y) + " , " + "a - b :" + (x-y) + " , " + "a * b : " + 		(x*y) + " , " + "a / b" + (x /y)) ;};
		
		b1.arithmeticOpr(a, b);
		
		// 2. �������̽��� ������ Ŭ���� ���� �� �޼ҵ� ȣ��
		Arithmetic2 b2 = new ArithmeticImpl();
		b2.arithmeticOpr(a, b);
		
		// 3. �͸� �̳� Ŭ������ ���
		Arithmetic2 b3 = new Arithmetic2() {
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("a + b : " + (a + b) + " , " + "a - b :" + (a-b) + " , " + "a * b : " + 		(a*b) + " , " + "a / b" + (a /b)) ;
			}
		};
		b3.arithmeticOpr(a, b);
		
		
	 }

}
