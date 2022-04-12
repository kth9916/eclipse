package Chap14.EX02;

// ���� ����(Unchecked Exception, Runtime Exception) : ������ �ܰ迡���� ���� �߻����� ����.
	// ����ÿ� �߻��� �� �ִ�.

class AA{}
class BB extends AA{}

public class UncheckException {
	public static void main(String[] args) {
		// ���� ����
		// ArithmeticException : 0���� ����� ������ ���� �߻�
		// System.out.println( 10/0 );
		
		// ClassCastException : Ŭ������ Ÿ���� ��ȯ�� �� ��ȯ ���� �ʴ� ����
		AA aa = new BB();
		//BB bb = (BB) aa; 		// ������ �ܰ迡���� ������ �߻����� �ʴ´�. 
		
		// ArrayIndexOutOfBoundsException : �迭���� �������� �ʴ� �����ȣ�� ����� ��� �߻�
		int[] array = {1,2,3};
		// System.out.println(array[3]);
		
		// NumberFormatException : ������ ���ڸ� ����Ÿ������ ��ȯ�� �� ���� ����
		// int num = Integer.parseInt("10!"); 		// ���ڿ� 10�� ������ ��ȯ
		// System.out.println(num);
		
		// NullPointerException : ��ü�� null�ε� �޼ҵ带 ȣ���ϴ� ��� �߻�
		String str = null;
		// System.out.println(str.charAt(4));
	}

}
