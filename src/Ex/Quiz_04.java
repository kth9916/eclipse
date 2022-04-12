package Ex;

class E extends Object {
	String name;
	
	E (){} 			// 기본 생성자 : 클래스 내의 다른 생성자가 존재할 때 외부에서 기본생성자를 호출할 때 생략되면 안된다.
	E (String name) {
		this.name = name; 	// 매개변수 이름, 구현부에서 매개변수를 받는 변수명, 필드의 변수명이 모두 동일
							// this :자신의 객체 
	}
	
	@Override
	public String toString() {
		return "이름 : " + name; 			// this.name
	}
	

	
}

class Student {
	int studentId;
	String name;
	int kor;
	int eng;
	
	Student(int studentId, String name, int kor, int eng){
		this.studentId = studentId;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.studentId == ((Student)obj).studentId) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return studentId + " , " + name + " , " + kor + " , " + eng ;
	}
	
}

public class Quiz_04 {

	public static void main(String[] args) {
		Student s1 = new Student(1111, "홍길동", 90, 80);
		Student s2 = new Student(2222, "이성계", 75, 65);
		Student s3 = new Student(3333, "정몽주", 100, 100);
		Student s4 = new Student(1111, "유관순", 90, 90);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		/* studentId가 같은 경우 같은 학생이다 라고 출력
		 객체의 StudentId 컬럼을 비교해서 같을 경우 같은 학생 이다라고 출력
			 == : 기본 타입 : boolean, byte, short, int, long, double, float,char : 8개 값을 비교
			 		참조 타입 : 객체의 주소를 비교, 배열, 객체, String (특수하게 사용)
			 			String : toString() 재정의 되어 있다. equals(재정의)
			 		Object의 toString() - 객체 자체를 println(a), 패키지이름.클래스이름@해쉬코드
			 							오버라이딩 해서 재정의해 객체의 필드의 정보를 출력.
			 							
			 				.equals() : ==와 같다, 객체의 주소를 비교
			 							재정의 해서 객체 내의 특정 필드의 값을 비교.
		
		*/
		System.out.println(s1.equals(s4)); 	// true
		
		if(s1.equals(s4)) {
			System.out.println("s1과 s4는 같은 학생입니다.");
		} else {
			System.out.println("s1과 s4는 다른 학생입니다.");
		}
		

		
		
		E e1 = new E ();  				// 기본 생성자 호출 : Heap의 필드의 값은 강제 초기화 됨
		System.out.println(e1.name);
		
		E e2 = new E ("고양이");
		System.out.println(e2.name);
		
		E e3 = new E("고양이");
		
		System.out.println(e2 == e3); 		// 참조 타입 (== ) : 객체의 주소를 비교
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3)); // object의 equals() : (==) :  객체의 주소를 비교
		//object의 toString(), equals()는 재정의 해서 사용
		
	}

}
