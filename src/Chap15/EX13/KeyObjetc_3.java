package Chap15.EX13;

// 클래스 내부에 여러개의 동기화 메소드가 존재할 경우 : 모두 쓰레드가 접근하는 키가 this 
		// 여러개의 동기화 메소드 내에서 멀티 쓰레드를 사용하고자 할 경우 : 동기화 블락을 생성 후 키를 다르게 설정

class A{}
class B{}
class C{}

class MyData{ 	// 공유 객체 : 여러 쓰레드가 공유 객체에 접근
	
	// 동기화된 메소드는 Key값이 모두 this가 자동으로 등록, 수정이 불가함. 
		// 동기화 메소드는 Key 값을 넣을 수 없다.
		// 하나의 쓰레드가 접근할 때 Key를 가지고 동기화된 메소드를 접근 가능하다.
		// Key는 객체를 키로 사용할 수 있다.
	// 동기화 블럭은 Key 값을 임의로 할당 가능하다.

	synchronized void abc() { 	// 여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리
		try {Thread.sleep(10);} catch (InterruptedException e1) {} 		// 0.01초 딜레이
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1초 딜레이
		}
	}
	void bcd() { 	// 여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리
		synchronized(new A()) { 	// 쓰레드가 접근할 별도의 키를 생성
		try {Thread.sleep(20);} catch (InterruptedException e1) {} 		// 0.01초 딜레이
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1초 딜레이
		}
		}
	}
	void cde() { 	// 
		synchronized(new Object()) { 	// 별도의 키를 생성 : 임의의 키 , 쓰레드가 접근하는 키, 객체 생성, 
			try {Thread.sleep(30);} catch (InterruptedException e1) {} 		// 0.01초 딜레이
			for(int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1초 딜레이
			}
		}

	}
}

public class KeyObjetc_3 {

	public static void main(String[] args) {
		MyData myData = new MyData();
		
		// 세 개의 쓰레드가 각각의 메소드 호출
		new Thread() { 					// 익명클래스 : 쓰레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.abc();			// 첫 번째 쓰레드 : abc() 메소드 호출
			};
		}.start();
		
		new Thread() { 					// 익명클래스 : 쓰레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.bcd();			// 두 번째 쓰레드 : bcc() 메소드 호출
			};
		}.start();
		
		new Thread() { 					// 익명클래스 : 쓰레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.cde();			// 세 번째 쓰레드 : cde() 메소드 호출
			};
		}.start();

	}

}
