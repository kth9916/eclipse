package chap06_07.Ex06;

import chap06_07.Ex05.External_Abc;

public class Bcd{ 		// �θ� Ŭ����
	public int a = 10;
	protected int b = 20;	// �ڽ� Ŭ�������� ������ ���� (�ٸ� ��Ű������)
	int c = 30;
	private int d = 40;
	
	// Bcd(){} 	 <== �⺻ ������ : �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����,  
	
	
	public void print1() {
		System.out.println("�ٸ� ��Ű������ ���� ���� : public ");
	}
	protected void print2() {
		System.out.println("�ٸ� ��Ű������ ���� ����(��Ӱ��谡 ������ ��) : protected ");
	}
	void print3() {
		System.out.println("���� ��Ű������ ���� ���� : default ");
	}
	private void print4() {
		System.out.println("���� Ŭ�������� ���� ���� : private ");
	}
}
