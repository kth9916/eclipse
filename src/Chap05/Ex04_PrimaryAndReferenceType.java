package chap05;
public class Ex04_PrimaryAndReferenceType {
	public static void main(String[] args) {
		//1. �⺻ ����Ÿ Ÿ�Կ� ���� ���� ( Stack ���� ���� )
		
		int value1 = 3;
		int value2 = value1;		// stack�� ���� ������ ��. value1�� value2�� ���� ���������� ����.
		
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		//2. ���� �ڷ����� ���� ���� ( Stack�� �� ������ �ּҸ� ���� )
		
		int[] array1 = new int[] {3,4,5,7};
		int[] array2 = array1; 	// array2�� ���ÿ������� array1�� �� ������ �ּҸ� ����
		array2[0] = 7; 	//array1�� array2�� �� ���� �ּҰ� ���� ������ �ϳ��� �ٲٸ� ���� ���� �ٲ�
		
		System.out.println(array1[0]);		//7
		System.out.println(array2[0]);		//7
		
		System.out.println(array1);		//��ü�� �������� �ּҰ� ��� (�������� �ּҰ� ������)
		System.out.println(array2);		//��ü�� �������� �ּҰ� ��� (�������� �ּҰ� ������)
		
		
	}

}
