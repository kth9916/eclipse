package Chap16.EX08;

// ���ʸ� Ŭ������ �����ؼ� Ÿ�� ����(Apple, Strawberry, Banana) / Pencil�� Ÿ������ ������ �� ������ ����

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
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("����� �����Դϴ�.");
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
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("������ �����Դϴ�.");
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
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("�ٳ����� �����Դϴ�.");
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
		return name + "�̰� ������ " + price;
	}
}

// ���ʸ� Ŭ���� :  Fruit Ÿ�Ը� �� �� ����.
class Generic <T extends Fruit>{ 		// DTO(Data Transfer Object) - getter, setter, VO(Value Object) - getter
										// �����͸� �޾Ƽ� �����ϴ� �߰��� ��Ȱ�� ��.
										// ���� ���� ���� �޾Ƽ� ����, �߰��� ��Ȱ
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
//		Generic<Pencil> g4 = new Generic<>(); 		Pencil�� Fruit�� ���Ե��� ����.
		
		g1.setT(new Apple("���", 4000));
		System.out.println(g1.getT());
		g1.printing();
		System.out.println("==========================");
		g2.setT(new Strawberry("����", 4000));
		System.out.println(g2.getT());
		g2.printing();
		System.out.println("==========================");
		g3.setT(new Banana("�ٳ���", 4000));
		System.out.println(g3.getT());
		g3.printing();
		System.out.println("==========================");
		
	}

}
