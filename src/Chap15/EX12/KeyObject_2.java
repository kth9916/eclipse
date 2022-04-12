package Chap15.EX12;

class A{}
class B{}
class C{}

class MyData{ 	// ���� ��ü : ���� �����尡 ���� ��ü�� ����
	
	// ����ȭ�� �޼ҵ�� Key���� ��� this�� �ڵ����� ���, ������ �Ұ���. 
		// ����ȭ �޼ҵ�� Key ���� ���� �� ����.
		// �ϳ��� �����尡 ������ �� Key�� ������ ����ȭ�� �޼ҵ带 ���� �����ϴ�.
		// Key�� ��ü�� Ű�� ����� �� �ִ�.
	// ����ȭ ���� Key ���� ���Ƿ� �Ҵ� �����ϴ�.

	synchronized void abc() { 	// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		try {Thread.sleep(10);} catch (InterruptedException e1) {} 		// 0.01�� ������
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1�� ������
		}
	}
	synchronized void bcd() { 	// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		try {Thread.sleep(20);} catch (InterruptedException e1) {} 		// 0.01�� ������
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1�� ������
		}
	}
	void cde() { 	// 
		synchronized(new Object()) { 	// ������ Ű�� ���� : ������ Ű , �����尡 �����ϴ� Ű, ��ü ����, 
			try {Thread.sleep(30);} catch (InterruptedException e1) {} 		// 0.01�� ������
			for(int i = 0; i < 3; i++) {
				System.out.println(i + "��°");
				try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1�� ������
			}
		}

	}
}

public class KeyObject_2 {

	public static void main(String[] args) {
		MyData myData = new MyData();
		
		// �� ���� �����尡 ������ �޼ҵ� ȣ��
		new Thread() { 					// �͸�Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.abc();			// ù ��° ������ : abc() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() { 					// �͸�Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.bcd();			// �� ��° ������ : bcc() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() { 					// �͸�Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.cde();			// �� ��° ������ : cde() �޼ҵ� ȣ��
			};
		}.start();
	}

}
