package Chap14.EX09;

//Exception Ŭ�������� �ϳ��� �����ϴ°� �ǾҴ�.

class SeasonException extends Exception{
	public SeasonException() {
		super();
	}
	public SeasonException(String message) {
		super(message);
	}
}
class WeekException extends Exception{
	public WeekException() {
		super();
	}
	public WeekException(String message) {
		super(message);
	}
}
class ScoreEngException extends Exception{
	public ScoreEngException() {
		super();
	}
	public ScoreEngException(String message) {
		super(message);
	}
}
class ScoreKorException extends Exception{
	public ScoreKorException() {
		super();
	}
	public ScoreKorException(String message) {
		super(message);
	}
}
class UserIDException extends Exception{
	public UserIDException() {
		super();
	}
	public UserIDException(String message) {
		super(message);
	}
}

class A {
	// private : 
	String season ; 	// ��, ����, ����, �ܿ� (���ܹ߻� : ��, ����, ����, �ܿ︸ �Է��ϼ���)
	String week;		// ��, ȭ, ��, ��, ��, ��, �� (���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���)
	int scorekor; 		// 0 ~ 100 ���� �Է� (���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���)
	int scoreeng; 		// 0 ~ 100 ���� �Է�( ���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���)
	String userID; 		// 12�� �̻� 20�� ������ ���� ( ���� �߻� : 12�� �̻� 20�� ������ ���ڸ� ��������)
	
	// �ϳ��� �޼ҵ�� ó���ؾ� �ߴ�. �ʹ� ��ȿ����
	
	void checkScoreKor (int scorekor) throws ScoreKorException{
		if(scorekor>100 | scorekor <0) {
			throw new ScoreKorException("���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���");
		} else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.scorekor = scorekor;
		}}
		
	void checkScoreEng (int scoreeng) throws ScoreEngException{
		if(scoreeng >100 | scoreeng <0) {
			throw new ScoreEngException("���� �߻� : 0 ~ 100���� ������ �Է� �ϼ���");
		} else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.scoreeng = scoreeng;
		}}
	void checkSeason (String season) throws SeasonException{
		if(season.equals("��") | season.equals("����") | season.equals("����") | season.equals("�ܿ�")) {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.season = season;
		} else {
			throw new SeasonException("���ܹ߻� : ��, ����, ����, �ܿ︸ �Է��ϼ���");
		}
	}
	void checkWeek (String week) throws WeekException{
		if(week.equals("��") | week.equals("ȭ") | week.equals("��") | week.equals("��")| week.equals("��")| week.equals("��")| week.equals("��")) {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.week = week;
		} else {
			throw new WeekException("���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���");
		}
	}
	void checkUserID(String userID) throws UserIDException{
		if(userID.length()>12 && userID.length()<20) {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.userID = userID;
		} else {
			throw new UserIDException("���� �߻� : 12�� �̻� 20�� ������ ���ڸ� ��������");
		}
	}	
	}
public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.checkScoreKor(50);
		} catch(ScoreKorException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		a.checkScoreEng(187);
		} catch(ScoreEngException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkSeason("��");
		} catch(SeasonException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkWeek("��");
		} catch(WeekException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		a.checkUserID("�����ٶ󸶹�");
		} catch(UserIDException e) {
			System.out.println(e.getMessage());
		}
	}

}
