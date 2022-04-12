package Chap17.EX12;

import java.util.Comparator;
import java.util.TreeMap;

// TreeMap<K,V> : Key�� ���ĵǾ ó�� <�������� ����>
	// Key : �Ϲ� ��ü�� ����� ���, Comparable<E> compareTo(), comparator<E> compare() �����ǰ� �ʿ�.

// �Ϲ� Ŭ����
class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 + " �� ���";
	}
}

// COmparable<E> �������̽��� compareTo() �������� Ŭ����
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 + " �� ���";
	}
	public int compareTo(MyComparableClass o) { 	// ���� ���� ���� ��� ó��
		if(this.data1 < o.data1) {
			return -1;
		} else if(this.data1 == o.data1) {
			return 0;
		} else {
			return 1;
		}
	};
}

public class TreeMapMethod_2 {

	public static void main(String[] args) {
		
		// 1. MyClass�� TreeMap�� Key�� ��ǲ�� ��� : ����� ����
		/*
		TreeMap<MyClass, String> treeMap1 = new TreeMap(); 
		
		MyClass m1 = new MyClass(2,5);
		MyClass m2 = new MyClass(3,3);
		
		treeMap1.put(m1, "ù ��°"); 		// Comparable,Comparator �������� �ʾҴµ�, TreeMap�� Key�� ���, ����� ����
		treeMap1.put(m2, "�� ��°");
		
		System.out.println(treeMap1);
		*/
		
		// 2. Comparable�� ������ Ŭ������ ��� <== ��ü ����
		TreeMap<MyComparableClass, String> treeMap2 = new TreeMap();
		
		MyComparableClass my1 = new MyComparableClass(2,5);
		MyComparableClass my3 = new MyComparableClass(10,5);
		MyComparableClass my2 = new MyComparableClass(3,3);
		
		treeMap2.put(my1, "ù ��°");
		treeMap2.put(my3, "�� ��°");
		treeMap2.put(my2, "�� ��°");
		
		System.out.println(treeMap2);
		
		// 3. Comparator �� ���� : ������ ��ü�� ���, ��ü ������ ���ʿ�
		TreeMap<MyClass, String> treeM = new TreeMap( new Comparator<MyClass>() {
			// �͸� �ڽ� Ŭ����
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data2) {
					return -1;
				} else if(o1.data1 == o2.data1) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		MyClass m4 = new MyClass(2,5);
		MyClass m6 = new MyClass(20,20);
		MyClass m5 = new MyClass(3,3);
		
		treeM.put(m4, "ù ��°");
		treeM.put(m6, "�� ��°");
		treeM.put(m5, "�� ��°");
		
		System.out.println(treeM);
		System.out.println(treeM.size());
		
		
		
	}

}