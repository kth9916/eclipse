package Chap14.EX01;

public class CheckException_1_1 {

	public static void main(String[] args) {
		
		try {
		System.out.println( 10 / 0 ); 	// ���α׷��� ������ ����
										// ���ܿ� ���� ó��
		} catch (ArithmeticException e) {
			// try{}���� ������ �߻��� ��쿡 �۵�.
//			e.printStackTrace(); 	// ������ ���� �ڼ��� ������ ���
			System.out.println("0�� ���� �� �����ϴ�.");
			
			//catch ����� ������ ���� �ʾƵ� ���� ó���� �� ���̴�.
		}finally {
			//try{} ������ ��� �۵�(0), ������ �־ (0)
			//try{}�� �۵��Ǹ� �׻� �۵�
			// ��ü�� ��� �� ��ü�� �޸𸮸� ���� �� �� , sc.close();
			System.out.println("Finally{} ����� �׻� ȣ���. ");
			
		}
		System.out.println("���α׷��� ���� ���� �մϴ�. ");  	// ���� ����
	}

}
