package chap06_07.Ex01;

// Ŭ����(class) : ��ü�� �����ϱ� ���� Ʋ(���ø�), ���赵, �ؾ�� Ʋ
// ��ü(object) : Ŭ������ �����ؼ� �޸𸮿��� �۵��Ǵ� �����ڵ� (��, �ؾ)
		// ��ü = �ν��Ͻ�
		// �ν��Ͻ�ȭ (��üȭ) ��Ų�� (���� �޼ҵ忡�� ��ü�� �ν��Ͻ�ȭ ������� �Ѵ�.
		// A a = new A(); 		<== Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�

class A { 		//�ܺ� Ŭ����
	int m = 3;					// �ʵ� (����) : Ŭ����������� ����� ������ �ʵ�� ȣĪ
								// �ʵ�� �ν��Ͻ�ȭ(��ü) ���Ѿ� ����� ����
								// �ʵ�� �޸��� Heap ������ ����
	
	void print() {		// �޼ҵ� : ������������ �Լ�, ��ü������� �Լ��� �޼ҵ�� ȣĪ
		System.out.println("��ü ���� �� Ȱ��");
	}
}

class B {		// �ܺ� Ŭ����
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-1111";
	
	 void printName() {
		 System.out.println(name);
	 }
	 void printAge() {
		 System.out.println(age);
	 }
	 void printPhone() {
		 System.out.println(phone);
	 }
	
}


public class CreateObjectAndUsingOfMember {
	public static void main(String[] args) {
		
		
		A a = new A();		// Class A�� ��üȭ(�ν��Ͻ�ȭ) ��Ų��. (RAM�� �ε��Ų��)
		System.out.println(a.m);
		a.print();
		
		System.out.println("===================");
		
		A b = new A();		// Class A�� ��üȭ(�ν��Ͻ�ȭ) ���Ѽ� RAM�� �ε�
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("==================");
		
		B bb = new B();		// B Class�� bb��� �̸����� ��üȭ ��Ų��
		bb.printName();
		bb.printAge();
		bb.printPhone();
		
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
	}

}
