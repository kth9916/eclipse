package Chap12.EX09;

public class EX {

	public static void main(String[] args) {
		// 1. �Ｚ���� Ÿ������ ���� ���
		SamsungPhone s1 = new SamsungPhone();
		s1.printlogo(); 	// interface�� ��ӵǾ� ������ ���
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("=========================");
		
		// 2. PhoneInterface�� ��ĳ����
		PhoneInterface s2 = new SamsungPhone();
		s2.printlogo();
		s2.sendCall();
		s2.receiveCall();
		SamsungPhone ss = (SamsungPhone) s2; 		// s2 : PhoneInterface ===> SamsungPhone���� Ÿ�� ��ȯ
		ss.flash(); 	// flash �ٿ� ĳ���� �� ���
	}

}
