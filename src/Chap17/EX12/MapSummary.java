package Chap17.EX12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Map<K,V> 정리 : K는 중복될 수 없다. Value는 중복 가능
	// 1. HashMap 			: Key를 기준으로 랜덤하게 출력, 메소드가 동기화가 안됨, 싱글쓰레드 환경에 사용
	// 2. HashTable			: 모든 메소드가 동기화되어 있다. 멀티 쓰레드 환경에서 사용됨.
	// 3. LinkedHashMap		: 입력순서대로 출력
	// 4. TreeMap			: 오름차순 정렬되어 입력, Comparable<E>, Comparator<E>

public class MapSummary {

	public static void main(String[] args) {
		// 1. HashMap : 입력순서와 출력순서가 다르다.
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		
		System.out.println(hashMap);
		
		// 2. HashTable : 입력순서와 출력순서가 다르다. <동기화 되어 있다> <멀티 쓰레드 환경>
		Map<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("다", 30);
		hashtable.put("마", 40);
		hashtable.put("나", 50);
		hashtable.put("가", 60);
		
		System.out.println(hashtable);
		
		// 3. LinkedHashMap : 입력순서와 출력순서가 같다.
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("다", 30);
		linkedHashMap.put("마", 40);
		linkedHashMap.put("나", 50);
		linkedHashMap.put("가", 60);
		
		System.out.println(linkedHashMap);
		
		// 4. TreeMap : 오름차순 정렬되어 출력(Map<K,V> K를 기준으로 오름차순 정렬)
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		
		System.out.println(treeMap);
	}

}
