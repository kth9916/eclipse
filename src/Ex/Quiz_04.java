package Ex;

class E extends Object {
	String name;
	
	E (){} 			// �⺻ ������ : Ŭ���� ���� �ٸ� �����ڰ� ������ �� �ܺο��� �⺻�����ڸ� ȣ���� �� �����Ǹ� �ȵȴ�.
	E (String name) {
		this.name = name; 	// �Ű����� �̸�, �����ο��� �Ű������� �޴� ������, �ʵ��� �������� ��� ����
							// this :�ڽ��� ��ü 
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name; 			// this.name
	}
	

	
}

class Student {
	int studentId;
	String name;
	int kor;
	int eng;
	
	Student(int studentId, String name, int kor, int eng){
		this.studentId = studentId;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.studentId == ((Student)obj).studentId) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return studentId + " , " + name + " , " + kor + " , " + eng ;
	}
	
}

public class Quiz_04 {

	public static void main(String[] args) {
		Student s1 = new Student(1111, "ȫ�浿", 90, 80);
		Student s2 = new Student(2222, "�̼���", 75, 65);
		Student s3 = new Student(3333, "������", 100, 100);
		Student s4 = new Student(1111, "������", 90, 90);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		/* studentId�� ���� ��� ���� �л��̴� ��� ���
		 ��ü�� StudentId �÷��� ���ؼ� ���� ��� ���� �л� �̴ٶ�� ���
			 == : �⺻ Ÿ�� : boolean, byte, short, int, long, double, float,char : 8�� ���� ��
			 		���� Ÿ�� : ��ü�� �ּҸ� ��, �迭, ��ü, String (Ư���ϰ� ���)
			 			String : toString() ������ �Ǿ� �ִ�. equals(������)
			 		Object�� toString() - ��ü ��ü�� println(a), ��Ű���̸�.Ŭ�����̸�@�ؽ��ڵ�
			 							�������̵� �ؼ� �������� ��ü�� �ʵ��� ������ ���.
			 							
			 				.equals() : ==�� ����, ��ü�� �ּҸ� ��
			 							������ �ؼ� ��ü ���� Ư�� �ʵ��� ���� ��.
		
		*/
		System.out.println(s1.equals(s4)); 	// true
		
		if(s1.equals(s4)) {
			System.out.println("s1�� s4�� ���� �л��Դϴ�.");
		} else {
			System.out.println("s1�� s4�� �ٸ� �л��Դϴ�.");
		}
		

		
		
		E e1 = new E ();  				// �⺻ ������ ȣ�� : Heap�� �ʵ��� ���� ���� �ʱ�ȭ ��
		System.out.println(e1.name);
		
		E e2 = new E ("�����");
		System.out.println(e2.name);
		
		E e3 = new E("�����");
		
		System.out.println(e2 == e3); 		// ���� Ÿ�� (== ) : ��ü�� �ּҸ� ��
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3)); // object�� equals() : (==) :  ��ü�� �ּҸ� ��
		//object�� toString(), equals()�� ������ �ؼ� ���
		
	}

}
