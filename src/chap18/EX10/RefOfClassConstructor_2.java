package chap18.EX10;

interface A{
	B abc(int k); 			// ����Ÿ���� B ��ü�� ����
}

class B{
	B(){
		System.out.println("ù ��° ������");
	}
	B(int k){
		System.out.println("�� ��° ������ : " + k);
	}
}

public class RefOfClassConstructor_2 {

	public static void main(String[] args) {
		
		// �͸� �̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(k);
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = (int k) -> {return new B(k);}; 		//��ü ����
		A a3 = (k) -> new B(k);				// ��� ǥ��
		
		// Ŭ���� ������ ����
		A a4 = B::new;
		
		a1.abc(3);
		a2.abc(5);
		a3.abc(3);
		a4.abc(3);
		
		
	}

}
