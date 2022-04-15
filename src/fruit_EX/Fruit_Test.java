package fruit_EX;

import java.util.ArrayList;
import java.util.Scanner;

/*		상속을 다루는 문제입니다. 하위의 생성자에 super() 메소드 사용
  		
  	
 */

class Fruit {
	String fruitName; 		// 과일 이름
	String color;			// 과일 색깔
	int large;				// 과일 크기
	
	public Fruit() {};
	public Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	
	public String toString() { 		// 과일의 정보를 출력 하는 메소드
		return "과일명 : <" + fruitName + "> 이고, 색깔은 <" + color + "> 이고, 크기는 <" + large + ">입니다.";
	}
	
}

class Apple extends Fruit{
	// fruit안의 필드와 메소드 모두 들어옴
	// 생성자 만들어서 프루트안에 넣어주고 어레이리스트로 저장하고 enhance for문으로 출력

	
	public Apple(String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Orange extends Fruit{

	
	public Orange(String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Banana extends Fruit{

	
	public Banana(String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}



public class Fruit_Test {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Fruit> fList = new ArrayList<>();
	
	public static void apple() {
		System.out.println("과일명을 입력하세요.");
		String fruitName = sc.next();
		System.out.println("과일의 색깔을 입력하세요.");
		String color = sc.next();
		System.out.println("과일의 크기를 입력하세요.");
		int large = sc.nextInt();
		
		Fruit apple = new Apple(fruitName,color, large);
		
		fList.add(apple);
		System.out.println("<<<"+fruitName + "의 정보가 정상적으로 입력되었습니다.>>>");
	}
	
	public static void banana() {
		System.out.println("과일명을 입력하세요.");
		String fruitName = sc.next();
		System.out.println("과일의 색깔을 입력하세요.");
		String color = sc.next();
		System.out.println("과일의 크기를 입력하세요.");
		int large = sc.nextInt();
		
		Fruit banana = new Banana(fruitName,color, large);
		
		fList.add(banana);
		System.out.println("<<<"+fruitName + "의 정보가 정상적으로 입력되었습니다.>>>");
	}
	
	public static void orange() {
		System.out.println("과일명을 입력하세요.");
		String fruitName = sc.next();
		System.out.println("과일의 색깔을 입력하세요.");
		String color = sc.next();
		System.out.println("과일의 크기를 입력하세요.");
		int large = sc.nextInt();
		
		Fruit Orange = new Orange(fruitName,color, large);
		
		fList.add(Orange);
		System.out.println("<<<"+fruitName + "의 정보가 정상적으로 입력되었습니다.>>>");
	}
	
	public static void main(String[] args) {
		
		
		
		
		/* 1. 코드 작성 : 스캐너를 인풋 받는 코드 작성.
		  선택 >>
		 =================================================
		 1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보 출력 | 5. 종료
		 =================================================
		 
		 선택 >> 1
		 과일명	: 
		 색깔		:
		 크기		:
		 
		 */
		
		// 2. 코드 작성 : 스캐너로 인풋받은 각각의 객체를 생성해서 ArrayList에 저장.
		
		// 3. 선택 >> 4 : ArrayList의 모든 객체를 가져와서 객체를 출력했을 때 (Enhanced For 문을 사용해서 ) 
				// 출력 결과 : 
				// 과일명 : <사과> 이고, 색깔은 <빨간색> 이고, 크기는 <10>입니다.
				// 과일명 : <오랜지> 이고, 색깔은 <오랜지색> 이고, 크기는 <20>입니다.
				// 과일명 : <바나나> 이고, 색깔은 <노란색> 이고, 크기는 <30>입니다.
		
		System.out.println("=================================================");
		System.out.println("1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보 출력 | 5. 종료");
		System.out.println("=================================================");
		
		System.out.print("선택 >> ");
		
		Fruit fr = new Fruit();
		boolean run = true;
		while(run) {
			int selectNo = sc.nextInt();
			switch(selectNo) {
			
			case 1: 
				apple();
				break;
				
			case 2: 
				
				orange();
				break;
			case 3: 
				banana();
				break;
			case 4:
				for(Fruit k : fList) {
					System.out.println(k.toString());
				}
				break;
			case 5:
				run = false;
				break;
		}
			System.out.println("=================================================");
			System.out.println("1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보 출력 | 5. 종료");
			System.out.println("=================================================");
		}
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
