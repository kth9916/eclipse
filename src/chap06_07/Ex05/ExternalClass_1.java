package chap06_07.Ex05;

class B { 		// �ܺ� Ŭ���� : public�� �� �� ����. default�� ����
				// �ٸ� ��Ű���� Ŭ���������� ������ �Ұ�, ���� ��Ű�� �������� ���� ����
	
	private int a = 1; 			// private : ���� Ŭ���� �������� ��� ����
	int b = 2; 					// default : ���� ��Ű������ �ٸ� Ŭ�������� ���� ����
	protected int c = 3 ;		// protected : default ���� + �ٸ���Ű���� ���� ���� (��ӵ� ��츸 ����)
	public int d = 4;			// public : �ٸ� ��Ű������ ������ ���� 
	
		// private < default < protected < public
	
	private void print1() { 	// ���� Ŭ������ �����ϴ� �޼ҵ�; 
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() { 	// ���� Ŭ������ �����ϴ� �޼ҵ�; 
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() { 	// ���� Ŭ������ �����ϴ� �޼ҵ�; 
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() { 	// ���� Ŭ������ �����ϴ� �޼ҵ�; 
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	
}

class C {
	
	
	
}

public class ExternalClass_1 {

	public static void main(String[] args) {
		
		B b = new B(); 			// default ���������ڰ� class �̸��� �Ҵ�/ ���� Ŭ������ �����ϹǷ� B class�� ������ �� �ִ�.
		
		Bb bb = new Bb(); 		// public ���� ������, ���� ��Ű�� ������ ����
		
		// ���� ��Ű���� �ٸ� Ŭ�������� ���� 
		
		//�ʵ� ����
//		bb.a = 10; 		// private : Ŭ���� ���ο����� ��� ����, ���� �߻� : ������ �Ұ�
		bb.b = 20;		// default : ���� ��Ű���� Ŭ�������� ������ ���
		bb.c = 30; 		// protected : default ���� + �ٸ� ��Ű���� Ŭ�������� ���� ��� (��� ������ ��)
		bb.d = 40;		// public : protected�� ���� + �ٸ� ��Ű������ ���� ����
		
		//�޼ҵ� ����
//		bb.print1(); 	// private 		: ���� �߻�, Ŭ���� ���ο����� ��� ����
		bb.print2();	// default
		bb.print3();	// protected
		bb.print4();	// public
		
		
		
	}

}