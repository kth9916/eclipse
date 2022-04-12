package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList VS LinkedList
// ArrayList : 값에 대해서 index 값을 가지고 있다. 검색 속도가 빠르다.
			// 단점 : 중간에서 값을 추가/삭제 시 부하가 굉장히 많이 걸린다.
// LinkedList : 각각의 값은 앞뒤의 연결고리만 가지고 있다. 검색시에 index 번호가 할당된다. 검색이 느리다.
			// 장점 : 중간에 값을 추가/삭제 시 부하가 걸리지 않는다.

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		
		// 1. 데이터를 추가시 시간 비교
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1 Array List에서 데이터 추가시간
		startTime = System.nanoTime(); 		// Ststem.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.add(0, i); 		// 0번째 방에 계속 해서 10만번 까지 이전에 생긴 숫자가 뒤로 밀리고 새로 생긴 숫자가 0번째에 들어와서 값이 추가됨.
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가 시간 " + (endTime - startTime) + "ns");
				// 354527100ns
		
		// 1-2 LinkedList에서 데이터 추가 시간 : ArrayList보다 빠르다.
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedlist.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 추가 시간 " + (endTime - startTime) + "ns");
				// 3499600ns : ArrayList보다 250배 정도 빠르다.
		
		
		System.out.println("============================================");
		// 2. 검색시 비교 : ArrayList가 LinkedList보다 빠르다.
		// 2-1 ArrayList 검색 시간
		
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 검색 시간 " + (endTime - startTime) + "ns");
				// 934400ns
		
		// 2-2 LinkedList 검색 시간
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 검색 시간 " + (endTime - startTime) + "ns");
				// 2896831700ns
		
		System.out.println("============================================");
		
		// 3. 데이터 삭제시 실행 시간 비교 : LinkedList가 훨씬 빠르다.
		// 3-1 ArrayList
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			aList.remove(0); 		// index 0번째 자리를 제거, 값이 당겨온다.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 삭제 시간 " + (endTime - startTime) + "ns");
				// 270825100ns
		
		// 3-2 LinkedList
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			linkedlist.remove(0); 		// index 0번째 자리를 제거, 값이 당겨온다.
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 삭제 시간 " + (endTime - startTime) + "ns");
				// 2696800ns
	}

}
