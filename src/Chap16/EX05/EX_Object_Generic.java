package Chap16.EX05;

//Generic을 사용해서 5개의 객체를 저장하고 출력 해보기

class Student{
	String name;
	String id;
	int pass;
	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " , ID : " + id + " , pass : " + pass;
	}
}

class Professor{
	String name;
	int year;
	String email;
	
	Professor(String name, int year, String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " , year : " + year + " , email : " + email;
	}
}

class Tiger{
	String name;
	String run; 	// 달린다
	
	Tiger(String name, String run){
		this.name = name;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " , run : " + run;
	}
}

class Banana{
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " , color : " + color + " , price : " + price;
	}
}

class Goods<T>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class EX_Object_Generic {

	public static void main(String[] args) {
		
		Goods<Student> goods1 = new Goods<Student>();
		goods1.setT(new Student("김태형", "rlaxogudsla1",1));
		System.out.println(goods1.getT());
		
		Goods<Professor> goods2 = new Goods<Professor>();
		goods2.setT(new Professor("박장우",100, "p.jangwoo@gmail.com"));
		System.out.println(goods2.getT());
		
		Goods<Tiger> goods3 = new Goods<Tiger>();
		goods3.setT(new Tiger("호랑이", "달린다"));
		System.out.println(goods3.getT());
		
		Goods<Banana> goods4 = new Goods<Banana>();
		goods4.setT(new Banana("바나나", "노란색",4000));
		System.out.println(goods4.getT());

	}
}
