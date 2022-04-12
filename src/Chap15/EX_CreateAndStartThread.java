package Chap15;
/*
 ������ 4�� ���� : 1. Thread�� ��� / 2. Runnable ���� / 3. �͸� ����Ŭ������ �����ؼ� ����
 
 1.		2.		3		4
 �̸�		ȫ�浿	�̼���	�ɻ��Ӵ�
 ����		40		50		60
 ����		100		90		80
 ����		70		60		100
 ����		59		70		80
 */

class SMIFileThread extends Thread{
	@Override
	public void run() {
		String[] strArray4 = {"ȫ�浿", "40", "100", "70", "59"};
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
		String[] strArray5 = {"�̼���", "50", "90", "60", "70"};
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
		String[] strArray6 = {"�Ż��Ӵ�", "60", "80", "100", "80"};
		try {Thread.sleep(30);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray6.length; i++) {
			System.out.println(" - " + strArray6[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class SMIFile1Runnable implements Runnable{ 		// �������̽� - implements
	
	@Override
	public void run() {
		String[] strArray = {"�̸�", "����", "����", "����", "����"};
		
		// �ڸ� ��±���
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(" - " + strArray[i]);
			// 0.2�� ���� �� ���.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
class SMIFile2Runnable implements Runnable{ 		// �������̽� - implements
	
	@Override
	public void run() {
		String[] strArray = {"ȫ�浿", "40", "100", "70", "59"};
		
		// �ڸ� ��±���
		try {Thread.sleep(20);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(" - " + strArray[i]);
			// 0.2�� ���� �� ���.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
class SMIFile3Runnable implements Runnable{ 		// �������̽� - implements
	
	@Override
	public void run() {
		String[] strArray = {"�̼���", "50", "90", "60", "70"};
		
		// �ڸ� ��±���
		try {Thread.sleep(30);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(" - " + strArray[i]);
			// 0.2�� ���� �� ���.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
class SMIFile4Runnable implements Runnable{ 		// �������̽� - implements
	
	@Override
	public void run() {
		String[] strArray = {"�Ż��Ӵ�", "60", "80", "100", "80"};
		
		// �ڸ� ��±���
		try {Thread.sleep(40);} catch (InterruptedException e1) {}
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - " + strArray[i]);
			// 0.2�� ���� �� ���.	
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
		
		
		String[] strArray1 = {"�̸�", "����", "����", "����", "����"};
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
				String[] strArray = {"�̸�", "����", "����", "����", "����"};
				
				// �ڸ� ��±���
				try {Thread.sleep(10);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.print(" - " + strArray[i]);
					// 0.2�� ���� �� ���.	
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread sm9 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"ȫ�浿", "40", "100", "70", "59"};
				
				// �ڸ� ��±���
				try {Thread.sleep(20);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.print(" - " + strArray[i]);
					// 0.2�� ���� �� ���.	
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread sm10 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"�̼���", "50", "90", "60", "70"};
				
				// �ڸ� ��±���
				try {Thread.sleep(30);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.print(" - " + strArray[i]);
					// 0.2�� ���� �� ���.	
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread sm11 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"�Ż��Ӵ�", "60", "80", "100", "80"};
				
				// �ڸ� ��±���
				try {Thread.sleep(40);} catch (InterruptedException e1) {}
				for(int i = 0; i < strArray.length; i++) {
					System.out.println(" - " + strArray[i]);
					// 0.2�� ���� �� ���.	
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
