package Chap13.EX10.EX2;

import Chap13.EX10.EX2.Abc.Def;

class Abc {		
	
	// 1. ��ü ���� �� ��ü�� ���� �� �Ҵ� (d1)
	// 2. �����ڸ� ���ؼ� �� �Ҵ� (d2)
	// 3. settter ���ؼ��� �����ϴ�. (d3)
	
				// �ʵ� ���
	Def d; 		// ���ο����� Def Ÿ��������, �ܺο����� Abc.Def Ÿ���̴�.
				
				
	
	Abc(){}		// ������ ��� / 
	Abc(Def d){ 		// �����ڸ� ���ؼ� �� �Ҵ� / Def ��� Ÿ���� ��ü�� �޾Ƽ� �޸𸮿� �ε�
		this.d = d;
	}
	
	void setDef (Def d) { 	// setter�� ���ؼ� �ʵ��� �⺻�� �Ҵ�
		this.d = d;
	}
	
	interface Def { 	// ABC.Def
		void run ();
		void fly ();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
		
}

public class InnerInterface_1_2_Difficult {

	public static void main(String[] args) {
		// 1. ��ü ���� �� �ʵ忡 ���� �Ҵ�
		Abc a1 = new Abc();
		a1.d = (Abc.Def) new Abc.Def() { 	//  Abc.Def��� Ÿ���� �ڽ� ��ü a1�� �ְ� ���. 
			
			@Override
			public void run() {
				System.out.println("���� �޸���.");
			}
			
			@Override
			public void fly() {
				System.out.println("���� ���� ���Ѵ�.");
			}
		};
		a1.ghi();
		
		System.out.println("=========================================");
		// 2. �����ڸ� �̿��ؼ� ���� �Ҵ�
		Abc a2 = new Abc(
				new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("����̴� �޸���.");
			}
			
			@Override
			public void fly() {
				System.out.println("����̴� ���� ���Ѵ�.");
			}
		});
		
		a2.ghi();
		
		System.out.println("=========================================");
		// 3. setter�� ���ؼ� ���� �Ҵ�
		Abc a3 = new Abc();
		a3.setDef(new Abc.Def() { 		// Abc.Def ??? (�̳� �������̽� Ÿ���� �Ű�����) = new Abc.Def();
			
			@Override
			public void run() {
				System.out.println("�������� �޸��� ���Ѵ�.");
			}
			
			@Override
			public void fly() {
				System.out.println("�������� ���� �ִ�.");
			}
		});
		
		a3.ghi();
}
}
