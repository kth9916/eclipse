package Chap15.EX17;

//	a. joing(1000) : a 객체에게 CPU를 할당하고 자신은 TimedWaiting 상태로 대기 

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 10000000000L; i++) {} 		// 시간지연 0.5초
		for(long i = 0; i < 10000000000L; i++) {}
		for(long i = 0; i < 10000000000L; i++) {}
	}
 }

class MyThread2 extends Thread{
	MyThread1 myThread1; 		// 클래스타입 참조변수;
	public MyThread2 (MyThread1 myThread1) {	// 생성자를 통해서 참조변수의 값 할당.
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {
			myThread1.join(3000); 	// MyThread2는 3초를 대기하고 myThread1에게 CPU를 할당해줌
		} catch (InterruptedException e) {
			System.out.println("---join(...) 진행중 interrupt 발생");
			for(long i = 0; i < 100000000L; i++) {} 	// 시간 지연 0.5초
		}
	}
}

public class TimedWaiting_Join {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {} 	// 쓰레드 시작 준비 시간 0.1초
		System.out.println("MyThread1 State : " + myThread1.getState()); 	// RUNNABLE
		System.out.println("MyThread2 State : " + myThread2.getState());	// TIMED_WAITING
		
		myThread2.interrupt(); 		// 3초 대기 중 인터럽트가 발생되면 예외를 발생시키고 Runnable로 이동함
		try {Thread.sleep(1);} catch (InterruptedException e) {} 	// 쓰레드 시작 준비 시간 0.1초
		
		System.out.println("MyThread1 State : " + myThread1.getState()); 	// RUNNABLE
		System.out.println("MyThread2 State : " + myThread2.getState());	// TIMED_WAITING
	}

}
