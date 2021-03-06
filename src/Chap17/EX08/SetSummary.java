package Chap17.EX08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set : 중복되지 않는 값을 저장 (equals(), hashcode() 메소드를 재정의), Wrapper 클래스는 모두 재정의
		// 1. HashSet			:	출력되는 것이 랜덤하게 출력.
		// 2. LinkedHashSet		:	입력되는 대로 출력.
		// 3. TreeSet			:	입력값을 넣으면 내부적으로 정렬. 오름차순 정렬되어 출력

public class SetSummary {

	public static void main(String[] args) {
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		
		System.out.println(hashSet);
		
		// 2. LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("다");
		linkedHashSet.add("마");
		linkedHashSet.add("나");
		linkedHashSet.add("가");
		
		System.out.println(linkedHashSet);
		
		// 3. TreeSet <== 정렬하기 위해서 Comparable<E> compareTo(), Comparator<E> compare()
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		
		System.out.println(treeSet);
	}

}
