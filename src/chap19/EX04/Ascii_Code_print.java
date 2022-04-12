package chap19.EX04;

/*
  		ASCII 코드 값 출력 : 1byte=8bit , 제일 처음 비트는 부호 비트, 7bit : 128개 (0 ~ 127)
  			0 ~ 32비트 까지는 출력을 할 수 없는 특수한 코드, 예) null, 헤더의 시작, 경고음(7) 개행 10, (LF) ...
  			127 : delete
  			
  			실제 출력 가능은 33번 비트 ~ 126 비트
  			영문, 숫자, 특수문자, 
  			
  			출력
  			====================================
  			ASCII	문자		ASCII	문자
  			====================================
  			33		!		34		&
  			35		#		36		$
  			
  			...
  			
  			126		~
  			
  			
 */

public class Ascii_Code_print {

	public static void main(String[] args) {
		
		System.out.println("출력");
		System.out.println("================================================================");
		System.out.println("ASCII\t문자\t\tASCII\t문자" );
		System.out.println("================================================================");
		for(int i = 33; i <127; i += 2) {
			System.out.println(i + "\t" + (char)i + "\t\t" + (i+1) + "\t" + ((char)(i+1)));
		}
	}

}
