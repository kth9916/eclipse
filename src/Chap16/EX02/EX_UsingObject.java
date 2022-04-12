package Chap16.EX02;

// Object를 사용해서 5개의 객체를 저장하고 출력 해보기

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

class Goods{
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	} 	
	
	
}

public class EX_UsingObject {

	public static void main(String[] args) {
		
		// 1. Student 
		Goods student = new Goods();
		student.setObject(new Student("김태형", "rlaxogudsla2",1));
		System.out.println((Student)student.getObject());
		
		// 2. Professor 
		Goods professor = new Goods();
		professor.setObject(new Professor("박장우", 100,"p.jangwoo@gmail.com"));
		System.out.println((Professor)professor.getObject());
		
		// 3. Tiger 
		Goods tiger = new Goods();
		tiger.setObject(new Tiger("호랑이", "엄청 빠르게 달린다"));
		System.out.println((Tiger)tiger.getObject());
		
		// 4. Banana 
		Goods banana = new Goods();
		banana.setObject(new Banana("바나나", "노란색",4000));
		System.out.println((Banana)banana.getObject());
		
	}

}
