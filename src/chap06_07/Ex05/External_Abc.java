package chap06_07.Ex05;

import chap06_07.Ex06.Bcd; 		// ctrl + shift + o : �ڵ� import

//import chap06_07.Ex06.Abc; 	// Abc class�� ���������ڰ� default : �ܺ���Ű������ ������ �Ұ� 

public class External_Abc extends Bcd {  		// External_Abc Ŭ������ BcdŬ������ ��� ����
			// �θ� Ŭ���� : Bcd, �ڽ� Ŭ���� : External_Abc
	
	public static void main(String[] args) {
		
//		Abc abc2 = new Abc(); class ���� �����ڰ� default���� ���� �Ұ�
		
		Bcd bcd1 = new Bcd(); 					// �θ� Ŭ���� ��ü
		External_Abc ext = new External_Abc(); // �ڽ� Ŭ����
		
		// �ٸ� ��Ű������ �ʵ� ȣ�� : 1. import(public : Ŭ���� ���� ������) / 2. ��ü ���� 3. ���� ������ Ȯ�� �� ���� ( �ʵ�, �޼ҵ� )
		
		bcd1.a = 1000; 	// public : �ٸ� ��Ű������ ���� ����
//		bcd1.b = 2000; 	// protected : �ٸ� ��Ű������ ��� ���迡 ���� �� ���� ����
		ext.b = 2000;	// �ڽ� Ŭ�������� �θ� Ŭ������ protected�� �ٸ� ��Ű������ ����(��� ����)
	}

}