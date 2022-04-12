package Chap14.EX09;

class MyAllException extends Exception{ 	// �Ϲݿ��� (checked Exception) - ���� ����(����ó��)
	public MyAllException() {
		super();
	}
	public MyAllException(String message) { 	// ���� �޼��� ���, e.getMessage()
		super(message);
	}
}

class A1{
	// private : ĸ��ȭ, ��ü ���� �� �ٷ� ���� ���� ���ϵ��� ����
			// ������, setter <== ���� �� �ʵ��� ���� �Ҵ�
	
	String season ; 	// ��, ����, ����, �ܿ� (���ܹ߻� : ��, ����, ����, �ܿ︸ �Է��ϼ���)
	String week;		// ��, ȭ, ��, ��, ��, ��, �� (���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���)
	int scoreKor; 		// 0 ~ 100 ���� �Է� (���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���)
	int scoreEng; 		// 0 ~ 100 ���� �Է�( ���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���)
	String userID; 		// 12�� �̻� 20�� ������ ���� ( ���� �߻� : 12�� �̻� 20�� ������ ���ڸ� ��������)
	
	// �ϳ��� �޼ҵ�� ó��
	public void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if (season != "��" && season != "����" && season != "����" && season != "�ܿ�" ) {
			throw new MyAllException("��, ����, ����, �ܿ� ( ���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���)");
		}else if(week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��") {
			throw new MyAllException("��, ȭ, ��, ��, ��, ��, �� (���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���");
		}else if(scoreKor < 0 || scoreKor > 100) {
			throw new MyAllException("0 ~ 100 ���� �Է� (���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���)");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException("0 ~ 100 ���� �Է� (���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���)");
		}else if(userID.length() < 12 && userID.length() > 20) {
			throw new MyAllException("12�� �̻� 20�� ������ ���� ( ���� �߻� : 12�� �̻� 20�� ������ ���ڸ� ��������)");
		}else {
			System.out.println("���������� ���� ��� �� �Է� �Ǿ����ϴ�.");
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		System.out.printf(season + " , " + week + " , " + scoreKor + ",\n" + scoreEng + " , " + userID);
		
	}

}

public class UserException_EX_T {

	public static void main(String[] args) {
		A1 a = new A1();
		
		try {
			a.studentInfo("��", "��", 80, 90,"aaaaaaaaaaaaaaaaaaaaaaa");
		} catch (MyAllException e) {
			System.out.println(e.getMessage());
		}
	}

}
