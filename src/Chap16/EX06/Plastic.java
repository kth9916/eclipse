package Chap16.EX06;

// GenericPrinter에 사용될 객체 [재료]

public class Plastic {

	public void doPringting() {
		System.out.println("플라스틱 재료로 출력합니다. ");
	}
	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}

}
