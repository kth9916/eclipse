package Chap16.EX08;

// 제너릭 클래스르 생성해서 타입 제한(Apple, Strawberry, Banana) / Pencil은 타입으로 접근할 수 없도록 설정

abstract class Fruit{
	public abstract void print();
}

class Apple extends Fruit{
	String name;
	int price;
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("사과는 과일입니다.");
	}
}

class Strawberry extends Fruit{
	String name;
	int price;
	Strawberry(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("따릭는 과일입니다.");
	}
}
class Banana extends Fruit{
	String name;
	int price;
	
	Banana(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("바나나는 과일입니다.");
	}
}

class Pencil{
	String name;
	int price;
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
}

// 제너릭 클래스 :  Fruit 타입만 올 수 있음.
class Generic <T extends Fruit>{ 		// DTO(Data Transfer Object) - getter, setter, VO(Value Object) - getter
										// 데이터를 받아서 전송하는 중간자 역활을 함.
										// 계층 간에 값을 받아서 전송, 중간자 역활
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public void printing() {
		t.print();
	}
}

public class EX_Restrict_Generic_Type {
	public static void main(String[] args) {
		Generic<Apple> g1 = new Generic<>();
		Generic<Strawberry> g2 = new Generic<>();
		Generic<Banana> g3 = new Generic<>();
//		Generic<Pencil> g4 = new Generic<>(); 		Pencil은 Fruit에 포함되지 않음.
		
		g1.setT(new Apple("사과", 4000));
		System.out.println(g1.getT());
		g1.printing();
		System.out.println("==========================");
		g2.setT(new Strawberry("딸기", 4000));
		System.out.println(g2.getT());
		g2.printing();
		System.out.println("==========================");
		g3.setT(new Banana("바나나", 4000));
		System.out.println(g3.getT());
		g3.printing();
		System.out.println("==========================");
		
	}

}
