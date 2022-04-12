package chap06_07.Ex05;

public class Ex_C {

	public static void main(String[] args) {
		
		D c = new D(); 		// 같은 패키지에 존재하는 클래스
		
//		c.company = "삼성자동차"	// private : 외부 클래스에서 접근 불가
		c.model = "그랜저";		// default
		c.color = "검정";			// protected
		c.maxSpeed = 290;		//  public
		
		c.print();
	}

}
