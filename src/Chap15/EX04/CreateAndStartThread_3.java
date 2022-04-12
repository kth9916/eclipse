package Chap15.EX04;

// Runnable �������̽��� run()�� �����ؼ� ������ ����
class SMIFileRunnable implements Runnable{ 		// �������̽� - implements
	
	@Override
	public void run() {
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		// �ڸ� ��±���
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ� ��ȣ)" + strArray[i]);
			// 0.2�� ���� �� ���.	
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable{
	@Override
	public void run() {
		// 2. ���� ������ ���
		int[] intArray = {1,2,3,4,5};
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("(����������)" + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}  	// 0.2�� ������
		}
	}
}

public class CreateAndStartThread_3 {

	public static void main(String[] args) {
		// ù ��° ��ü ���� �� ������ ����
		Runnable smi = new SMIFileRunnable();
		//smi.start(); 	// start() �޼ҵ�� Runnable �������̽� ���� �������� �ʴ´�.
		Thread thread = new Thread(smi); 		// Runnable ��ü�� Thread ������ ���ο� �ִ´�
		thread.start(); 	//
		
		// �� ��° ��ü ���� �� ������ ����
		Runnable video = new VideoFileRunnable();
		Thread thread2 = new Thread(video);
		thread2.start();
		
		
	}

}
