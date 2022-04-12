package Ex;

import chap06_07.Ex02.A;

class Studen{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	
	int sum;
	double avg;
	
	void hobby() {
		System.out.println("각 학생의 취미는 입니다. ");
	}

	@Override
	public String toString() {		//  Object 클래스의 메소드, 객체 자체를 출력할 때, [패키지명.클래스명@해쉬코드]
		return "이름 : " + name + " , 학번 : " + studentID + " , 국어 : " + kor + " , 영어 : " + eng + " , 수학 : " + math 
				 + " , 합계 : " + sum + " , 평균 : " + avg;
	}
	
	
	
}

class S_철수 extends Studen{
	S_철수(String a, int b, int c, int d, int e){
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum/3;
	}

	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}	
}

class S_영희 extends Studen{
	S_영희(String a, int b, int c, int d, int e){			// 생성자 : 1. 클래스명과 동일, 2. 리턴타입
		super.name = a;					// super 보모 클래스, this : 자신의 객체
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum / 3; 		// 평균을 계산할 때에는 (double)로 캐스팅 해줘야한다.
	}

	@Override
	void hobby() {
		System.out.println("영희의 취미는 레스큐입니다. ");
	}
}

class S_영식 extends Studen{
	S_영식(String a, int b, int c, int d, int e){
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum /3;
	}

	@Override
	void hobby() {
		System.out.println("영식의 취미는 야구입니다. ");
	}
	
	
}


public class quiz03 {

	public static void main(String[] args) {
		Studen a11 = new S_철수("철수", 1, 90, 80, 70);
		Studen b11 = new S_영희("영희", 2, 75, 70, 65);
		Studen c11 = new S_영식("영식", 3, 13, 37, 68);
		
		Studen[] arr = {a11, b11, c11};
		
		System.out.println("=========== for ==============");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
		System.out.println("========== Enhanced for ===========");
		
		for(Studen k : arr) {
			System.out.println(k);
			k.hobby();
		}
		
		System.out.println("=====================================");
		
		System.out.println(a11);
		System.out.println(b11);
		System.out.println(c11);
		
		System.out.println("======================");
		
		a11.hobby();
		b11.hobby();
		c11.hobby();
		
	}

}
