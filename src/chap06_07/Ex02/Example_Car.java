package chap06_07.Ex02;

public class Example_Car {

	public static void main(String[] args) {
		// Car Class�� ��üȭ �ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ� �ؼ� ��� �غ�����.
		// �� ������ ���� �Ҵ��ϰ� ����غ�����(�޸𸮸� ���� ���, settor�� ���ؼ� ���� �Ҵ�)
		
		Car sonata = new Car();
		
		System.out.println("=======sonata=========");
		
		// ������ ���� ���� �Ҵ�, ���� ������ �ƴϴ�. �޸𸮿� ��ġ �ʴ� ���� ���� �Ҵ�
		// private ������ : ĸ��ȭ, ���� ������ ���� �Ҵ����� ���ϵ��� �Ѵ�. 
		// settor�� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ������ �� �ִ�.
		
		sonata.company = "����";
		sonata.model = "����";
		sonata.color = "black";
		sonata.maxSpeed =290; 		// ���̳ʽ� ��, 700�� �̻��� ���� �� ������ ����
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("����");
		sonata.setModel("����");
		sonata.setColor("black");
		sonata.setMaxSpeed(290);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car avantte = new Car();
		
		System.out.println("==========avantte========");
		sonata.company = "����";
		sonata.model = "������";
		sonata.color = "white";
		sonata.maxSpeed =204;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("����");
		sonata.setModel("������");
		sonata.setColor("white");
		sonata.setMaxSpeed(204);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car gradndeur = new Car();
		
		System.out.println("==========grandeur========");
		sonata.company = "����";
		sonata.model = "�ش���";
		sonata.color = "gray";
		sonata.maxSpeed =290;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("����");
		sonata.setModel("�ش���");
		sonata.setColor("gray");
		sonata.setMaxSpeed(290);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car ferrari = new Car();
		
		System.out.println("==========ferrari========");
		sonata.company = "���";
		sonata.model = "������ī";
		sonata.color = "red";
		sonata.maxSpeed =830;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("���");
		sonata.setModel("������ī");
		sonata.setColor("red");
		sonata.setMaxSpeed(830);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car rollsroyce = new Car();
		
		System.out.println("==========rollsroyce========");
		sonata.company = "�ѽ����̽�";
		sonata.model = "���� SUV";
		sonata.color = "black";
		sonata.maxSpeed =563;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("�ѽ����̽�");
		sonata.setModel("���� SUV");
		sonata.setColor("black");
		sonata.setMaxSpeed(563);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
	
	}

}
