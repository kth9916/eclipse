package Chap10.EX01;

class Student_sub extends Student{
		//Student_sub�� Student�� ��� �ް� �ִ�. Student�� �ʵ�� �޼ҵ带 ��� �޴´�.
		// Student�� Person�� ��� �ް� �ִ�. Student�� Person�� �ʵ�� �޼ҵ带 ��� �ް� �ִ�.
		
		// Student_sub�� person �� �ʵ�� �޼ҵ�� Student�� �ʵ�� �޼ҵ带 ��� ��� �޴´�.
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_sub1Ŭ���� �Դϴ�. �θ��� �ʵ�� �޼ҵ带 ���� �޽��ϴ�.");
	}
	
}


class Student extends Person{ 		// ���л� Ŭ���� , Person : �θ� Ŭ���� / Student : �ڽ� Ŭ���� 
	// �ڽ� Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ������ �״�� ��� �޴´�. 
	int studentID;
	void goToSchool() {
		System.out.println("�ڽ� Ŭ������ Student �޼ҵ� goToSchool ȣ��");
	}
}

class Worker extends Person{ 		// ������ Ŭ���� 
	int workerID; 	// ���
	void goToWork() {
		System.out.println("������ Ŭ������ �޼ҵ� ȣ��");
	}
}

public class Person { 	// ��� : �θ� Ŭ������ (�ʵ�, �޼ҵ�, ����Ŭ����) �� �ڽ� Ŭ�������� ���
	
	String name ; 		// ����� ���� : 1. �ߺ��� �ڵ��� ����(�ڵ��� ����) 
									// 2. �ڵ尡 �������� / 3. ������(�޼ҵ� �������̵�)
									// ������ : �޼ҵ� 
	 												
	int age;
	
	void eat() {
		System.out.println("�θ� Ŭ������ eat() �޼ҵ�");
	}
	void sleep() {
		System.out.println("�θ� Ŭ������ sleep() �޼ҵ�");
	}
	




	public static void main(String[] args) {
		
		// 1. person ��ü ����
		Person p = new Person();
		p.name = "ȫ�浿";
		p.age = 11;
		p.eat();
		p.sleep();
		
		
		System.out.println("======= Student Ŭ���� =============");
		// 2. Student ��ü ����
		Student s = new Student(); 		// Person Ŭ������ ���, Person Ŭ������ �ʵ�� �޼ҵ带 ��� 
				// �ڽ� Ŭ������ �θ� Ŭ������ ����� �ʵ�� �޼ҵ带 ���.
		
		
		// Person Ŭ������ �ʵ�
		s.name = "�̼���";
		s.age = 50;
		// Student Ŭ������ �ʵ�
		s.studentID = 20220310;
		
		// Person Ŭ������ �޼ҵ�
		s.eat();
		s.sleep();
		
		// Student Ŭ������ �޼ҵ�
		s.goToSchool();
		
		
		System.out.println("========== Worker Ŭ���� =================");
		// 3. Worker ��ü ����
		Worker w = new Worker(); 	// Person Ŭ������ ��� �Ѵ�. Person Ŭ������ �ʵ�� �޼ҵ� ���.
		
		// �θ� Ŭ������ �ʵ� : Person
		w.name = "�������";
		w.age = 60;
		
		// �ڽ� Ŭ������ �ʵ� : Worker
		w.workerID = 20220310; 	// ���
		
		// �θ� Ŭ������ �޼ҵ� : Person
		w.eat();
		w.sleep();
		
		// �ڽ� Ŭ������ �޼ҵ� : Worker
		w.goToWork();
		
		System.out.println("==== ��ü ������ Ÿ�� ��ȯ =====");
		
		Person p1 = new Person(); // Person()�� Person�̴�. (�ڽ��� �θ��.)
		Person p2 = new Student(); // ��ĳ���� , Student�� Person�̴�
//		Student sp = new Person(); // ����! Person�� Student�̴�(���� X)
		Person pw = new Worker(); // ��ĳ���� , Worker��  Person�̴�.(O)
//		Worker wp = new Person(); // ����!, Person�� �������̴�
		
		System.out.println("====Person <==Student <==Student_sub ==========");
		
		Student_sub sub1 = new Student_sub(); 	//����
		// Ŭ����Ÿ��(Type) ��ü�� < �ڽ� Ŭ���� > 
		
			// Person Ŭ������ �ʵ�� �޼ҵ� ��� ����
			sub1.name = "�Ż��Ӵ�";
			sub1.age = 50;
			sub1.eat();
			sub1.sleep();
			// Student Ŭ������ �ʵ�� �޼ҵ� 
			sub1.studentID = 20220310;
			sub1.goToSchool();
			// Student_sub�� �ʵ�� �޼ҵ�
			sub1.sub1 = "�ڽ��� �ڽ� Ŭ����";
			sub1.sub1();
		
		Person ps1 = new Student_sub(); // ��ĳ���� ; Student_sub ��ü�� ������ �θ� ������ Ÿ������ ����ȯ
			// Student_sub�� Person Ÿ������ ��ĳ���� , PersonŬ������ ����� ��� ����, Student_sub�� ����� �Ұ�������
			ps1.name = "BTS"; 	// Person Ŭ������ �ʵ�� �޼ҵ常 ����
			ps1.age = 30;
			ps1.eat();
			ps1.sleep();
		
		Student ss1 = new Student_sub(); // ��ĳ���� : Student_sub�� Student Ÿ������ ��ĳ����
				// Person�� Student�� �ʵ�� �޼ҵ带 ��� ����
			//Person�� �ʵ�� �޼ҵ�
			ss1.name = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			//Student�� �ʵ�� �޼ҵ�
			ss1.studentID = 20220310;
			ss1.goToSchool();
		
		Student_sub ss2 = new Student_sub();	// Person, Student, Student_sub�� �ʵ�� �޼ҵ� ��� ���
			//Person�� �ʵ�� �޼ҵ�
			ss2.name = "�����������ܿ�";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			//Student�� �ʵ�� �޼ҵ�
			ss2.studentID = 20220310;
			ss2.goToSchool();
			//Student_sub�� �ʵ�� �޼ҵ�
			ss2.sub1 = "�ڽ��� �ڽ� Ŭ����";
			ss2.sub1();
			
		// ��� ���迡�� ��ü ������ �θ� ������ Ÿ������ ��ĳ���� ���� . 
			// �θ� ������ Ÿ������ ��ĳ���õ� ��� �θ��� �ʵ�� �޼ҵ常 ��밡��
			
			// Person <== Student <== Student_sub
			
			Person ps4 = new Student_sub();
				// Student_sub ��ü ������ Person Ÿ������ ��ĳ����
				// Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
				// �� �߿��� Person Ŭ������ �ʵ�� �޼ҵ常 ���� ����
			Student ss4 = new Student_sub();
				// Student_sub ��ü ������ Student Ÿ������ ��ĳ����
				// Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
				// �� �߿��� Person�� Student Ŭ������ �ʵ�� �޼ҵ常 ���� ����
			Student_sub ss5 = new Student_sub();
			// Student_sub ��ü ������ Student_sub Ÿ������ ��ĳ����
			// Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
			// �� �߿��� Person�� Student,Student_sub Ŭ������ �ʵ�� �޼ҵ� ��� ���� ����
			
			// �ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���� �Ȱ��� �ڽ� ������ Ÿ������ ��ȯ (�������� ��ȯ)
			
			Student ps5 = (Student)ps4 ; 	// ps4(Person, Student, Student_sub)�� ������ Ÿ���� person
					// ps5�� Person, Student�� �ʵ�� �޼ҵ� ���� ����
			ps5.name = "�ٿ�ĳ����";
			ps5.age	 = 30;
			ps5.studentID = 20220310; 	// Student �ʵ�� �޼ҵ� ��� ����
			ps5.goToSchool(); 			// Student�� �޼ҵ� ���
			
			Student_sub ps6 = (Student_sub)ps4; 	// ps4�� Person ������ Ÿ�Կ��� Student_sub�� �ٿ�ĳ����
				// Student_sub�� �ٿ�ĳ���õ� (Person, Student, Student_sub�� �ʵ�� �޼ҵ� ��� ����
			ps6.name = "�̿��"; // Person
			ps6.studentID = 20220310; //Student
			ps6.sub1 = "�ڽ��� �ڽ�"; //Student_sub
			
			
			
			
			
			
	}

}
