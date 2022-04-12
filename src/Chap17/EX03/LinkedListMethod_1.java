package Chap17.EX03;

// LinkedList : ArrayList와 모든 메소드를 동일하게 사용. 
	// LinkedList는 모든 메소드가 동기화 처리가 되어 있다. 멀티 쓰레드 환경에 사용되도록 되어 있다.

// 싱글 쓰레드 환경 : ArrayList
// 멀티 쓰레드 환경 : LinkedList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class LinkedListMethod_1 {

	public static void main(String[] args) {
		
		// List의 메소드 : 13개 정도의 메소드
			// 1. ArrayList
			// 2. LinkedList
			// 3. LinkedList
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		// 1. add(E element) : 마지막 값에 값을 추가하기
		linkedlist1.add(3); linkedlist1.add(4); linkedlist1.add(5);
		System.out.println(linkedlist1); 			// 값 출력
		System.out.println(linkedlist1.size());  	// 값의 갯수
		
		// 2. add(int index, E element)
		linkedlist1.add(1,6); 	// 방번호 1번에 6을 add
		System.out.println(linkedlist1);
		
		// 3. addAll (또 다른 리스트의 객체를 복사해서 추가)
		List<Integer> linkedlist2 = new LinkedList();
		linkedlist2.add(1);
		linkedlist2.add(2);
		System.out.println(linkedlist2);
		
		linkedlist2.addAll(linkedlist1); 		// aList1에 저장된 값을 복사해서 aList2에 추가
		System.out.println(linkedlist2);
		
		// 4. addAll(int index, 또 다른 객체)
		List<Integer> linkedlist3 = new LinkedList();
		linkedlist3.add(1);
		linkedlist3.add(2);
		
		linkedlist3.addAll(1, linkedlist3); 	// 자신의 값에다가 다른 객체를 추가
		
		System.out.println(linkedlist3);
		
		// 5. set(int index, E element) : 특정 방번호의 값을 수정
		linkedlist3.set(1, 5); 	// 1번 방번호의 값을 5로 수정
		linkedlist3.set(3, 6);
//		aList3.set(4, 7); 	// 오류 발생, 4번 방은 없음. IndexOutOfBoundsException
		
		System.out.println(linkedlist3);
		
		// 6. remove(int index) : 특정 방번호의 값을 삭제
		linkedlist3.remove(1); 	// 방번호 1번 방에 있는 값을 삭제
		System.out.println(linkedlist3);
		
		// 7 . remove(Object o) : 값으로 삭제
		linkedlist3.remove(new Integer(2)); 	// 값으로 삭제를 할 수 있다.
		System.out.println(linkedlist3);
		
		// 8 . clear() : 모두 삭제
		linkedlist3.clear();
		System.out.println(linkedlist3);
		
		// 9. isEmpty() : 값이 비어 있으면 True, 비어 있지 않으면 false
		System.out.println(linkedlist3.isEmpty());
		
		// 10. size() : 방의 갯수, 값의 갯수
		System.out.println(linkedlist3.size());
		linkedlist3.add(1); linkedlist3.add(2); linkedlist3.add(3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		// 11. get(int index) : 방번호의 값을 출력
		System.out.println(linkedlist3.get(0));
		System.out.println(linkedlist3.get(1));
		System.out.println(linkedlist3.get(2));
		
		System.out.println("=========================");
		
		System.out.println(linkedlist3);
		
		// 12. toArray() : List(리스트) ----> Array (배열) 로 변환
		Object[] object = linkedlist3.toArray(); 		// 기본적으로 toArray() 메소드는 Object 타입으로 리턴이 됨
				// 다운캐스팅이 필요하다.
		
		System.out.println(Arrays.toString(object)); 	// 배열일 때에는 Arrays.toString() 사용
		
		System.out.println("===============================");
		
		// 13-1 toArray(T[] t) 	====> t[] : Inter로 바로 캐스팅
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]); 		
			// 0의 의미 : 리스트에 저장된 값보다 작을 경우 리스트에 저장된 값만 가지고 온다
		System.out.println(Arrays.toString(integer1));
		
		System.out.println("===============================");
		// 13-2 toArray(T[] t) 	====> t[] : Inter로 바로 캐스팅
		Integer[] integer2 = linkedlist3.toArray(new Integer[5]); 		// size = 5
		System.out.println(Arrays.toString(integer2));
	}

}
