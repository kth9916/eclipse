package chap06_07.Ex02;


// �پ��� Ÿ���� �޼ҵ� ���� (���� Ÿ���� �ִ� ��� (int, double, String....) ,
	// ���� Ÿ���� ���� ���� void Ű�� ���
public class ExternalCallMethods {

	public static void main(String[] args) {
		// ��ü����
		A a =new A();			// ���� ��Ű�� ���� Ŭ������ import ���� ȣ���ؼ� ��밡��
		
		// �޼ҵ� ȣ��
		a.print();
		int k = a.data(); 	// 3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		
		a.printMethod(5); 		// 1 ~ 12 ����
		a.printMethod(13);
		
		// ���� : 
		
		System.out.println(a.data()); 			// ��±����� ȣ�� ������ �޼ҵ� (������ �ִ� �޼ҵ�, )
//		System.out.println(a.print());			// �����߻� - print�� ������ ����
		a.print();
		System.out.println(a.sum(4, 10.5));
//		System.out.println(a.printMethod(3)); 	// �����߻� - printmethod�� ������ ����
		a.printMethod(3);
		
		
	}

}
