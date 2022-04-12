package Chap17.EX03;

// LinkedList : ArrayList�� ��� �޼ҵ带 �����ϰ� ���. 
	// LinkedList�� ��� �޼ҵ尡 ����ȭ ó���� �Ǿ� �ִ�. ��Ƽ ������ ȯ�濡 ���ǵ��� �Ǿ� �ִ�.

// �̱� ������ ȯ�� : ArrayList
// ��Ƽ ������ ȯ�� : LinkedList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class LinkedListMethod_1 {

	public static void main(String[] args) {
		
		// List�� �޼ҵ� : 13�� ������ �޼ҵ�
			// 1. ArrayList
			// 2. LinkedList
			// 3. LinkedList
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		// 1. add(E element) : ������ ���� ���� �߰��ϱ�
		linkedlist1.add(3); linkedlist1.add(4); linkedlist1.add(5);
		System.out.println(linkedlist1); 			// �� ���
		System.out.println(linkedlist1.size());  	// ���� ����
		
		// 2. add(int index, E element)
		linkedlist1.add(1,6); 	// ���ȣ 1���� 6�� add
		System.out.println(linkedlist1);
		
		// 3. addAll (�� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer> linkedlist2 = new LinkedList();
		linkedlist2.add(1);
		linkedlist2.add(2);
		System.out.println(linkedlist2);
		
		linkedlist2.addAll(linkedlist1); 		// aList1�� ����� ���� �����ؼ� aList2�� �߰�
		System.out.println(linkedlist2);
		
		// 4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> linkedlist3 = new LinkedList();
		linkedlist3.add(1);
		linkedlist3.add(2);
		
		linkedlist3.addAll(1, linkedlist3); 	// �ڽ��� �����ٰ� �ٸ� ��ü�� �߰�
		
		System.out.println(linkedlist3);
		
		// 5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		linkedlist3.set(1, 5); 	// 1�� ���ȣ�� ���� 5�� ����
		linkedlist3.set(3, 6);
//		aList3.set(4, 7); 	// ���� �߻�, 4�� ���� ����. IndexOutOfBoundsException
		
		System.out.println(linkedlist3);
		
		// 6. remove(int index) : Ư�� ���ȣ�� ���� ����
		linkedlist3.remove(1); 	// ���ȣ 1�� �濡 �ִ� ���� ����
		System.out.println(linkedlist3);
		
		// 7 . remove(Object o) : ������ ����
		linkedlist3.remove(new Integer(2)); 	// ������ ������ �� �� �ִ�.
		System.out.println(linkedlist3);
		
		// 8 . clear() : ��� ����
		linkedlist3.clear();
		System.out.println(linkedlist3);
		
		// 9. isEmpty() : ���� ��� ������ True, ��� ���� ������ false
		System.out.println(linkedlist3.isEmpty());
		
		// 10. size() : ���� ����, ���� ����
		System.out.println(linkedlist3.size());
		linkedlist3.add(1); linkedlist3.add(2); linkedlist3.add(3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		// 11. get(int index) : ���ȣ�� ���� ���
		System.out.println(linkedlist3.get(0));
		System.out.println(linkedlist3.get(1));
		System.out.println(linkedlist3.get(2));
		
		System.out.println("=========================");
		
		System.out.println(linkedlist3);
		
		// 12. toArray() : List(����Ʈ) ----> Array (�迭) �� ��ȯ
		Object[] object = linkedlist3.toArray(); 		// �⺻������ toArray() �޼ҵ�� Object Ÿ������ ������ ��
				// �ٿ�ĳ������ �ʿ��ϴ�.
		
		System.out.println(Arrays.toString(object)); 	// �迭�� ������ Arrays.toString() ���
		
		System.out.println("===============================");
		
		// 13-1 toArray(T[] t) 	====> t[] : Inter�� �ٷ� ĳ����
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]); 		
			// 0�� �ǹ� : ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´�
		System.out.println(Arrays.toString(integer1));
		
		System.out.println("===============================");
		// 13-2 toArray(T[] t) 	====> t[] : Inter�� �ٷ� ĳ����
		Integer[] integer2 = linkedlist3.toArray(new Integer[5]); 		// size = 5
		System.out.println(Arrays.toString(integer2));
	}

}
