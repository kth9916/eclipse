package fruit_EX;

import java.util.ArrayList;
import java.util.Scanner;

/*		����� �ٷ�� �����Դϴ�. ������ �����ڿ� super() �޼ҵ� ���
  		
  	
 */

class Fruit {
	String fruitName; 		// ���� �̸�
	String color;			// ���� ����
	int large;				// ���� ũ��
	
	public Fruit() {};
	public Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	
	public String toString() { 		// ������ ������ ��� �ϴ� �޼ҵ�
		return "���ϸ� : <" + fruitName + "> �̰�, ������ <" + color + "> �̰�, ũ��� <" + large + ">�Դϴ�.";
	}
	
}

class Apple extends Fruit{
	// fruit���� �ʵ�� �޼ҵ� ��� ����
	// ������ ���� ����Ʈ�ȿ� �־��ְ� ��̸���Ʈ�� �����ϰ� enhance for������ ���

	
	public Apple(String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Orange extends Fruit{

	
	public Orange(String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Banana extends Fruit{

	
	public Banana(String fruitName, String color, int large) {
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}



public class Fruit_Test {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Fruit> fList = new ArrayList<>();
	
	public static void apple() {
		System.out.println("���ϸ��� �Է��ϼ���.");
		String fruitName = sc.next();
		System.out.println("������ ������ �Է��ϼ���.");
		String color = sc.next();
		System.out.println("������ ũ�⸦ �Է��ϼ���.");
		int large = sc.nextInt();
		
		Fruit apple = new Apple(fruitName,color, large);
		
		fList.add(apple);
		System.out.println("<<<"+fruitName + "�� ������ ���������� �ԷµǾ����ϴ�.>>>");
	}
	
	public static void banana() {
		System.out.println("���ϸ��� �Է��ϼ���.");
		String fruitName = sc.next();
		System.out.println("������ ������ �Է��ϼ���.");
		String color = sc.next();
		System.out.println("������ ũ�⸦ �Է��ϼ���.");
		int large = sc.nextInt();
		
		Fruit banana = new Banana(fruitName,color, large);
		
		fList.add(banana);
		System.out.println("<<<"+fruitName + "�� ������ ���������� �ԷµǾ����ϴ�.>>>");
	}
	
	public static void orange() {
		System.out.println("���ϸ��� �Է��ϼ���.");
		String fruitName = sc.next();
		System.out.println("������ ������ �Է��ϼ���.");
		String color = sc.next();
		System.out.println("������ ũ�⸦ �Է��ϼ���.");
		int large = sc.nextInt();
		
		Fruit Orange = new Orange(fruitName,color, large);
		
		fList.add(Orange);
		System.out.println("<<<"+fruitName + "�� ������ ���������� �ԷµǾ����ϴ�.>>>");
	}
	
	public static void main(String[] args) {
		
		
		
		
		/* 1. �ڵ� �ۼ� : ��ĳ�ʸ� ��ǲ �޴� �ڵ� �ۼ�.
		  ���� >>
		 =================================================
		 1. ��� | 2. ������ | 3. �ٳ��� | 4. ���� ��� | 5. ����
		 =================================================
		 
		 ���� >> 1
		 ���ϸ�	: 
		 ����		:
		 ũ��		:
		 
		 */
		
		// 2. �ڵ� �ۼ� : ��ĳ�ʷ� ��ǲ���� ������ ��ü�� �����ؼ� ArrayList�� ����.
		
		// 3. ���� >> 4 : ArrayList�� ��� ��ü�� �����ͼ� ��ü�� ������� �� (Enhanced For ���� ����ؼ� ) 
				// ��� ��� : 
				// ���ϸ� : <���> �̰�, ������ <������> �̰�, ũ��� <10>�Դϴ�.
				// ���ϸ� : <������> �̰�, ������ <��������> �̰�, ũ��� <20>�Դϴ�.
				// ���ϸ� : <�ٳ���> �̰�, ������ <�����> �̰�, ũ��� <30>�Դϴ�.
		
		System.out.println("=================================================");
		System.out.println("1. ��� | 2. ������ | 3. �ٳ��� | 4. ���� ��� | 5. ����");
		System.out.println("=================================================");
		
		System.out.print("���� >> ");
		
		Fruit fr = new Fruit();
		boolean run = true;
		while(run) {
			int selectNo = sc.nextInt();
			switch(selectNo) {
			
			case 1: 
				apple();
				break;
				
			case 2: 
				
				orange();
				break;
			case 3: 
				banana();
				break;
			case 4:
				for(Fruit k : fList) {
					System.out.println(k.toString());
				}
				break;
			case 5:
				run = false;
				break;
		}
			System.out.println("=================================================");
			System.out.println("1. ��� | 2. ������ | 3. �ٳ��� | 4. ���� ��� | 5. ����");
			System.out.println("=================================================");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	}

}
