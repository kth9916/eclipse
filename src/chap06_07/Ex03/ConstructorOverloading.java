package chap06_07.Ex03;

// ������ �����ε� : �ϳ��� ������ �� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ��
	// ���� ) ������Ÿ�Ե� ���� ������ ���� ��� �ΰ� �̻� ������ ����
class Abc{
	int a, b , c ;
	String d;
	
	Abc(){System.out.println(a + " , " + b + " , " + c);} //�⺻ ������
	Abc(int a){ 	// �Ű����� 1���� ������
		this.a = a;
		System.out.println(a);
	}
	
	Abc(int a, int b){  	// �Ű����� 2���� ������
		this.a = a;
		this.b = b;
		System.out.print(a + " , " + b);
		System.out.println();
	}
	
	Abc(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.print(a + " , " + b + " , " + c);
		System.out.println();
	}
	
	Abc(String d){
		this.d = d ;
		System.out.println(d);
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Abc abc = new Abc(); 		// �⺻ ������ ȣ��
		Abc abc1 = new Abc(30); 	// �Ű� ���� �ϳ��� ������ ȣ��
		Abc abc2 = new Abc("�����ڵ���"); 	// �Ű������� ���� ������ Ÿ���� �ٸ��� �ش� �޼ҵ带 ȣ��
		Abc abc3 = new Abc(10,20);
		Abc abc4 = new Abc(10,20,30);
	}

}
