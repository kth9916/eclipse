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
	Bus bus;
	Subway subway;
	
	Student(String studentName, int money){
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {			// 학생이 버스를 탔을 때? 버스에 돈을 지불해야 한다.
		if(this.money<1000) {
			System.out.println("금액이 부족합니다.");
		}else {
			bus.take(1000);
			this.money -= 1000;
			this.bus = bus;
		}
	}
	public void takeOutBus(Bus bus) {		// 버스를 내릴 때
		if(bus.passengerCount>0) {
			bus.takeOut();
			this.bus = null;
		}else {
			System.out.println("탑승하고 있는 인원이 없습니다.");
		}

	}
	public void takeSubway(Subway subway) {			// 학생이 지하철을 탔을 때? 버스에 돈을 지불해야 한다.
		if(this.money<1500) {
			System.out.println("금액이 부족합니다.");
		}else {
			subway.take(1500);
			this.money -= 1500;
			this.subway = subway;
		}

	}
	public void takeOutSubway(Subway subway) {		// 지하철을 내릴 때
		if(subway.passengerCount>0) {
			subway.takeOut();
			this.subway = null;
		}else {
			System.out.println("탑승하고 있는 인원이 없습니다.");
		}

	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
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
		this.passengerCount ++;
	}
	public void takeOut() {
		this.passengerCount --;
	}
	public int getBusName() {
		return busName;
	}
	public void setBusName(int busName) {
		this.busName = busName;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
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
		passengerCount += 1;
	}
	public void takeOut() {
		this.passengerCount -= 1;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
}


public class CooperationBetweenObject {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Student> studentList = new ArrayList<>();
	public static ArrayList<Bus> busList = new ArrayList<>();
	public static ArrayList<Subway> subwayList = new ArrayList<>();
	public static void studentReg() {
		System.out.println("학생 이름을 입력하세요.");
		String studentName = sc.next();
		Student student = new Student(studentName, 100000);
		studentList.add(student);
		
		System.out.println("입력이 완료되었습니다.");
	}
	public static void showInfo() {
		System.out.println("학생이름\t학생돈");
		for(Student k : studentList) {
			System.out.println(k.studentName + "\t" + k.money);
		}
	}
	
	public static void busRide() {
		System.out.println("버스에 탑승할 학생의 이름을 아래에서 선택 후 입력하세요.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("해당 학생이 없습니다.");
			return; 		// 메소드를 빠져 나오기 위함. 메소드 종료
		}
		System.out.println("탑승할 버스를 아래에서 선택 후 입력하세요.");
		for(Bus s : busList) {
			System.out.print(s.busName + " | ");
		}
		System.out.println();
		int busName = sc.nextInt();
		Bus bus = findBus(busName);
		if(bus == null) {
			System.out.println("해당 버스 노선이 없습니다.");
			return;
		}
		student.takeBus(bus);
		
		System.out.println(studentName + "님 " + busName + " 번 버스를 탔습니다. 즐거운 하루되세요." );
		student.showInfo();
		System.out.println("버스 " + student.bus.busName + "번의 승객은 " + student.bus.passengerCount + "명이고 수입은 " + student.bus.money +"입니다." );
		
	}
	public static void busLeave() {
		System.out.println("버스에서 하차할 학생의 이름을 아래에서 선택 후 입력하세요.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("해당 학생이 없습니다.");
			return; 		// 메소드를 빠져 나오기 위함. 메소드 종료
		}
		Bus bus = findBus(student.bus.busName);
		if(bus == null) {
			System.out.println("해당 버스 노선이 없습니다.");
			return;
		}
		student.takeOutBus(bus);
		
		System.out.println(studentName + " 님 " + bus.busName + " 번 버스를 내렸습니다. 굿바이 ~~" );
		student.showInfo();
		System.out.println("버스 " + bus.busName + "번의 승객은 "+bus.passengerCount + "명이고 수입은 " + bus.money +"입니다." );
		
		
	}
	private static void subwayRide() {
		System.out.println("지하철에 탑승할 학생의 이름을 아래에서 선택 후 입력하세요.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("해당 학생이 없습니다.");
			return; 		// 메소드를 빠져 나오기 위함. 메소드 종료
		}
		System.out.println("탑승할 지하철 노선을 아래에서 선택 후 입력하세요.");
		for(Subway d : subwayList) {
			System.out.print(d.lineNumber + " | ");
		}
		System.out.println();
		String lineNumber = sc.next();

		Subway subway = findSubway(lineNumber);
		if(subway == null) {
			System.out.println("해당 지하철 노선이 없습니다.");
			return;
		}
		
		student.takeSubway(subway);
		
		System.out.println(studentName + "님 " + lineNumber + "호선 지하철을 탔습니다. 즐거운 하루되세요." );
		student.showInfo();
		System.out.println("지하철 " + student.subway.lineNumber + "호선의 승객은 " + student.subway.passengerCount + "명이고 수입은 " + student.subway.money +"입니다." );
	}
	private static void subwayLeave() {
		System.out.println("지하철에서 하차할 학생의 이름을 아래에서 선택 후 입력하세요.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("해당 학생이 없습니다.");
			return; 		// 메소드를 빠져 나오기 위함. 메소드 종료
		}
		Subway subway = findSubway(student.subway.lineNumber);
		if(subway == null) {
			System.out.println("해당 지하철 노선이 없습니다.");
			return;
		}
		student.takeOutSubway(subway);
		
		System.out.println(studentName + " 님 " + subway.lineNumber + "호선 지하철을 내렸습니다. 안녕 ~~~" );
		student.showInfo();
		System.out.println("지하철 " + subway.lineNumber + "호선의 승객은 " + subway.passengerCount + "명이고 수입은 " + subway.money +"입니다." );
		
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
	private static Bus findBus(int busName) {
		Bus bus = null;
		for(int i=0; i < busList.size(); i++) {
			if(busList.get(i) != null) {
				int dbName = busList.get(i).getBusName();
				if(dbName == busName) {
					bus = busList.get(i);
					break;
				}
			}
		}
		return bus;
	}
	private static Subway findSubway(String lineNumber) {
		Subway subway = null;
		for(int i=0; i < subwayList.size(); i++) {
			if(subwayList.get(i) != null) {
				String dbName = subwayList.get(i).getLineNumber();
				if(dbName.equals(lineNumber)) {
					subway = subwayList.get(i);
					break;
				}
			}
		}
		return subway;
	}
	
	public static void main(String[] args) {
		try {
		for(int i = 1; i<9; i++) {		 
			Bus b = new Bus(i*100);
			busList.add(b);
		}
		
		for(int i = 1; i<9; i++) {		
			Subway s = new Subway(i+"호선");
			subwayList.add(s);
		}
		
		boolean run = true;
		while(run) {
			System.out.println("========================================================================");
			System.out.println("1. 학생객체 생성	|  2. 학생정보 출력 	| 	3. 버스를 탐");
			System.out.println("4.  버스를 내림	|  5. 지하철을 탐		|  	6. 지하철을 내림. 	| 	7. 종료  ");
			System.out.println("=========================================================================");
			
			System.out.print("선택>> ");
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
			case 4: 
				busLeave();
				break;
			case 5: 
				subwayRide();
				break;
			case 6: 
				subwayLeave();
				break;
			case 7: 
				run = false;
				break;
			}	
		}
		
		}catch(Exception e) {
			System.out.println("예외가 발생되었습니다.");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("프로그램 종료되었습니다.");
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
