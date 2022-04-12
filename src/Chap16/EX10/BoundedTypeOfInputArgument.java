package Chap16.EX10;

// ���ʸ� �޼ҵ忡�� �Ű����� ���� ����

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{ 		// ���ʸ� Ŭ����
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test{ 		// �Ϲ� �޼ҵ��, �Ű������� ������ Ÿ���� ���ʸ� Ÿ��
	void method1 (Goods<A> g) {} 			// g�� �Ű������� A Ŭ���� Ÿ�Ը� ����
	void method2 (Goods<?> g) {} 			// g�� �Ű������� ��� Ŭ���� Ÿ�� ���� ����
	void method3 (Goods<? extends B> g) {} 	// g�� �Ű������� B,C,D Ŭ���� Ÿ�Ը� ���� 
	void method4 (Goods<? super B> g) {}	// g�� �Ű������� A,B Ŭ���� Ÿ�Ը� ����
}

public class BoundedTypeOfInputArgument {
	public static void main(String[] args) {
		Test t = new Test();
		
		// 1. Method1 
		t.method1(new Goods<A>());			// ���� �۵�
//		t.method1(new Goods<B>()); 			// ����
//		t.method1(new Goods<C>());			// ����
//		t.method1(new Goods<D>());			// ����
		
		// 2. Method2 
		t.method2(new Goods<A>());			// ���� �۵�
		t.method2(new Goods<B>()); 			// ���� �۵�
		t.method2(new Goods<C>());			// ���� �۵�
		t.method2(new Goods<D>());			// ���� �۵�
		
		// 3. Method3 (Goods<? extends B> g) {} : B,C,D
//		t.method3(new Goods<A>());  		// ����
		t.method3(new Goods<B>()); 			// ���� �۵�
		t.method3(new Goods<C>());			// ���� �۵�
		t.method3(new Goods<D>());			// ���� �۵�
		
		// 4. Method4 (Goods<? super B> g) {} 	: B,A
		t.method4(new Goods<A>());  		// ���� �۵�
		t.method4(new Goods<B>()); 			// ���� �۵�
//		t.method4(new Goods<C>());			// ����
//		t.method4(new Goods<D>());			// ����
	}

}
