package Chap16.EX05;

class Apple{		// ��� Ŭ���� , ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple(String name, int price){ // ������
		this.name = name;
		this.price = price;
	}
	public void abc() {
		System.out.println("abc �޼ҵ� ���");
	}
	@Override
	public String toString() {		// ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���.
		return "�̸� : " + name + " , ���� : " + price;
	}
}

class Pencil{		// ���� Ŭ����
	String name;
	int price;
	Pencil(String name, int price){		// �����ڸ� ���ؼ� �ʵ��� ���� �Ҵ�
		this.name = name;
		this.price = price;
	}
	public void bcd() {
		System.out.println("bcd �޼ҵ� ���");
	}
	@Override
	public String toString() {		// ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���.
		return "�̸� : " + name + " , ���� : " + price;
	}
}

// ���ʸ��� ����ؼ� ��ü�� ���� �� �� �о� ����.

// ���ʸ� Ŭ����
class Goods2<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Object_Generic {

	public static void main(String[] args) {
		Goods2<Apple> goods1 = new Goods2<Apple>(); 		// goods1�� Apple ������ Ÿ���̴�.
		goods1.setT(new Apple("���1", 1000));
		System.out.println(goods1.getT()); 		// ���ʸ������� �ٿ� ĳ������ �� �ʿ䰡 ����.
		goods1.getT().abc(); 	// �ٿ� ĳ���� ���� Apple ��ü�� abc �޼ҵ� ȣ��
		
		Goods2<Pencil> goods2 = new Goods2<Pencil>();
		goods2.setT(new Pencil("����1", 1000));
		System.out.println(goods2.getT());
		goods2.getT().bcd();
	}

}
