package chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		
		/*
		 * 대입 연산자 ( = , +=, -=, *=, /=, >>=, <<=, >>>= ), 수식에서 우선순위가 제일 낮다.
		 * a = b; <== b변수의 값을 a에 할당해라라는 의미,  ==(같다)
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
		
		int value2; // 기본형 자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당.
		value2 = 5;	// 참조자료 형일 경우 변수의 값을 할당 하지 않을 경우 기본값으로 NULL
		//축약 표현
		
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
		
		//산술 쉬프트: 2진수로 바꾸자 . 4바이트 = 32bit  맨 앞 부호 비트는 고정시키고 나머지를 이동하자.
		value2 = 5; System.out.println(value2 <<= 2); // value2 = value2 << 2 (왼쪽으로 두 칸 이동해라)
		value2 = 5; System.out.println(value2 >>= 2); // value2 = value2 >> 2 (오른쪽으로 두 칸 이동해라)
		//00101 >> 00001
		
		value2 = 5; System.out.println(value2 >>>= 2); // value2 = value2 >>> 2 (오른쪽으로 세 칸 이동해라)
		//논리 쉬프트 : >>> 세칸 짜리는 부호비트까지 같이 이동한다.
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);
	}

}
