package chap06_07.Ex03;

class Car {
	String company; 		// �ʵ��� company�� �˷��ִ� this, heap �޸𸮿� ����
	String model; 			// �ν��Ͻ� : ��üȭ�� ���� �� ��� ������ �ʵ�
	String color;			// [�ʵ�� : �ʵ��� ��]�� heap ������ ����
	double maxspeed;
	
	Car(String company, String model, String color, double max){
		this.company = company; 	// this�� this.company�� �ʵ��� company�� �����ִ°�. this�� ������ string company�� ���ư�
		this.model = model;			// 3���� ���� ��ΰ� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ����
		this.color = color;			
		maxspeed = max; 		// this Ű���尡 ������ ����
		}
	
	void intro() { 		// �޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ����   // �޼ҵ��� ��ü ������ Ŭ���� ������ �޼ҵ� ������ ����
		System.out.println("company : " + company + ", model : " + model + ", color : " + color + ", maxspeed : " + maxspeed);
	}
}

public class Q1 {

	public static void main(String[] args) {
		// �����ڸ� ���ؼ� �⺻ ���� �Ҵ��� �޸��� ������ work() �޼ҵ带 ����ؼ� ���.
		
		Car avantte = new Car("����", "������", "����", 200); 
		avantte.intro();
		
		Car sonata = new Car("����", "����", "���", 290); 
		sonata.intro();
		
		Car grandeur = new Car("����", "�ش���", "ȸ��", 290); 
		grandeur.intro();
		
		Car ferrari = new Car("���", "������ī", "����", 830); 
		ferrari.intro();
		
		Car rollsroyce = new Car("�ѽ����̽�", "����SUV", "�ʷ�", 563); 
		rollsroyce.intro();
	}

}
