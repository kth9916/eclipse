package chap06_07.Ex06;

import chap06_07.Ex05.D;

// ctrl + shift + o
							// class의 접근 제한자가 public

public class Ex_C {

	public static void main(String[] args) {
		
		// 다른 클래스에 존재함 / public만 접근 / model, color 메모리로 접근 불가
		// model과 color는 setter를 public 통해서 할당 후 출력
		
		D cc2 = new D();
		
		//company, model, color는 다른 패키지에서 접근 불가, setter를 통해서 메모리 값을 할당하도록 구성
		cc2.maxSpeed = 290; //다른 패키지의 클래스에서는 public, protected(상속 결정)
		
		//setter를 통해서 메모리의 값을 부여.
		cc2.setColor("빨강");
		cc2.setModel("에쿠스");
		cc2.setMaxSpeed(300);
		
		cc2.print();
		
		
	}

}
