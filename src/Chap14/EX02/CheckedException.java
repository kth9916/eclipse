package Chap14.EX02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//Checked Exception (�Ϲ� ����) : ������ �ܰ迡�� ���ܰ� �߻�.
// 	�������ϱ�(����) *.java ==> *.class , �����ϱ� ����  

// unChecked Exception (���࿹��), Runtime Exception : ����ÿ� ���ܰ� �߻��� �� �ִ�. 
	// ���� �ʼ��� �ƴ����� ���� ó��

class A {
	B b; 		// b = null
	A(){} 	// �⺻ ������
	A(B b){
		this.b = b;
	}
	
	interface B { 		// �������̽� ����
		void cry();
	}
	void abc() {
		b.cry();
	}
}

public class CheckedException {

	public static void main(String[] args) {
		// 1. �Ϲ� ����
		
		// InterruptedException	: ������ �߰��� �����Ⱑ �߻��ϸ� ���ܰ� �߻�
		// Thread.sleep(1000);
		
		// ClassNotFoundException : Ŭ������ ã�� ���ϴ� ���� 
		// Class clas = Class.forName("java.lang.object");
		
		// IOException : ��Ʈ��ũ���� ����(����) ���о� �� �� �ִ� ����
		// System.in : �ܼ��� ����
		InputStreamReader in = new InputStreamReader(System.in);
		// in.read();
		
		// FileNotFoundException : ������ ã�� ���ϴ� ���ܰ� �߻� �� �� �ִ�.
		// FileInputStream fis = new FileInputStream("text.txt");
		
		// 2. ���� ����(unChecked Exception) ����ÿ� �߻��Ǵ� ����
		
		// NullPointerException : ��ü�� Null�� ���¿��� ��ü�� �ʵ峪 �޼ҵ� ȣ��
		A a1 =new A();
		a1.abc(); 			// ������ �ܰԿ����� ���ܰ� �߻����� �ʰ� ����ÿ� �߻�
		
	}

}
