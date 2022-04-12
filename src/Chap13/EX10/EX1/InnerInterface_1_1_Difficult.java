package Chap13.EX10.EX1;

class A {
	B b ; 		// B : �������̽� Ÿ��, b : ���� ���� : ���� �Ҵ��ϴ� ���
				// b : null
					// 1. ��ü ���� �� ���� �Ҵ��ϴ� ���
					// 2. �����ڸ� ���ؼ� ���� �Ҵ�
					// 3. setter�� ���ؼ� ���� �Ҵ�
	
	A (){} // �⺻ ������
	A(B b){
		this.b = b;
	}
	
	public void setB (B b) {
		this.b = b;
	}
	
	interface B {
		void play();
		void stop();
	}
	
	void abc () { 		// play(); ������, stop(); ������
		b.play();
		b.stop();
	}
	
}

public class InnerInterface_1_1_Difficult {

	public static void main(String[] args) {
		A button3 = new A(); 			// A button3
		button3.setB(new A.B() {
			
			@Override
			public void stop() {
				System.out.println("��ư�� ������ �����. ");
			}
			
			@Override
			public void play() {
				System.out.println("��ư�� ������ ����ȴ�. ");
			}
		});
		
		button3.abc();
		
		System.out.println("==============================================");
		
		// 1. ��ü ���� �� �ʵ��� ���� �Ҵ�
		A a1 = new A();
		
		a1.b = (A.B) new A.B() { 
			public void play() {
				System.out.println("±±");
				
			};
			public void stop() {
				System.out.println("���� �ϴ��� ���ϴ�");
			};
		}; 
		a1.abc();
		
		System.out.println("========================================");
		
		// 2. �����ڸ� �̿��ؼ� ���� �Ҵ�
		A a2 = new A(
				new A.B() {
					
					@Override
					public void stop() {
						System.out.println("�۸�");
					}
					
					@Override
					public void play() {
						System.out.println("���� �ϴ��� ���� ���մϴ�.");
					}
				}
					); 		// ������ ���ο� A,B Ÿ���� ��ü ���� �� ����
		a2.abc();

	}

}
