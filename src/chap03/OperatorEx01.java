package chap03;

public class OperatorEx01 {

	public static void main(String[] args) {
		int data = 13;  //
		int data2 = 15;
		
		System.out.println(Integer.toBinaryString(data)); // 2진수로 변환
		System.out.println(Integer.toOctalString(data)); // 8진수로 변환
		System.out.println(Integer.toHexString(data)); // 16진수로 변환
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2)); // 2진수인 1101를 10진수로 변환
		System.out.println(Integer.parseInt("15", 8)); // 8진수인 15를 10진수로 변환
		System.out.println(Integer.parseInt("0D", 16)); // 16진수 0D를 10진수로 변환
		
		System.out.println(~3);
		System.out.println(~7);
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101); //0b 이진수 표현
		System.out.println(015);    //0 8진수 표현
		System.out.println(0x0D);   //0x 16진수 표현
		System.out.println();
		
	}

}
