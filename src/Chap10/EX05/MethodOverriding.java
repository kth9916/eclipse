package Chap10.EX05;

class A {
	A (){}
	// �ν��Ͻ� �޼ҵ� : ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵��ȴ�.
		// ��Ӱ��迡�� �ν��Ͻ� �ʵ�, static �ʵ�, static �޼ҵ�� �������̵� ���� �ʽ��ϴ�.
		// �������̵� �� ���� �ñ״�ó�� ���ƾ� �Ѵ�. ����Ÿ��, �޼ҵ��, �Ű����� Ÿ��, �Ű����� ���� 
	
	void print() {
		System.out.println("Class A ���");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("Class B ���");
	}
}

class C extends A{
	@Override
	void print() {
		System.out.println("Class C ���");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// 1. A Ÿ��, A ������
		A a = new A();
		a.print();
		// 2. B Ÿ��, B ������
		B b = new B();
		b.print();
		// 3. C Ÿ��, C ������
		C c = new C();
		c.print();
		
		// 4. A Ÿ��, B ������ ( �������̵� �Ǿ� A�� print() ȣ���, B�� print()�� �۵��ȴ� )
		A ab = new B();
		ab.print(); 		// A�� print() �޼ҵ� ȣ�� ===> B�� print()�� ��µ�.
		
		A ac = new C();
		ac.print();
		
		System.out.println("========= For ===========");
		A[] arr = {ab, ac} ; 	// �迭�� A Ÿ���� ��ü�� ����
		
		for ( int i = 0; i < arr.length ; i++) {
			arr[i].print();
		}
		System.out.println("======= Enhanced For =======");
		for (A k : arr) {
			k.print();
		}

	}

}
