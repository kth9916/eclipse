package chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		
		/*
		 * ���� ������ ( = , +=, -=, *=, /=, >>=, <<=, >>>= ), ���Ŀ��� �켱������ ���� ����.
		 * a = b; <== b������ ���� a�� �Ҵ��ض��� �ǹ�,  ==(����)
		 * a += b <== a = a + b
		 * a -= b <== a = a - b
		 * a *= b <== a = a * b
		 * a /= b <== a = a / b
		 * a &= b <== a = a & b
		 * a |= b <== a = a | b
		 * a <<= b <== a = a << b
		 */
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		int value2; // �⺻�� �ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ 0�� �Ҵ�.
		value2 = 5;	// �����ڷ� ���� ��� ������ ���� �Ҵ� ���� ���� ��� �⺻������ NULL
		//��� ǥ��
		
		System.out.println(value2 += 2); // value2 = value2 + 2 
		System.out.println(value2 -= 2); // value2 = value2 -2
		System.out.println(value2 /= 2); // value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2); // value2 = value2 % 2
		value2 = 5; System.out.println(value2 &= 2); 
		value2 = 5; System.out.println(value2 |= 2);
		/* 0101 <== 5
		 * 0010 <== 2
		 * =====AND
		 * 0000
		 * 
		 * 0101 <== 5
		 * 0010 <== 2
		 * =====OR
		 * 0111
		 */
		
		//��� ����Ʈ: 2������ �ٲ��� . 4����Ʈ = 32bit  �� �� ��ȣ ��Ʈ�� ������Ű�� �������� �̵�����.
		value2 = 5; System.out.println(value2 <<= 2); // value2 = value2 << 2 (�������� �� ĭ �̵��ض�)
		value2 = 5; System.out.println(value2 >>= 2); // value2 = value2 >> 2 (���������� �� ĭ �̵��ض�)
		//00101 >> 00001
		
		value2 = 5; System.out.println(value2 >>>= 2); // value2 = value2 >>> 2 (���������� �� ĭ �̵��ض�)
		//�� ����Ʈ : >>> ��ĭ ¥���� ��ȣ��Ʈ���� ���� �̵��Ѵ�.
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);
	}

}
