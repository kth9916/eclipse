package Chap10.EX03;

// instanceof : ��ü ������ ĳ������ �������� ���θ� �� �� �ֵ��� �ϴ� Ű����
	// ��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� True, False�� ����
	// �ٿ�ĳ���ý� ��Ÿ�� ������ �߻��� �� �ִ�. ��Ÿ�� ������ ���� �����ش�
	// �ٿ�ĳ���ý� �ش� Ÿ���� ��ü�� ���� �� �� �ٿ�ĳ���� �ϵ��� ����

class A{
	int m;
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println("n : " + n);
	}
}

public class InstanceOf {

	public static void main(String[] args) {
		
		// 1. instanceof	: 		��ü�� instanceof Ÿ��
		A aa = new A(); 	// aa�� AŸ�Ը� ������.
		A ab = new B();		// ab�� A, BŸ���� ���� �ְ� A�� �ʵ�� �޼ҵ常 ���(����)
		
		System.out.println(aa instanceof A); 	// true
		System.out.println(ab instanceof A); 	// true
		System.out.println(aa instanceof B); 	// false
		System.out.println(ab instanceof B); 	// true
		
		if (aa instanceof B) { 		// aa��ü�� B Ÿ���� ���ԵǾ� ���� ��쿡�� ĳ������ �Ѵ�
			B b = (B)aa; 		// ��Ÿ�ӽ� ������ ������ ����
			System.out.println("aa�� B�� ĳ���� �߽��ϴ�.");
		}else {
			System.out.println("aa�� B Ÿ������ ĳ���� �Ұ�");
		}
		
		if (ab instanceof B) { 		// ab�� BŸ���� �����ϴ� ��� �ٿ�ĳ����
			B b = (B)ab;
			System.out.println("ab�� B Ÿ������ ĳ���� �߽��ϴ�.");
			
		}else {
			System.out.println("ab�� B Ÿ������ ĳ���� �Ұ�");
		}
		
		if ("�ȳ�" instanceof String) { 		// ��ü�� ������ Ÿ���� Ȯ��,
			System.out.println("\"�ȳ�\"�� String Ŭ���� �Դϴ�. ");
		}else {
			System.out.println("\"�ȳ�\"�� String Ŭ������ �ƴմϴ�. ");
		}
		
		
		
	}

}
