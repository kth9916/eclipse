package chap06_07.Ex06;

import chap06_07.Ex05.D;

// ctrl + shift + o
							// class�� ���� �����ڰ� public

public class Ex_C {

	public static void main(String[] args) {
		
		// �ٸ� Ŭ������ ������ / public�� ���� / model, color �޸𸮷� ���� �Ұ�
		// model�� color�� setter�� public ���ؼ� �Ҵ� �� ���
		
		D cc2 = new D();
		
		//company, model, color�� �ٸ� ��Ű������ ���� �Ұ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ����
		cc2.maxSpeed = 290; //�ٸ� ��Ű���� Ŭ���������� public, protected(��� ����)
		
		//setter�� ���ؼ� �޸��� ���� �ο�.
		cc2.setColor("����");
		cc2.setModel("����");
		cc2.setMaxSpeed(300);
		
		cc2.print();
		
		
	}

}
