package Chap10.EX04;

// �޼ҵ� �����ε� (Method Overloading) vs �޼ҵ� �������̵�(Method Overriding)

/*
 *  1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸����� ( �Ű����� Ÿ��, �Ű����� �� )�� ���� �ش� �޼ҵ尡 ȣ��
 *  	-- ��Ӱ��� ������ ����. �����ڿ��� ���� ���ȴ�.
 *  2. �޼ҵ� �������̵� : �ݵ�� ��� ���迡�� ��� 
 *  	�θ��� �޼ҵ带 ���Ӱ� �����ؼ� ���
 *  	1. ��Ӱ��� / 2. �޼ҵ��� �ñ״�ó�� ���ƾ� �Ѵ�. (�޼ҵ��, �Ű����� Ÿ��, �Ű����� ��)
 *  	3. �ڽĿ��� �θ��� ���������ڿ� ���ų� �� ���� �������� �Ѵ�.
 */		

class Ab{
	void print1(int bn) {			// ���� ���̵�
		System.out.println(" Ab Ŭ������ print1() ");
	}
	void print2() {			// ���� �ε�
		System.out.println(" Ab Ŭ������ print2() ");
	}
}

class Bc extends Ab{
	@Override
	void print1(int a) {
		System.out.println("Bc Ŭ������ print1");
	}
	
	void print2 (int a) { 		// �����ε�
		System.out.println("Bc Ŭ������ print2");
	}
}

public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. A Ÿ�� ����
		
		Ab aa = new Ab();
		aa.print1(0); 			// Ab Ŭ������ print1 ȣ��
		aa.print2();			// Ab Ŭ������ print2 ȣ��
		System.out.println("=============================");
		
		// 2. BcŸ�� ����, ������ ȣ�� Bc
		Bc bb = new Bc();
		bb.print1(0); 		// Bc Ŭ������ print1 ȣ��
		bb.print2(); 		// Ab Ŭ������ print2() ȣ�� : �θ�Ŭ������ �޼ҵ� ȣ��
		bb.print2(3); 		// Bc Ŭ������ print2(3) ȣ�� : �ڽ� Ŭ������ �޼ҵ� ȣ��
		
		// 3. AbŸ������ ���� + BC Ÿ�� ������ ȣ��
		Ab cc = new Bc();
		cc.print1(0); 		// �޼ҵ� �������̵��� �Ǿ������Ƿ� ���� ���ε��� ���ؼ� Bc�� print1�� ȣ��
		cc.print2(); 		// AbŬ������ �޼ҵ常 ȣ���� ����
		
		
	}

}
