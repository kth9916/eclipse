package Chap10.EX07.EX03;

import java.util.HashMap;
// HashMap : key = �� ���� ����Ǵ� �ڷᱸ��
	// key�� �ߺ� �� �� ����
	// HashMap�� Key�� ��ü�� ������ ���, Key�� ����Ǵ� ��ü�� �ߺ����� �ʴ� ������ ������ ������ �ؾ��Ѵ�.
	// Object Ŭ������ hashcode() �� ����ؼ� ��ü�� ������ ���� �ߺ����� �ʵ��� ������ �� �ִ�.

class A {
	String name;
	
	A(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class B { 				// hashCode() + equals() ������
	String name;
	
	B(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1 = new HashMap<>(); 		// <Integer <== key, String <== Value
		hm1.put(1, "������1");
		hm1.put(1, "������2"); 		// 1 : ������1 == > 1 : ������2
		hm1.put(2, "������3");		
		
		
		System.out.println(hm1); 	// 1 = ������1 , 2 = ������3
		
		System.out.println("=============================");
		
		HashMap<A, String> hm2 = new HashMap<>(); 		// equals()�� ������ �Ǿ� �ִ�. 
		hm2.put(new A("ù ��°"), "������1");				// hashCode() ������ �ȵǾ� �ִ�.
		hm2.put(new A("ù ��°"), "������2");
		hm2.put(new A("�� ��°"), "������3");
		
		System.out.println(hm2); 	// HashMap�� �߸� ������ ���
		
		System.out.println("============================");
		
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("ù ��°"), "������1");
		hm3.put(new B("ù ��°"), "������2");
		hm3.put(new B("�� ��°"), "������3");
		
		System.out.println(hm3); 	// HashMap ������ ����� ������ ��� : Key�� �ߺ� �Ǹ� �ȵȴ�
				// hm3(HashMap)�� toString() �޼ҵ尡 ������ �Ǿ��ִ�.
		
		System.out.println("ù ��°".hashCode());
		System.out.println("ù ��°".hashCode());
		System.out.println("�� ��°".hashCode());
		
		
	}

}