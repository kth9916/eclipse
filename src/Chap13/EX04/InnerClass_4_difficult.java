package Chap13.EX04; // ��ƴ� // 

// ���� �̳�Ŭ���� : Ŭ������ �޼ҵ� ���ο� ����� Ŭ����
	// �޼��� ������ �ʵ�� final Ű�� ������. ���� ���� �Ұ�
	// ���� �̳� Ŭ�������� ���Ǵ� ���� ������ �ڵ����� final�� ����. ������ �����Ϸ��� �ڵ����� �Ҵ��� ��

class A {
	int a = 3; 		// �ʵ� : Heap, �ݵ�� �ʱ�ȭ�� ������ �����
					// �ʵ��� �ʱⰪ�� �Ҵ� �Ŀ� ���� ������ ���� ��üȭ �ؼ� ���� ����
	A(){}				// �����ڳ� setter�� ���ؼ� �ʱⰪ�� �Ҵ� �Ŀ� ��ü�� ����
	A(int a){		// �����ڸ� ���ؼ� a�� �ʱⰪ �Ҵ�
		this.a=a;
	}
	public void setA(int a) { 		// setter�� ���ؼ� �ʵ��� ���� �ʱ�ȭ
		this.a = a;
	}
	
	void ccc() { 	// ���� ����  : �޼��� ������ ����, �޸��� ���ð����� ����
		int a = 3; 		// ���� ���� �ʱ� �� 3 �Ҵ�
		a = 4;			// a �����ǰ��� 4�� ����
		a = 10;			//a ������ ���� 10���� ����
		int b;
		b = 0;
		
		System.out.println(a); 		//
		System.out.println(b);		// b�� �ʱⰪ�� �Ҵ����� �ʾ���
	}
	
	
	void abc() {
		int b = 5; 	// �������� : �޼ҵ� ���ο� ����� ������ ���� �̳� Ŭ�������� ���Ǹ� final�� �����Ϸ��� ���ؼ� �Ҵ��
//		int b = 10;	
		int c = 10;	// ���� �̳� Ŭ�������� ������ ������ final�� ���� ����.
			c = 20; // �ڵ����� final Ű�� �����Ϸ��� ���ؼ� �ڵ����� �Ҵ�
		class B{	// ���� �̳� Ŭ����
			void bcd() {
				System.out.println(a); 	// �ʵ�
				System.out.println(b); 	// �������� : final�� ������. ���� �Ұ�
				a = 5;		// �ʵ�� �� ������ ����
//				b = 7; 		// ����Ŭ���� ���ο� ����� ���������� �ڵ����� final Ű�� �����Ϸ��� ���ؼ� �Ҵ��
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class InnerClass_4_difficult {

	public static void main(String[] args) {
		// 1. ��ü�� ���� �� �޼ҵ� ȣ��
		 A a = new A();
		 a.abc();
	}

}