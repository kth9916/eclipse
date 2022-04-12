package chap03;

public class OperatorEx03 {
	public static void main(String[] args) {
		/*
		 * �� ������ (&&, ||, ^, ! ) : ��Ʈ ��Ŷ�� �߻��� (�պκ��� ���� ����� ������ �� ���� �� �޺κ��� ������ ����) ��Ʈ
		 * ������ (&, |, ^, ~ ) : ��Ʈ ��Ŷ�� �߻����� �ʴ´�
		 */

		// 1. �� ������ AND (&&) : �� ���� ��� true�� �� ����� true

		System.out.println(true && true); // true, ��Ʈ��Ŷ�� �߻����� ����.
		System.out.println(true && false); // false, ��Ʈ��Ŷ�� �߻����� ����.
		System.out.println(false && true); // false, ��Ʈ��Ŷ�� �߻���. &&�� �� ���� ��� true�� ������ true. 
											//		�׷��Ƿ� ���� false�̸� ��Ʈ��Ŷ�� �߻���
		System.out.println(true && (5<3)); //false
		System.out.println((5<=5) && (7>2)); //true
		System.out.println((3<2) && (8<10)); // false, ��Ʈ ��Ŷ�� �߻���. �ո� ���� ��ü�� ���� ����
		
		//OR (||) : �� �� �� �ϳ��� true �̸� ����� true
		System.out.println(true || true); // true, ||�� �տ� true���� ��Ʈ��Ŷ �߻�
		System.out.println(false || (5<3)); // false
		
		//XOR (^) : �� ���� ���� �� false, �� ���� �ٸ� �� true  // ��Ʈ��Ŷ �߻� X
		System.out.println(true ^ true); //false
		System.out.println(false ^ false); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true 
		System.out.println((5<=5) ^ (7>2)); // false
		
		//NOT (!) : true �̸� false, flase�̸� true
		System.out.println(!true); // false
		System.out.println(!false); //true
		System.out.println(false || !(5<3)); // true
		
		// ��Ʈ ��Ŷ�� ��� ���� (���������� �� �߻�, ��Ʈ�������� ���� �߻� X)
		int value2 = 3;
		System.out.println(false && ++value2 > 6); // false, ��Ʈ ��Ŷ�� �߻���
		System.out.println(value2); // 3
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6); // false, ��Ʈ ��Ŷ�� �߻� X
		System.out.println(value3); // 4, ��Ʈ �����ڿ��� �ڰ� ó���� �Ǿ 4�� ��.
		
		int value4 = 3;
		System.out.println(true || ++value4>6); // true, ��Ʈ ��Ŷ �߻�
		System.out.println(value4); // 3
		
		int value5 = 3;
		System.out.println(true | ++value5>6); // true, ��Ʈ��Ŷ�� �߻� X
		System.out.println(value5); // 4, 
		
		 
		
	}

}
