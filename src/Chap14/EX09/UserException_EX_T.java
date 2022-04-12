package Chap14.EX09;

class MyAllException extends Exception{ 	// 일반예외 (checked Exception) - 구문 오류(예외처리)
	public MyAllException() {
		super();
	}
	public MyAllException(String message) { 	// 예외 메세지 출력, e.getMessage()
		super(message);
	}
}

class A1{
	// private : 캡슐화, 객체 생성 후 바로 접근 하지 못하도록 설정
			// 생성자, setter <== 제어 후 필드의 값을 할당
	
	String season ; 	// 봄, 여름, 가을, 겨울 (예외발생 : 봄, 여름, 가을, 겨울만 입력하세요)
	String week;		// 월, 화, 수, 목, 금, 토, 일 (예외 발생 : 월, 화, 수, 목, 금, 토, 일 만 입력하세요)
	int scoreKor; 		// 0 ~ 100 값만 입력 (예외 발생 : 0 ~ 100까지 정수만 입력 하세요)
	int scoreEng; 		// 0 ~ 100 값만 입력( 예외 발생 : 0 ~ 100까지 정수만 입력 하세요)
	String userID; 		// 12자 이상 20자 사이의 문자 ( 예외 발생 : 12자 이상 20자 사이의 문자만 넣으세요)
	
	// 하나의 메소드로 처리
	public void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if (season != "봄" && season != "여름" && season != "가을" && season != "겨울" ) {
			throw new MyAllException("봄, 여름, 가을, 겨울 ( 예외발생 : 봄,여름,가을,겨울만 입력하세요)");
		}else if(week != "월" && week != "화" && week != "수" && week != "목" && week != "금" && week != "토" && week != "일") {
			throw new MyAllException("월, 화, 수, 목, 금, 토, 일 (예외 발생 : 월, 화, 수, 목, 금, 토, 일 만 입력하세요");
		}else if(scoreKor < 0 || scoreKor > 100) {
			throw new MyAllException("0 ~ 100 값만 입력 (예외 발생 : 0 ~ 100까지 정수만 입력 하세요)");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException("0 ~ 100 값만 입력 (예외 발생 : 0 ~ 100까지 정수만 입력 하세요)");
		}else if(userID.length() < 12 && userID.length() > 20) {
			throw new MyAllException("12자 이상 20자 사이의 문자 ( 예외 발생 : 12자 이상 20자 사이의 문자만 넣으세요)");
		}else {
			System.out.println("정상적으로 값이 모두 잘 입력 되었습니다.");
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
			a.studentInfo("봄", "월", 80, 90,"aaaaaaaaaaaaaaaaaaaaaaa");
		} catch (MyAllException e) {
			System.out.println(e.getMessage());
		}
	}

}
