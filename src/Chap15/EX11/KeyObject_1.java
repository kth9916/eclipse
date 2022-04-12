package Chap15.EX11;

/*		
  		여러 쓰레드가 공유된 필드에 접근할 때 동시성의 문제가 발생. ===> 동기화는 동시성 문제를 해결.
 		
  		동기화 : 여러 쓰레드가 공유된 필드를 접근할 때 하나의 쓰레드가 완료되면 다른 쓰레드에게 접근이 가능
  				하나의 쓰레드가 사용 중인 경우 lock을 걸고 작업이 완료되면 다른 쓰레드가 접근 가능하도록 lock 해제
  				
  				- 모든 동화된 메소드는 this(자신의 객체) 라는 키만 가진다.
  				- 여러 메소드가 동기화된 메소드일 경우 : 하나의 쓰레드만 접근이 가능
  				
 */

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
	synchronized void bcd() { 	// 여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리
		try {Thread.sleep(20);} catch (InterruptedException e1) {} 		// 0.01초 딜레이
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1초 딜레이
		}
	}
	synchronized void cde() { 	// 여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리
		try {Thread.sleep(30);} catch (InterruptedException e1) {} 		// 0.01초 딜레이
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "번째");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} 		// 1초 딜레이
		}
	}
}

public class KeyObject_1 {

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
