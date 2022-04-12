package chap06_07.Ex06;

class Cde{
	String name ; 			// 필드 (인스턴스 필드) : 객체화 해야 사용가능
	int age;				// 필드는 heap영역에 값을 별개로 저장. 따라서 값을 바꿔도 그 객체에만 적용
	
	static String email;  	// 필드 (static(정적) 필드) : 객체 생성없이 사용가능(클래스명.필드명) + 객체 생성 후 사용
	static int num;			// static은 heap 영역에 주소만 있고 값은 class에 있음. 따라서 값을 변경하면 모든 객체에서 모두 변경
}

public class Static4 {

	public static void main(String[] args) {
		Cde cde1 = new Cde(); 		// 객체화
		// 인스턴스 필드 : 객체화 해야지만 사용 가능
		cde1.name = "홍길동";
		cde1.age = 30;
		
		// static 필드 : 객체화해서 사용 가능
		cde1.email = "aaa@aaa.com";
		cde1.num = 4;
		
		// 객체 생성 없이 static 필드 호출 : 클래스 명으로 호출이 가능 : <<권장 사항>>
			// 모든 객체들이 공유하는 공간
		Cde.email = "bbb@bbb.com";
		Cde.num = 5;
		
		System.out.println(Cde.email + " , " + Cde.num);
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		cde2.name = "김유신";
		cde2.age = 50;
		
		cde3.name = "세종대왕";
		cde3.age = 60;
		
		cde4.name = "신사임당";
		cde4.age = 40;
		
		// 인스턴스 필드 값 출력
		System.out.println(cde2.name + " , " + cde2.age);
		System.out.println(cde3.name + " , " + cde3.age);
		System.out.println(cde4.name + " , " + cde4.age);
		
		//static 필드의 값을 변경하면 모든 객체에서 모두 변경
		cde2.email = "kkk@kkk.com";
		cde2.num = 55;
		
		System.out.println(cde2.email + " , " + cde2.num);
		System.out.println(cde3.email + " , " + cde3.num);
		System.out.println(cde4.email + " , " + cde4.num);
	}

}
