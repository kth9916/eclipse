package Chap15.EX16;

// Thread.sleep(1000) ===> TimedWaiting ���·� �̵� ===> Ư�� �ð�(1��)�� ����Ǹ� Runnable ���·� �̵�
												// ===> ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable 
// �ν��Ͻ���(��ü��)[a].join(1000) ===> TimedWaiting ���·� �̵� ===> Ư�� �ð�(1��)�� ����Ǹ� Runnable ���·� �̵�
		// a.join(1000) : �ڽ��� ������� 1�ʸ� ��ٸ��� a ��ü���� CPU �Ҵ� (Runnable), 1�� �ڿ��� �ڽ��� �����嵵 Runnable 
// ����) �ν��Ͻ���(��ü��)[a].join() ===> waiting ���·� �̵� ===> �ڽ��� ������� ��� Waiting ���·� ���� a ��ü���� CPU(Runnable) ����ϵ��� �Ҵ�
				// a ��ü�� ��� �Ϸ�� ��� �ڽ��� �����嵵 Runnable

class MyThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(3000);} catch (InterruptedException e) {	// 3�ʵ��� TimeWaiting ���·� ����, 3���Ŀ��� Runnable ���·� �̵�
																	// interrupt�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable ���·� �̵�
			System.out.println("---sleep() ������ Interrupt �߻�");
			for(long i = 0; i < 10000000; i++) {} 	// �ð����� 0.5��
		}
	}
}


public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start(); 			// RUNNABLE
		
		try {Thread.sleep(100);} catch (InterruptedException e) {} // ������ ���� �غ� �ð�
		System.out.println("MyThread State : " + myThread.getState()); 	// TimedWaiting
		
		// 3�� ������ ���ͷ�Ʈ ���� �߻�.
		myThread.interrupt();  // TimedWaiting ����
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State : " + myThread.getState());
		
		
	}

}
