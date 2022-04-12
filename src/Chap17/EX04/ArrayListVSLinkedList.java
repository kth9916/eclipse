package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList VS LinkedList
// ArrayList : ���� ���ؼ� index ���� ������ �ִ�. �˻� �ӵ��� ������.
			// ���� : �߰����� ���� �߰�/���� �� ���ϰ� ������ ���� �ɸ���.
// LinkedList : ������ ���� �յ��� ������� ������ �ִ�. �˻��ÿ� index ��ȣ�� �Ҵ�ȴ�. �˻��� ������.
			// ���� : �߰��� ���� �߰�/���� �� ���ϰ� �ɸ��� �ʴ´�.

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		
		// 1. �����͸� �߰��� �ð� ��
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1 Array List���� ������ �߰��ð�
		startTime = System.nanoTime(); 		// Ststem.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.add(0, i); 		// 0��° �濡 ��� �ؼ� 10���� ���� ������ ���� ���ڰ� �ڷ� �и��� ���� ���� ���ڰ� 0��°�� ���ͼ� ���� �߰���.
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �߰� �ð� " + (endTime - startTime) + "ns");
				// 354527100ns
		
		// 1-2 LinkedList���� ������ �߰� �ð� : ArrayList���� ������.
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedlist.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ �߰� �ð� " + (endTime - startTime) + "ns");
				// 3499600ns : ArrayList���� 250�� ���� ������.
		
		
		System.out.println("============================================");
		// 2. �˻��� �� : ArrayList�� LinkedList���� ������.
		// 2-1 ArrayList �˻� �ð�
		
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �˻� �ð� " + (endTime - startTime) + "ns");
				// 934400ns
		
		// 2-2 LinkedList �˻� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ �˻� �ð� " + (endTime - startTime) + "ns");
				// 2896831700ns
		
		System.out.println("============================================");
		
		// 3. ������ ������ ���� �ð� �� : LinkedList�� �ξ� ������.
		// 3-1 ArrayList
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.remove(0); 		// index 0��° �ڸ��� ����, ���� ��ܿ´�.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ ���� �ð� " + (endTime - startTime) + "ns");
				// 270825100ns
		
		// 3-2 LinkedList
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedlist.remove(0); 		// index 0��° �ڸ��� ����, ���� ��ܿ´�.
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ ���� �ð� " + (endTime - startTime) + "ns");
				// 2696800ns
	}

}
