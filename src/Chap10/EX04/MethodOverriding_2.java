package Chap10.EX04;

class Animal2{
	void run() {
		
	}
}

class Tiger extends Animal2{ 	// ȣ���̴� �׹߷� �޸��ϴ�.
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�. ");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�. ");
	}
}

class Eagle extends Animal2{ 	// �������� �ϴ��� ���ϴ�.
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�. ");
	}
	void eagleEat() {
		System.out.println("�������� �ٸ� ���� ��� �Խ��ϴ�. ");
	}
}

class Snake extends Animal2{	// ���� ���ٴմϴ�.
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�. ");
	}
	void snakeEat() {
		System.out.println("���� �������� ���� �Խ��ϴ�. ");
	}
}

public class MethodOverriding_2 {

	public static void main(String[] args) {
		
		// 1. ��� ��ü�� Animal2 Ÿ������ ��ĳ�����ؼ� ����
		Animal2 a = new Animal2();
		Tiger b = new Tiger();
		Eagle c = new Eagle();
		Snake d = new Snake();
		
		Animal2 ab = new Tiger();
		Animal2 ac = new Eagle();
		Animal2 ad = new Snake();
		
		// 2. Animal2 �迭�� �� ��ü�� ����
		Animal2[] animal2 = {b,c,d};
		
		System.out.println("========= For �� ==========");
		// 3. for������ �迭�� ��ü�� ��� .run()�� ����
		for(int i = 0; i < animal2.length; i++) {
			animal2[i].run();
		}
		
		System.out.println("======== Enhanced For �� =========");
		// 4. Enhanced For ���� ����ؼ� ��ü�� run method ���
		for(Animal2 k : animal2) {
			k.run();
		}
		System.out.println("======== instanceof =============");
		// 5. �ٿ� ĳ���� �ؼ� (instanceof) ����ؼ� 
		if (ab instanceof Tiger) {
			Tiger t = (Tiger)ab;
			t.tigerEat();
		}else {
			System.out.println("ab�� Tiger Ÿ������ �ٿ�ĳ���� �Ұ�");
		}
		
		if (ac instanceof Eagle) {
			Eagle e = (Eagle)ac;
			e.eagleEat();
		}else {
			System.out.println("ac�� Eagle Ÿ������ �ٿ�ĳ���� �Ұ�");
		}
		
		if (ad instanceof Snake) {
			Snake s = (Snake)ad;
			s.snakeEat();
		}else {
			System.out.println("ad�� Snake Ÿ������ �ٿ�ĳ���� �Ұ�");
		}
		
	}

}
