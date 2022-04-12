package Chap15;
/*
 쓰레드 4개 생성 : 1. Thread를 상속 / 2. Runnable 구현 / 3. 익명 내부클래스를 생성해서 구현
 
 1.		2.		3		4
 이름		홍길동	이순신	심사임당
 나이		40		50		60
 국어		100		90		80
 영어		70		60		100
 수학		59		70		80
 */

class SMIFileThread extends Thread{
	@Override
	public void run() {
		String[] strArray4 = {"홍길동", "40", "100", "70", "59"};
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray4.length; i++) {
			System.out.print(" - " + strArray4[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class SMIFile2Thread extends Thread{
	@Override
	public void run() {
		String[] strArray5 = {"이순신", "50", "90", "60", "70"};
		try {Thread.sleep(20);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray5.length; i++) {
			System.out.print(" - " + strArray5[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class SMIFile3Thread extends Thread{
	@Override
	public void run() {
		String[] strArray6 = {"신사임당", "60", "80", "100", "80"};
		try {Thread.sleep(30);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray6.length; i++) {
			System.out.println(" - " + strArray6[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class SMIFile1Runnable implements Runnable{ 		// 인터페이스 - implements
	
	@Override
	public void run() {
		String[] strArray = {"이름", "나이", "국어", "영어", "수학"};
		
		// 자막 출력구문
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(" - " + strArray[i]);
			// 0.2를 지연 후 출력.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
class SMIFile2Runnable implements Runnable{ 		// 인터페이스 - implements
	
	@Override
	public void run() {
		String[] strArray = {"홍길동", "40", "100", "70", "59"};
		
		// 자막 출력구문
		try {Thread.sleep(20);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(" - " + strArray[i]);
			// 0.2를 지연 후 출력.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
class SMIFile3Runnable implements Runnable{ 		// 인터페이스 - implements
	
	@Override
	public void run() {
		String[] strArray = {"이순신", "50", "90", "60", "70"};
		
		// 자막 출력구문
		try {Thread.sleep(30);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(" - " + strArray[i]);
			// 0.2를 지연 후 출력.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
class SMIFile4Runnable implements Runnable{ 		// 인터페이스 - implements
	
	@Override
	public void run() {
		String[] strArray = {"신사임당", "60", "80", "100", "80"};
		
		// 자막 출력구문
		try {Thread.sleep(40);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - " + strArray[i]);
			// 0.2를 지연 후 출력.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		// 1.
		Thread sm1 = new SMIFileThread();
		Thread sm2 = new SMIFile2Thread();
		Thread sm3 = new SMIFile3Thread();
		sm1.start();
		sm2.start();
		sm3.start();
		
		
		String[] strArray1 = {"이름", "나이", "국어", "영어", "수학"};
		for(int i = 0; i < strArray1.length; i++) {
			System.out.print(" - " + strArray1[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
		
		//2
		Runnable smi1 = new SMIFile1Runnable();
		Thread sm4 = new Thread(smi1);
		
		
		Runnable smi2 = new SMIFile2Runnable();
		Thread sm5 = new Thread(smi2);
		
		
		Runnable smi3 = new SMIFile3Runnable();
		Thread sm6 = new Thread(smi3);
		
		
		Runnable smi4 = new SMIFile4Runnable();
		Thread sm7 = new Thread(smi4);
		
		sm4.start();
		sm5.start();
		sm6.start();
		sm7.start();
		
		
		Thread sm8 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"이름", "나이", "국어", "영어", "수학"};
				
				// 자막 출력구문
				try {Thread.sleep(10);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.print(" - " + strArray[i]);
					// 0.2를 지연 후 출력.	
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread sm9 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"홍길동", "40", "100", "70", "59"};
				
				// 자막 출력구문
				try {Thread.sleep(20);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.print(" - " + strArray[i]);
					// 0.2를 지연 후 출력.	
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread sm10 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"이순신", "50", "90", "60", "70"};
				
				// 자막 출력구문
				try {Thread.sleep(30);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.print(" - " + strArray[i]);
					// 0.2를 지연 후 출력.	
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread sm11 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"신사임당", "60", "80", "100", "80"};
				
				// 자막 출력구문
				try {Thread.sleep(40);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.println(" - " + strArray[i]);
					// 0.2를 지연 후 출력.	
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		try {Thread.sleep(1200);} catch (InterruptedException e1) {}
		sm8.start();
		sm9.start();
		sm10.start();
		sm11.start();
	}

}
