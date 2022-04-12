package Chap17.EX02;

// Vector : ArrayList�� ��� �޼ҵ带 �����ϰ� ���. 
	// Vector�� ��� �޼ҵ尡 ����ȭ ó���� �Ǿ� �ִ�. ��Ƽ ������ ȯ�濡 ���ǵ��� �Ǿ� �ִ�.

// �̱� ������ ȯ�� : ArrayList
// ��Ƽ ������ ȯ�� : Vector

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod_1 {

	public static void main(String[] args) {
		
		// List�� �޼ҵ� : 13�� ������ �޼ҵ�
			// 1. ArrayList
			// 2. Vector
			// 3. LinkedList
		
		List<Integer> vector1 = new Vector<Integer>();
		
		// 1. add(E element) : ������ ���� ���� �߰��ϱ�
		vector1.add(3); vector1.add(4); vector1.add(5);
		System.out.println(vector1); 			// �� ���
		System.out.println(vector1.size());  	// ���� ����
		
		// 2. add(int index, E element)
		vector1.add(1,6); 	// ���ȣ 1���� 6�� add
		System.out.println(vector1);
		
		// 3. addAll (�� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer> vector2 = new Vector();
		vector2.add(1);
		vector2.add(2);
		System.out.println(vector2);
		
		vector2.addAll(vector1); 		// aList1�� ����� ���� �����ؼ� aList2�� �߰�
		System.out.println(vector2);
		
		// 4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> vector3 = new Vector();
		vector3.add(1);
		vector3.add(2);
		
		vector3.addAll(1, vector3); 	// �ڽ��� �����ٰ� �ٸ� ��ü�� �߰�
		
		System.out.println(vector3);
		
		// 5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		vector3.set(1, 5); 	// 1�� ���ȣ�� ���� 5�� ����
		vector3.set(3, 6);
//		aList3.set(4, 7); 	// ���� �߻�, 4�� ���� ����. IndexOutOfBoundsException
		
		System.out.println(vector3);
		
		// 6. remove(int index) : Ư�� ���ȣ�� ���� ����
		vector3.remove(1); 	// ���ȣ 1�� �濡 �ִ� ���� ����
		System.out.println(vector3);
		
		// 7 . remove(Object o) : ������ ����
		vector3.remove(new Integer(2)); 	// ������ ������ �� �� �ִ�.
		System.out.println(vector3);
		
		// 8 . clear() : ��� ����
		vector3.clear();
		System.out.println(vector3);
		
		// 9. isEmpty() : ���� ��� ������ True, ��� ���� ������ false
		System.out.println(vector3.isEmpty());
		
		// 10. size() : ���� ����, ���� ����
		System.out.println(vector3.size());
		vector3.add(1); vector3.add(2); vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		// 11. get(int index) : ���ȣ�� ���� ���
		System.out.println(vector3.get(0));
		System.out.println(vector3.get(1));
		System.out.println(vector3.get(2));
		
		System.out.println("=========================");
		
		System.out.println(vector3);
		
		// 12. toArray() : List(����Ʈ) ----> Array (�迭) �� ��ȯ
		Object[] object = vector3.toArray(); 		// �⺻������ toArray() �޼ҵ�� Object Ÿ������ ������ ��
				// �ٿ�ĳ������ �ʿ��ϴ�.
		
		System.out.println(Arrays.toString(object)); 	// �迭�� ������ Arrays.toString() ���
		
		System.out.println("===============================");
		
		// 13-1 toArray(T[] t) 	====> t[] : Inter�� �ٷ� ĳ����
		Integer[] integer1 = vector3.toArray(new Integer[0]); 		
			// 0�� �ǹ� : ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´�
		System.out.println(Arrays.toString(integer1));
		
		System.out.println("===============================");
		// 13-2 toArray(T[] t) 	====> t[] : Inter�� �ٷ� ĳ����
		Integer[] integer2 = vector3.toArray(new Integer[5]); 		// size = 5
		System.out.println(Arrays.toString(integer2));
	}

}
