package Chap16.EX06.EX1;

// GenericPrinter에 사용될 객체 [재료]

public class Plastic extends Material{

	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}
	
	public void doPrinting() {   // 추상 메소드와 클래스를 구현한 메소드
		System.out.println("플라스틱 재료로 출력합니다. ");
	}

}
