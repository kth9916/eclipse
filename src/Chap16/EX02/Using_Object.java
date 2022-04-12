package Chap16.EX02;

// Generic ��� �� ������
// Object�� ��� ��ü�� ������ �� �ִ�.
// ��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ� ��� ��ü�� ���� �� �ִ�.
// Object�� ���� : ��� ��ü�� ���� �� �ִ�.(casting)
		// ���� : �Ź� �ٿ� ĳ������ �ؼ� ����ؾ� �Ѵ�.
		//		���� Ÿ�� üũ : ����� ClassCastException�� �߻��� �� �ִ�.

class Apple{		// ��� Ŭ���� , ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple(String name, int price){ // ������
		this.name = name;
		this.price = price;
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
	@Override
	public String toString() {		// ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���.
		return "�̸� : " + name + " , ���� : " + price;
	}
}

class Goods2 { 	// Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
	
	private Object object = new Object(); 		// Object : ��� Ŭ������ Object Ÿ������ ��ȯ

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {		// Object Ÿ������ ��ĳ���õ�.
		this.object = object;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		
		// 1. Apple�� ���� �� ���. Object
		Goods2 goods1 = new Goods2();
		goods1.setObject(new Apple("���3", 4000)); 		// setter�� ���� �Ҵ�.
		System.out.println((Apple)goods1.getObject());			// getter�� ��ü�� ��� : Object === > Apple
		
		// 2. pencil�� ���� �� ���. Object
		Goods2 goods2 = new Goods2();
		goods2.setObject(new Pencil("����3", 4000));
		System.out.println((Pencil)goods2.getObject());
		
		// 3. �߸��� ĳ������ �� �� �ִ�(���� Ÿ�� üũ) : Object
		Goods2 goods3 = new Goods2();
		goods3.setObject(new Apple ("���4", 5000));
		System.out.println((Pencil)goods3.getObject()); 		// ���� Ÿ�� üũ : ����� ���� �߻�
	}

}
