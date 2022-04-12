package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력했을 때 이름을 오름차순으로 출력하도록 구현하다. TreeSet에 name 컬럼을
// 1. Comparable<E>에 compareTo() 메소드 재정의
		// 기존의 객체 수정이 필요
// 2. Comparator<E>의 compare() 구현
		// 기존의 객체를 수정 없이 구현

class Abc implements Comparable<Abc>{
	String name; 		// <-- 컬럼이 정렬 컬럼. 오름 차순 정렬 : 가,나,다,라 ....하
					// 홍길동, 이순신, 강감찬 ===>> 강감찬 , 이순신, 홍길동
	int age;
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Abc o) {
			return name.compareTo(o.name);
			/*
			 * 방법 2
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
	String name; 		// <-- 컬럼이 정렬 컬럼. 오름 차순 정렬 : 가,나,다,라 ....하
					// 홍길동, 이순신, 강감찬 ===>> 강감찬 , 이순신, 홍길동
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
		Abc a1 = new Abc("강감찬", 20);
		Abc a2 = new Abc("이순신", 25);
		Abc a3 = new Abc("홍길동", 30);
		
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
		
		Abc2 a4 = new Abc2("강감찬",20);
		Abc2 a5 = new Abc2("이순신",30);
		Abc2 a6 = new Abc2("홍길동",40);
		
		treeSet2.add(a4);
		treeSet2.add(a5);
		treeSet2.add(a6);
		
		System.out.println(treeSet2);
	}

}
