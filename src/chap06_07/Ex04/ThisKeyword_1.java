package chap06_07.Ex04;

/* ������ this Ű���� �ڵ� �߰� */
// 1. Ŭ���� ���ο��� �ʵ�, �޼ҵ� �տ� �ڵ����� this Ű���尡 ����
		// this Ű�� ��ü�� �ʵ�� ��ü�� �޼ҵ带 ��Ī

class A{
	int m;
	int n;
	
	void init(int a , int b) {
		int c;				// a, b, c �� ���� ���� (stack ������ ������� ���� ������)
		c = 3;				// init() �޼ҵ� �����ÿ� stack�����ǰ� �޼ҵ尡 ������ �Ҹ�
		this.m = a; 		//this Ű�� ������, �����Ϸ��� �ڵ����� �߰�
		this.n = b;
		
	}
	
	void work() {
		this.init(2,3); 	// this Ű�� ������, �����Ϸ��� �ڵ����� this �߰�
		System.out.println(this.m + " , " + this.n ); 	// this�� ���� ����, ������ �����Ϸ��� �ڵ����� ����
	}
}

public class ThisKeyword_1 {

	public static void main(String[] args) {
		// 2. ��ü ����
		A a = new A();
		
		// 3. �ż��� ȣ��
		a.work();
		
	}

}
