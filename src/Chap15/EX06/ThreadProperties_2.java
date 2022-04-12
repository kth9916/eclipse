package Chap15.EX06;

//쓰레드 우선 순위
class MyThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 100000000 ; i++) {} 	// 시간 지연용
		System.out.println(getName() + " 우선순위 " + getPriority());
	}
}

public class ThreadProperties_2 {

	public static void main(String[] args) {
		
		// 1. 참고 : CPU core 확인 하기
		System.out.println("코어수 : " + Runtime.getRuntime().availableProcessors());
		
		// 2. 기본(default : 5) 우선 순위
			// (낮음) 0~5 (default) ~ 10 (높음) 
		for(int i = 0; i <3; i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t"); 		// 쓰레드 이름 출력
			System.out.println(thread.getPriority());
			thread.start();
		}
		// 1초 지연
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 2. 우선 순위 직접 지정
		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + " 번째 쓰레드");
			if (i==9) {
				thread.setPriority(10);
			}
			
			thread.start();
//			System.out.println(thread.getName() + "\t");
//			System.out.println(thread.getPriority());
			
			
			
		}
	}

}
