package Chap13.EX08;

// Ŭ���� ���� �� ���� ������ ��� / �̻���� ��� �Ű������� ��ü�� ����

interface A{
	public abstract void abc();
}

//1. �ڽ� Ŭ������ ���� ����
class B implements A{
	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}

class C{		// cde �޼ҵ忡 ��ǲ������ AŸ���� ��ü a�� �޴´�.
	void cde(A a) { 	// cde�� ȣ���ϸ鼭 �Ű������� AŸ���� ��ü�� ����
		a.abc();
	}
}

public class AnonimousClass_3 {

	public static void main(String[] args) {
		// ù ���� ��� : Ŭ������ O + ���� ������ O
		C c = new C(); 		
		
		A a = new B(); 	// ���� ���� ����
		
		c.cde(a); 	// �Ű������� ��ü a�� �����ؼ� ������
		
		System.out.println("======================");
		
		// �� ��° ��� : Ŭ���� �� O + ���������� X
		c.cde(new B());
	}

}
