package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է����� �� �̸��� ������������ ����ϵ��� �����ϴ�. TreeSet�� name �÷���
// 1. Comparable<E>�� compareTo() �޼ҵ� ������
		// ������ ��ü ������ �ʿ�
// 2. Comparator<E>�� compare() ����
		// ������ ��ü�� ���� ���� ����

class Abc implements Comparable<Abc>{
	String name; 		// <-- �÷��� ���� �÷�. ���� ���� ���� : ��,��,��,�� ....��
					// ȫ�浿, �̼���, ������ ===>> ������ , �̼���, ȫ�浿
	int age;
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Abc o) {
			return name.compareTo(o.name);
			/*
			 * ��� 2
			 * if(this.name.charAt(0) <o.name.charAt(0)){
			 * 		return -1;
			 * } else if(this.name.charAt(0) == o.name.charAt(0)){
			 * 		return 0;
			 * } else{
			 * 		return 1;
			 * }
			 */
	}
	@Override
	public String toString() {
		return name + " - " + age;
	}

}

class Abc2 {
	String name; 		// <-- �÷��� ���� �÷�. ���� ���� ���� : ��,��,��,�� ....��
					// ȫ�浿, �̼���, ������ ===>> ������ , �̼���, ȫ�浿
	int age;
	
	public Abc2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " - " + age;
	}
}

public class EX_TreeSetMethod_3 {

	public static void main(String[] args) {
		TreeSet<Abc> treeSet1 = new TreeSet<Abc>(); 
		Abc a1 = new Abc("������", 20);
		Abc a2 = new Abc("�̼���", 25);
		Abc a3 = new Abc("ȫ�浿", 30);
		
		treeSet1.add(a1);
		treeSet1.add(a2);
		treeSet1.add(a3);
		
		System.out.println(treeSet1);
		
		System.out.println("=====================================");
		
		TreeSet<Abc2> treeSet2 = new TreeSet<Abc2>(new Comparator<Abc2>() {
			@Override
			public int compare(Abc2 o1, Abc2 o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		Abc2 a4 = new Abc2("������",20);
		Abc2 a5 = new Abc2("�̼���",30);
		Abc2 a6 = new Abc2("ȫ�浿",40);
		
		treeSet2.add(a4);
		treeSet2.add(a5);
		treeSet2.add(a6);
		
		System.out.println(treeSet2);
	}

}
