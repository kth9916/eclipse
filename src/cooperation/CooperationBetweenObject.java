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
	
	Student(String studentName, int money){
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {			// �л��� ������ ���� ��? ������ ���� �����ؾ� �Ѵ�.
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeOutBus(Bus bus) {		// ������ ���� ��
		bus.takeOut();
	}
	public void takeSubway(Subway subway) {			// �л��� ����ö�� ���� ��? ������ ���� �����ؾ� �Ѵ�.
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeOutSubway(Subway subway) {		// ����ö�� ���� ��
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
	int busName; 		// 100�� ����, 200�� ���� 		<== ��ǲ���� �޾Ƽ�, ������.
	int passengerCount; // �°� ��
	int money;			// ������ ����
	
	// �����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ
	Bus(int busName){
		this.busName = busName;
	}
	public void take(int money) {		// ������ ������ ó��, �°����� ó��
		this.money += money;
		this.passengerCount += 1;
	}
	public void takeOut() {
		this.passengerCount -= 1;
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
		System.out.println("�л� �̸��� �Է��ϼ���.");
		String studentName = sc.next();
		System.out.println("�л� ���� �Է��ϼ���.");
		int money = sc.nextInt();
		studentList.add(new Student(studentName, money));
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
	}
	public static void showInfo() {
		System.out.println("�л��̸�\t�л���");
		for(Student k : studentList) {
			System.out.println(k.studentName + "\t" + k.money);
		}
	}
	
	public static void busRide() {
		System.out.println("������ ž���� �л��� �̸��� �Է��ϼ���.");
		String studentName = sc.next();
		System.out.println("ž���� ������ �Է��ϼ���. ex) 100, 200");
		int busName = sc.nextInt();
		Student student = findStudent(studentName);
		student.takeBus();
		
//		000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
//		000 ���� �������� 000 �Դϴ�. 
//		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 
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
		System.out.println("1. �л���ü ����	|  2. �л����� ��� �� ����	| 	3. ������ Ž");
		System.out.println("4.  ������ ����	|  5. ����ö�� Ž			|  	6. ����ö�� ����. |  7. ����  ");
		System.out.println("=========================================================================");
		
		System.out.print("����>> ");
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway sub1 = new Subway("1ȣ��");
		Subway sub2 = new Subway("2ȣ��");
		Subway sub3 = new Subway("3ȣ��");
		
		
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
