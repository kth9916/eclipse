package Chap14.EX09;

//Exception 클래스들을 하나로 통일하는게 옳았다.

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
	String season ; 	// 봄, 여름, 가을, 겨울 (예외발생 : 봄, 여름, 가을, 겨울만 입력하세요)
	String week;		// 월, 화, 수, 목, 금, 토, 일 (예외 발생 : 월, 화, 수, 목, 금, 토, 일 만 입력하세요)
	int scorekor; 		// 0 ~ 100 값만 입력 (예외 발생 : 0 ~ 100까지 정수만 입력 하세요)
	int scoreeng; 		// 0 ~ 100 값만 입력( 예외 발생 : 0 ~ 100까지 정수만 입력 하세요)
	String userID; 		// 12자 이상 20자 사이의 문자 ( 예외 발생 : 12자 이상 20자 사이의 문자만 넣으세요)
	
	// 하나의 메소드로 처리해야 했다. 너무 비효율적
	
	void checkScoreKor (int scorekor) throws ScoreKorException{
		if(scorekor>100 | scorekor <0) {
			throw new ScoreKorException("예외 발생 : 0 ~ 100까지 정수만 입력 하세요");
		} else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.scorekor = scorekor;
		}}
		
	void checkScoreEng (int scoreeng) throws ScoreEngException{
		if(scoreeng >100 | scoreeng <0) {
			throw new ScoreEngException("예외 발생 : 0 ~ 100까지 정수만 입력 하세요");
		} else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.scoreeng = scoreeng;
		}}
	void checkSeason (String season) throws SeasonException{
		if(season.equals("봄") | season.equals("여름") | season.equals("가을") | season.equals("겨울")) {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.season = season;
		} else {
			throw new SeasonException("예외발생 : 봄, 여름, 가을, 겨울만 입력하세요");
		}
	}
	void checkWeek (String week) throws WeekException{
		if(week.equals("월") | week.equals("화") | week.equals("수") | week.equals("목")| week.equals("금")| week.equals("토")| week.equals("일")) {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.week = week;
		} else {
			throw new WeekException("예외 발생 : 월, 화, 수, 목, 금, 토, 일 만 입력하세요");
		}
	}
	void checkUserID(String userID) throws UserIDException{
		if(userID.length()>12 && userID.length()<20) {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.userID = userID;
		} else {
			throw new UserIDException("예외 발생 : 12자 이상 20자 사이의 문자만 넣으세요");
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
			a.checkSeason("봄");
		} catch(SeasonException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkWeek("봄");
		} catch(WeekException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		a.checkUserID("가나다라마바");
		} catch(UserIDException e) {
			System.out.println(e.getMessage());
		}
	}

}
