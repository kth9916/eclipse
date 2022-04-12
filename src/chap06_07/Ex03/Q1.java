package chap06_07.Ex03;

class Car {
	String company; 		// 필드의 company를 알려주는 this, heap 메모리에 저장
	String model; 			// 인스턴스 : 객체화를 했을 때 사용 가능한 필드
	String color;			// [필드명 : 필드의 값]은 heap 영역에 저장
	double maxspeed;
	
	Car(String company, String model, String color, double max){
		this.company = company; 	// this는 this.company가 필드의 company다 말해주는것. this가 없으면 string company로 돌아감
		this.model = model;			// 3개의 변수 모두가 동일할 경우 객체의 필드의 변수를 알려주는 역할
		this.color = color;			
		maxspeed = max; 		// this 키워드가 생략된 상태
		}
	
	void intro() { 		// 메소드(인스턴스 메소드) : Heap 영역에 메소드명과 포인터를 저장   // 메소드의 전체 구문은 클래스 영역의 메소드 영역에 저장
		System.out.println("company : " + company + ", model : " + model + ", color : " + color + ", maxspeed : " + maxspeed);
	}
}

public class Q1 {

	public static void main(String[] args) {
		// 생성자를 통해서 기본 값을 할당후 메모리의 내용을 work() 메소드를 사용해서 출력.
		
		Car avantte = new Car("현대", "준중형", "검정", 200); 
		avantte.intro();
		
		Car sonata = new Car("현대", "중형", "흰색", 290); 
		sonata.intro();
		
		Car grandeur = new Car("현대", "준대형", "회색", 290); 
		grandeur.intro();
		
		Car ferrari = new Car("페라리", "스포츠카", "빨강", 830); 
		ferrari.intro();
		
		Car rollsroyce = new Car("롤스로이스", "대형SUV", "초록", 563); 
		rollsroyce.intro();
	}

}
