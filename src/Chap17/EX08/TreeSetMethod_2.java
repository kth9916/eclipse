package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet�� ���� : 1. �ߺ� ������� �ʴ´�. (Set) 2. �������� ���ĵǾ� �Է� 3. ���ĵǾ� ���(��������) 4. �˻������ ���
				// 5. Ư�� ������ ���� ���� 6. asc(�������� ����) , desc(�������� ����)

// TreeSet�� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ�� �� ���� �ʵ尡 �����ؾ� �Ѵ�.
	// 1. Comparable<E> �������̽��� compareTo() �޼ҵ� : TreeSet�� �Ϲ� ��ü�� ������ �� �Ϲ� ��ü�� Ư�� �ʵ带 ������ �ؾ� �Ѵ�.
		// ������ Ŭ������ �����ؼ� ���. Comparable<E> �������̽��� ��� �� compareTo() �޼ҵ� ������ 
		// ������ Ŭ������ ����
	// 2. Comparator<E> �������̽� compare() �޼ҵ带 ������ ��. <<�͸��� ��ü�� ���>>
		// ������ ��ü�� �������� �ʰ� ����� ��.
		// TreeSet<E> ��ü�� ������ �� �����ڿ� Comparator<E> �������̽��� ������ �͸� ��ü�� ����.



class MyClass{ 	// �Ϲ� Ŭ���� / �̰ŷδ� �Ұ�����.
	int data1;
	int data2;
	
	public MyClass(int data1, int data2){
		this.data1 = data1;
		this.data2 = data2;
	}
}

// Comparable<E> �������̽��� ������ Ŭ���� ����
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1; 			// <<== �ʵ带 �� �������� ����, compareTo() ������
	int data2;
	
	public MyComparableClass(int data1, int data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { 		// ��ü�� ũ�� �� ������ �����ϴ� �޼ҵ�, <TreeSet���� ���> (����, 0, ���)
		// �������� ó�� ���
		
//		if(this.data1 < o.data1) {  					// this.data1 ���� ���� ���� ��� : -1 (����)
//			return -1;
//		} else if (this.data1 == o.data1) {				// this.data1 ���� ���� ���� ��� : 0
//			return 0;
//		} else {										// // this.data1 ���� ���� Ŭ ��� : 1 (���)
//			return 1; 				
//		}
		
		// �������� ó�� ���
		
		if(this.data1 < o.data1) {  					// this.data1 ���� ���� ���� ��� : 1 (���)
			return 1;
		} else if (this.data1 == o.data1) {				// this.data1 ���� ���� ���� ��� : 0
			return 0;
		} else {										// // this.data1 ���� ���� Ŭ ��� : -1 (����)
			return -1; 				
		}
		
	}
	@Override
	public String toString() {
		return data1 + " - " + data2;
	}
}

class MyClass2{ 	
	int data1;
	int data2;
	
	public MyClass2(int data1, int data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + " - " + data2;
	}
}

public class TreeSetMethod_2 {

	public static void main(String[] args) {
		// Wrapper Ŭ������ comparable<E> �������̽��� compareTo() �޼ҵ带 ������ �ϰ� �ִ�.
			// Wrapper Ŭ������ ���� TreeSet�� ������ ���ĵǾ� ����
		
		// 1. Integer Wrapper Ŭ������ ũ�� ��
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20); 	// ū ��
		//Integer intValue1 = 3;
		Integer intValue2 = new Integer(10); 	// ���� ��
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1); 	// �������� ���� ���.
		
		// 2. String Wrapper Ŭ������ ũ�� ��
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����"); 	// ���� ��
		// String str1 = "����"
		String str2 = new String("�ٶ�"); 	// ū ��
		
		treeSet2.add(str1); 		// treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���ǵǾ� �־�� �Ѵ�.
		treeSet2.add(str2);			// Comparable<E> �������̽��� compareTo() �޼ҵ� ������ �Ǿ�� �Ѵ�.
		
		System.out.println(treeSet2);
		
		// 3. MyClass�� TreeSet�� ������ �ɱ�? �ȵȴ� -- > Comparable<E> �������̽��� compareTo() �޼ҵ尡 ������ �Ǿ�� TreeSet �÷��ǿ� ���� ����
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myClass1 = new MyClass(2,5);
//		MyClass myClass2 = new MyClass(3,3);
//		
//		treeSet3.add(myClass1); 	// TreeSet���� Comparable<E> �������̽��� compareTo() �޼ҵ带 �������� Ŭ������ ���� �� �ִ�.
//		treeSet3.add(myClass2);		// ����� ���� �߻���
//		
//		System.out.println(treeSet3);
		
		// TreeSet�� �Ϲ� ��ü�� ������ ���. 
		// 4. ��� 1. MyComparableClass ��ü ũ�� �� : Comparable<E> �������̽��� compareTo() ������
				// ���� ��ü�� ������ �ʿ�. �ٽ� ������
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		
		MyComparableClass m1 = new MyComparableClass(2,5); 		// TreeSet�� ����� �� Comparable<E> �������̽��� compareTo() ������
		MyComparableClass m2 = new MyComparableClass(5,3);
		MyComparableClass m3 = new MyComparableClass(4,3);
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		
		System.out.println(treeSet4);
		System.out.println("==============================");
		
		// 5. ��� 2. ������ ��ü�� �������� �ʰ� TreeSet�� ������ ���.
		// TreeSet ������ ���ο� Comparator<E> �������̽��� �����ؼ� �͸�ü�� ����
		TreeSet<MyClass2> treeSet5 = new TreeSet<MyClass2>(new Comparator<MyClass2>() {
			@Override
			public int compare(MyClass2 o1, MyClass2 o2) {
				if(o1.data1 < o2.data1) {
					return -1;
				} else if(o1.data1 == o2.data1) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		MyClass2 m4 = new MyClass2(2,5);
		MyClass2 m5 = new MyClass2(3,3);
		MyClass2 m6 = new MyClass2(4,6);
		
		treeSet5.add(m4);
		treeSet5.add(m5);
		treeSet5.add(m6);
		
		System.out.println(treeSet5);
	
	
	}

}
