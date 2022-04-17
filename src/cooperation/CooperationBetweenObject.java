package cooperation;

import java.util.ArrayList;

import java.util.Scanner;

// ��ü���� ����
/*			�л��� �뵷 : 100,000
 	�л�		: 			������ Ż �� (-1000��) ����ö�� Ż �� (-1,500��)
 	����		: 1,000��	�°� �� ����, ���� ����
 	����ö	: 1,500��						�°��� ����, ���� ����
 */

class Student{
	String studentName; 		// �л���
	int money;					// �л��� ���� ��, �ʱ� �� : 100,000��
	Bus bus;
	Subway subway;
	
	Student(String studentName, int money){
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {			// �л��� ������ ���� ��? ������ ���� �����ؾ� �Ѵ�.
		if(this.money<1000) {
			System.out.println("�ݾ��� �����մϴ�.");
		}else {
			bus.take(1000);
			this.money -= 1000;
			this.bus = bus;
		}
	}
	public void takeOutBus(Bus bus) {		// ������ ���� ��
		if(bus.passengerCount>0) {
			bus.takeOut();
			this.bus = null;
		}else {
			System.out.println("ž���ϰ� �ִ� �ο��� �����ϴ�.");
		}

	}
	public void takeSubway(Subway subway) {			// �л��� ����ö�� ���� ��? ������ ���� �����ؾ� �Ѵ�.
		if(this.money<1500) {
			System.out.println("�ݾ��� �����մϴ�.");
		}else {
			subway.take(1500);
			this.money -= 1500;
			this.subway = subway;
		}

	}
	public void takeOutSubway(Subway subway) {		// ����ö�� ���� ��
		if(subway.passengerCount>0) {
			subway.takeOut();
			this.subway = null;
		}else {
			System.out.println("ž���ϰ� �ִ� �ο��� �����ϴ�.");
		}

	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}

	

	
}

class Bus{
	int busName; 		// 100�� ����, 200�� ���� 		<== ��ǲ���� �޾Ƽ�, ������.
	int passengerCount; // �°� ��
	int money;			// ������ ����
	
	// �����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ
	
	
	Bus(int busName){
		this.busName = busName;
	}
	public void take(int money) {		// ������ ������ ó��, �°����� ó��
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
	
	String lineNumber; 		// "1ȣ��" , "2ȣ��", "3ȣ��"
	int passengerCount;
	int money;
	
	// �����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ
	Subway(String lineNumber){
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {		// ����ö�� ������ ó��, �°����� ó��
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
		System.out.println("�л� �̸��� �Է��ϼ���.");
		String studentName = sc.next();
		Student student = new Student(studentName, 100000);
		studentList.add(student);
		
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
	}
	public static void showInfo() {
		System.out.println("�л��̸�\t�л���");
		for(Student k : studentList) {
			System.out.println(k.studentName + "\t" + k.money);
		}
	}
	
	public static void busRide() {
		System.out.println("������ ž���� �л��� �̸��� �Ʒ����� ���� �� �Է��ϼ���.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("�ش� �л��� �����ϴ�.");
			return; 		// �޼ҵ带 ���� ������ ����. �޼ҵ� ����
		}
		System.out.println("ž���� ������ �Ʒ����� ���� �� �Է��ϼ���.");
		for(Bus s : busList) {
			System.out.print(s.busName + " | ");
		}
		System.out.println();
		int busName = sc.nextInt();
		Bus bus = findBus(busName);
		if(bus == null) {
			System.out.println("�ش� ���� �뼱�� �����ϴ�.");
			return;
		}
		student.takeBus(bus);
		
		System.out.println(studentName + "�� " + busName + " �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���." );
		student.showInfo();
		System.out.println("���� " + student.bus.busName + "���� �°��� " + student.bus.passengerCount + "���̰� ������ " + student.bus.money +"�Դϴ�." );
		
	}
	public static void busLeave() {
		System.out.println("�������� ������ �л��� �̸��� �Ʒ����� ���� �� �Է��ϼ���.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("�ش� �л��� �����ϴ�.");
			return; 		// �޼ҵ带 ���� ������ ����. �޼ҵ� ����
		}
		Bus bus = findBus(student.bus.busName);
		if(bus == null) {
			System.out.println("�ش� ���� �뼱�� �����ϴ�.");
			return;
		}
		student.takeOutBus(bus);
		
		System.out.println(studentName + " �� " + bus.busName + " �� ������ ���Ƚ��ϴ�. �¹��� ~~" );
		student.showInfo();
		System.out.println("���� " + bus.busName + "���� �°��� "+bus.passengerCount + "���̰� ������ " + bus.money +"�Դϴ�." );
		
		
	}
	private static void subwayRide() {
		System.out.println("����ö�� ž���� �л��� �̸��� �Ʒ����� ���� �� �Է��ϼ���.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("�ش� �л��� �����ϴ�.");
			return; 		// �޼ҵ带 ���� ������ ����. �޼ҵ� ����
		}
		System.out.println("ž���� ����ö �뼱�� �Ʒ����� ���� �� �Է��ϼ���.");
		for(Subway d : subwayList) {
			System.out.print(d.lineNumber + " | ");
		}
		System.out.println();
		String lineNumber = sc.next();

		Subway subway = findSubway(lineNumber);
		if(subway == null) {
			System.out.println("�ش� ����ö �뼱�� �����ϴ�.");
			return;
		}
		
		student.takeSubway(subway);
		
		System.out.println(studentName + "�� " + lineNumber + "ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���." );
		student.showInfo();
		System.out.println("����ö " + student.subway.lineNumber + "ȣ���� �°��� " + student.subway.passengerCount + "���̰� ������ " + student.subway.money +"�Դϴ�." );
	}
	private static void subwayLeave() {
		System.out.println("����ö���� ������ �л��� �̸��� �Ʒ����� ���� �� �Է��ϼ���.");
		for(Student k : studentList) {
			System.out.println(">> "+k.studentName +"\t");
		}
		System.out.println();
		String studentName = sc.next();
		Student student = findStudent(studentName);
		if(student == null) {
			System.out.println("�ش� �л��� �����ϴ�.");
			return; 		// �޼ҵ带 ���� ������ ����. �޼ҵ� ����
		}
		Subway subway = findSubway(student.subway.lineNumber);
		if(subway == null) {
			System.out.println("�ش� ����ö �뼱�� �����ϴ�.");
			return;
		}
		student.takeOutSubway(subway);
		
		System.out.println(studentName + " �� " + subway.lineNumber + "ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~" );
		student.showInfo();
		System.out.println("����ö " + subway.lineNumber + "ȣ���� �°��� " + subway.passengerCount + "���̰� ������ " + subway.money +"�Դϴ�." );
		
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
			Subway s = new Subway(i+"ȣ��");
			subwayList.add(s);
		}
		
		boolean run = true;
		while(run) {
			System.out.println("========================================================================");
			System.out.println("1. �л���ü ����	|  2. �л����� ��� 	| 	3. ������ Ž");
			System.out.println("4.  ������ ����	|  5. ����ö�� Ž		|  	6. ����ö�� ����. 	| 	7. ����  ");
			System.out.println("=========================================================================");
			
			System.out.print("����>> ");
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
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("���α׷� ����Ǿ����ϴ�.");
		}
		/*
		�л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�. 
		=============================================
		1. �л���ü ����  | 2. �л����� ��� �� ����  
		3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  
		=============================================
		����>> 1
		�л��̸�  : 
		 �� �Է�   : 

		����>> 2 
		=====�л����� ���=====
		�л��̸�	������



		�л�����(�̸��Է�)>> 


		����>> 3
		000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 

		����>> 4
		000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 
		000 ���� �������� 000 �Դϴ�. 
		���� 00���� �°��� 000���̰� ������ 000 �Դϴ�. 

		����>> 5
		000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 

		����>> 6
		000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
		*/ 
	}

}
