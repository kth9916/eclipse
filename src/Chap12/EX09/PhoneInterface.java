package Chap12.EX09;

public interface PhoneInterface {
	int TIMEOUT = 10000; 		// public static final ������
	void sendCall();			// public abstract ����
	void receiveCall();
	default void printlogo() {
		System.out.println("�ΰ� ����մϴ�.");
	}
	
	
}
