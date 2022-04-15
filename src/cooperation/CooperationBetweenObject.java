package cooperation;

import java.util.ArrayList;
import java.util.Scanner;

// 객체간의 협업
/*			학생의 용돈 : 100,000
 	학생		: 			버스를 탈 때 (-1000원) 지하철을 탈 때 (-1,500원)
 	버스		: 1,000원	승객 수 증가, 수입 증가
 	지하철	: 1,500원						승객수 증가, 수입 증가
 */

class Student{
	String studentName; 		// 학생명
	int money;					// 학생이 가진 돈, 초기 값 : 100,000원
	
	Student(String studentName, int money){
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {			// 학생이 버스를 탔을 때? 버스에 돈을 지불해야 한다.
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeOutBus(Bus bus) {		// 버스를 내릴 때
		bus.takeOut();
	}
	public void takeSubway(Subway subway) {			// 학생이 지하철을 탔을 때? 버스에 돈을 지불해야 한다.
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeOutSubway(Subway subway) {		// 지하철을 내릴 때
		subway.takeOut();
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	

	
}

class Bus{
	int busName; 		// 100번 버스, 200번 버스 		<== 인풋값을 받아서, 생성자.
	int passengerCount; // 승객 수
	int money;			// 버스의 수입
	
	// 생성자를 통해서 지하철 호선을 인풋 받아서 활성화
	Bus(int busName){
		this.busName = busName;
	}
	public void take(int money) {		// 버스의 수입을 처리, 승객수를 처리
		this.money += money;
		this.passengerCount += 1;
	}
	public void takeOut() {
		this.passengerCount -= 1;
	}
}

class Subway{
	
	String lineNumber; 		// "1호선" , "2호선", "3호선"
	int passengerCount;
	int money;
	
	// 생성자를 통해서 지하철 호선을 인풋 받아서 활성화
	Subway(String lineNumber){
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {		// 지하철의 수입을 처리, 승객수를 처리
		this.money += money;
		this.passengerCount += 1;
	}
	public void takeOut() {
		this.passengerCount -= 1;
	}
}

public class CooperationBetweenObject {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Student> studentList = new ArrayList<>();
	public static void studentReg() {
		System.out.println("학생 이름을 입력하세요.");
		String studentName = sc.next();
		System.out.println("학생 돈을 입력하세요.");
		int money = sc.nextInt();
		studentList.add(new Student(studentName, money));
		System.out.println("입력이 완료되었습니다.");
	}
	public static void showInfo() {
		System.out.println("학생이름\t학생돈");
		for(Student k : studentList) {
			System.out.println(k.studentName + "\t" + k.money);
		}
	}
	
	public static void busRide() {
		System.out.println("버스에 탑승할 학생의 이름을 입력하세요.");
		String studentName = sc.next();
		System.out.println("탑승할 버스를 입력하세요. ex) 100, 200");
		int busName = sc.nextInt();
		Student student = findStudent(studentName);
		student.takeBus();
		
//		000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
//		000 님의 남은돈은 000 입니다. 
//		버스 000번의 승객은 000명이고 수입은000 입니다. 
	}
	
	public static Student findStudent(String studentName) {
		Student student = null;
		for(int i=0; i < studentList.size(); i++) {
			if(studentList.get(i) != null) {
				String dbName = studentList.get(i).getStudentName();
				if(dbName.equals(studentName)) {
					student = studentList.get(i);
					break;
				}
			}
		}
		return student;
	}
	
	public static void main(String[] args) {
		System.out.println("========================================================================");
		System.out.println("1. 학생객체 생성	|  2. 학생정보 출력 및 선택	| 	3. 버스를 탐");
		System.out.println("4.  버스를 내림	|  5. 지하철을 탐			|  	6. 지하철을 내림. |  7. 종료  ");
		System.out.println("=========================================================================");
		
		System.out.print("선택>> ");
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway sub1 = new Subway("1호선");
		Subway sub2 = new Subway("2호선");
		Subway sub3 = new Subway("3호선");
		
		
		boolean run = true;
		while(run) {
			int selectNo = sc.nextInt();
			switch (selectNo){
			case 1: 
				studentReg();
				break;
			case 2: 
				showInfo();
				break;
			case 3: 
				busRide();
				break;
			}	
		}
		/*
		학생 5명 입력 : 학생당 100,000만원 초기값 할당. 
		=============================================
		1. 학생객체 생성  | 2. 학생정보 출력 및 선택  
		3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  
		=============================================
		선택>> 1
		학생이름  : 
		 돈 입력   : 

		선택>> 2 
		=====학생정보 출력=====
		학생이름	가진돈



		학생선택(이름입력)>> 


		선택>> 3
		000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		버스 000번의 승객은 000명이고 수입은000 입니다. 

		선택>> 4
		000 님 000 번 버스를 내렸습니다. 굿바이~~~. 
		000 님의 남은돈은 000 입니다. 
		버스 00번의 승객은 000명이고 수입은 000 입니다. 

		선택>> 5
		000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 

		선택>> 6
		000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
		*/ 
	}

}
