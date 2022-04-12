package chap18.EX03;

import java.util.Scanner;

// 1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ �޽��ϴ�.
// 2. ��� 1. ���ٽ��� ����ؼ� ��ǲ���� �� ���� +,-,*,/ ��Ģ������ �����ؼ� ���.
// 3. ��� 2. �������̽��� ������ �ڽ� ��ü ����ؼ� ��ǲ���� �� ���� +,-,*,/ ��Ģ������ �����ؼ� ���.
// 4. ��� 3. �͸� �̳�Ŭ������ ����ؼ� ��ǲ���� �� ���� +,-,*,/ ��Ģ������ �����ؼ� ���
// 5. AritimeticException ó�� : 0���� ������ ���� �߻��� �ǹǷ� ���� ó��, int(0) , double <<== �ش� ������ �ƴ�

@FunctionalInterface
interface Arithmetic{
	double arithmetic(double a, double b);
}

class Plus implements Arithmetic{

	@Override
	public double arithmetic(double a, double b) {
		return a + b;
	}
}

class Minus implements Arithmetic{
	public double arithmetic(double a, double b) {
		return a - b;
	};
}

class Multiple implements Arithmetic{
	@Override
	public double arithmetic(double a, double b) {
		return a * b;
	}
}

class Divide implements Arithmetic{
	public double arithmetic(double a, double b) {
		return a/b;
	};
}

public class ArithmeticOperation {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// ��� 1
		System.out.println("--------------------------");
		System.out.println("��� 1");
		System.out.println("--------------------------");
		System.out.println("ù ��° double�� �Է��ϼ���");
		double sc1 = sc.nextDouble();
		System.out.println("�� ��° double�� �Է��ϼ���");
		double sc2 = sc.nextDouble();
		
		
		Arithmetic a1 = (a,b) -> {return a + b;};	
		System.out.println(a1.arithmetic(sc1, sc2));
		Arithmetic a2 = (a,b) -> {return a - b;};	
		System.out.println(a2.arithmetic(sc1, sc2));
		Arithmetic a3 = (a,b) -> {return a * b;};	
		System.out.println(a3.arithmetic(sc1, sc2));
		Arithmetic a4 = (a,b) -> {return a / b;};	
		System.out.println(a4.arithmetic(sc1, sc2));
		
			
		
		// ��� 2
		System.out.println("--------------------------");
		System.out.println("��� 2");
		System.out.println("--------------------------");
		
		System.out.println("ù ��° double�� �Է��ϼ���");
		double sc3 = sc.nextDouble();
		System.out.println("�� ��° double�� �Է��ϼ���");
		double sc4 = sc.nextDouble();
		
		Arithmetic a5 = new Plus();
		System.out.println(a5.arithmetic(sc3, sc4));
		Arithmetic a6 = new Minus();
		System.out.println(a6.arithmetic(sc3, sc4));
		Arithmetic a7 = new Multiple();
		System.out.println(a7.arithmetic(sc3, sc4));
		Arithmetic a8 = new Divide();
		System.out.println(a8.arithmetic(sc3, sc4));
		
		// ��� 3
		System.out.println("--------------------------");
		System.out.println("��� 3");
		System.out.println("--------------------------");
		
		System.out.println("ù ��° double�� �Է��ϼ���");
		double sc5 = sc.nextDouble();
		System.out.println("�� ��° double�� �Է��ϼ���");
		double sc6 = sc.nextDouble();
		
		Arithmetic a9 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a+b;
			}
		};
		Arithmetic a10 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a-b;
			}
		};
		Arithmetic a11 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a*b;
			}
		};
		Arithmetic a12 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a/b;
			}
		};
		
		System.out.println(a9.arithmetic(sc5, sc6));
		System.out.println(a10.arithmetic(sc5, sc6));
		System.out.println(a11.arithmetic(sc5, sc6));
		System.out.println(a12.arithmetic(sc5, sc6));
	}

}
