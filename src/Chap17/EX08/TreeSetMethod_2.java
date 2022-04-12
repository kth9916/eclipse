package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet의 잇점 : 1. 중복 저장되지 않는다. (Set) 2. 오름차순 정렬되어 입력 3. 정렬되어 출력(오름차순) 4. 검색기능을 사용
				// 5. 특정 범위의 값을 추출 6. asc(오름차순 정렬) , desc(내림차순 정렬)

// TreeSet에 일반 객체를 저장할 경우, 특정 필드를 크기 비교 기준 필드가 존재해야 한다.
	// 1. Comparable<E> 인터페이스의 compareTo() 메소드 : TreeSet에 일반 객체를 저장할 때 일반 객체의 특정 필드를 재정의 해야 한다.
		// 기존의 클래스를 수정해서 사용. Comparable<E> 인터페이스를 상속 후 compareTo() 메소드 재정의 
		// 기존의 클래스를 수정
	// 2. Comparator<E> 인터페이스 compare() 메소드를 재정의 함. <<익명내부 객체를 사용>>
		// 기존의 객체를 수정하지 않고 사용할 때.
		// TreeSet<E> 객체를 생성할 때 생성자에 Comparator<E> 인터페이스를 구현한 익명 객체를 생성.



class MyClass{ 	// 일반 클래스 / 이거로는 불가능함.
	int data1;
	int data2;
	
	public MyClass(int data1, int data2){
		this.data1 = data1;
		this.data2 = data2;
	}
}

// Comparable<E> 인터페이스를 구현한 클래스 생성
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1; 			// <<== 필드를 비교 기준으로 설정, compareTo() 재정의
	int data2;
	
	public MyComparableClass(int data1, int data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { 		// 객체의 크기 비교 기준을 설정하는 메소드, <TreeSet에서 사용> (음수, 0, 양수)
		// 오름차순 처리 방식
		
//		if(this.data1 < o.data1) {  					// this.data1 기준 값이 작을 경우 : -1 (음수)
//			return -1;
//		} else if (this.data1 == o.data1) {				// this.data1 기준 값이 같을 경우 : 0
//			return 0;
//		} else {										// // this.data1 기준 값이 클 경우 : 1 (양수)
//			return 1; 				
//		}
		
		// 내림차순 처리 방식
		
		if(this.data1 < o.data1) {  					// this.data1 기준 값이 작을 경우 : 1 (양수)
			return 1;
		} else if (this.data1 == o.data1) {				// this.data1 기준 값이 같을 경우 : 0
			return 0;
		} else {										// // this.data1 기준 값이 클 경우 : -1 (음수)
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
		// Wrapper 클래스는 comparable<E> 인터페이스의 compareTo() 메소드를 재정의 하고 있다.
			// Wrapper 클래스의 값을 TreeSet에 넣으면 정렬되어 저장
		
		// 1. Integer Wrapper 클래스의 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20); 	// 큰 값
		//Integer intValue1 = 3;
		Integer intValue2 = new Integer(10); 	// 작은 값
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1); 	// 오름차순 정렬 출력.
		
		// 2. String Wrapper 클래스의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나"); 	// 작은 값
		// String str1 = "가나"
		String str2 = new String("다라"); 	// 큰 값
		
		treeSet2.add(str1); 		// treeSet2.add()를 사용해서 객체를 저장할 경우 값의 크기를 비교하는 필드가 정의되어 있어야 한다.
		treeSet2.add(str2);			// Comparable<E> 인터페이스의 compareTo() 메소드 재정의 되어야 한다.
		
		System.out.println(treeSet2);
		
		// 3. MyClass가 TreeSet에 저장이 될까? 안된다 -- > Comparable<E> 인터페이스의 compareTo() 메소드가 재정의 되어야 TreeSet 컬렉션에 저장 가능
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myClass1 = new MyClass(2,5);
//		MyClass myClass2 = new MyClass(3,3);
//		
//		treeSet3.add(myClass1); 	// TreeSet에는 Comparable<E> 인터페이스의 compareTo() 메소드를 재정의한 클래스만 넣을 수 있다.
//		treeSet3.add(myClass2);		// 실행시 오류 발생됨
//		
//		System.out.println(treeSet3);
		
		// TreeSet에 일반 객체를 저장할 경우. 
		// 4. 방법 1. MyComparableClass 객체 크기 비교 : Comparable<E> 인터페이스의 compareTo() 재정의
				// 기존 객체의 수정이 필요. 다시 컴파일
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		
		MyComparableClass m1 = new MyComparableClass(2,5); 		// TreeSet에 저장될 때 Comparable<E> 인터페이스에 compareTo() 재정의
		MyComparableClass m2 = new MyComparableClass(5,3);
		MyComparableClass m3 = new MyComparableClass(4,3);
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		
		System.out.println(treeSet4);
		System.out.println("==============================");
		
		// 5. 방법 2. 기존의 객체를 수정하지 않고 TreeSet에 저장할 경우.
		// TreeSet 생성자 내부에 Comparator<E> 인터페이스를 정의해서 익명객체로 구현
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
