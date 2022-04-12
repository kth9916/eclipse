package Ex;

import chap06_07.Ex02.A;

class Studen{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	
	int sum;
	double avg;
	
	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�. ");
	}

	@Override
	public String toString() {		//  Object Ŭ������ �޼ҵ�, ��ü ��ü�� ����� ��, [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : " + name + " , �й� : " + studentID + " , ���� : " + kor + " , ���� : " + eng + " , ���� : " + math 
				 + " , �հ� : " + sum + " , ��� : " + avg;
	}
	
	
	
}

class S_ö�� extends Studen{
	S_ö��(String a, int b, int c, int d, int e){
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum/3;
	}

	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}	
}

class S_���� extends Studen{
	S_����(String a, int b, int c, int d, int e){			// ������ : 1. Ŭ������� ����, 2. ����Ÿ��
		super.name = a;					// super ���� Ŭ����, this : �ڽ��� ��ü
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum / 3; 		// ����� ����� ������ (double)�� ĳ���� ������Ѵ�.
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� ����ť�Դϴ�. ");
	}
}

class S_���� extends Studen{
	S_����(String a, int b, int c, int d, int e){
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum /3;
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� �߱��Դϴ�. ");
	}
	
	
}


public class quiz03 {

	public static void main(String[] args) {
		Studen a11 = new S_ö��("ö��", 1, 90, 80, 70);
		Studen b11 = new S_����("����", 2, 75, 70, 65);
		Studen c11 = new S_����("����", 3, 13, 37, 68);
		
		Studen[] arr = {a11, b11, c11};
		
		System.out.println("=========== for ==============");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
		System.out.println("========== Enhanced for ===========");
		
		for(Studen k : arr) {
			System.out.println(k);
			k.hobby();
		}
		
		System.out.println("=====================================");
		
		System.out.println(a11);
		System.out.println(b11);
		System.out.println(c11);
		
		System.out.println("======================");
		
		a11.hobby();
		b11.hobby();
		c11.hobby();
		
	}

}
