package Chap17.EX12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Map<K,V> ���� : K�� �ߺ��� �� ����. Value�� �ߺ� ����
	// 1. HashMap 			: Key�� �������� �����ϰ� ���, �޼ҵ尡 ����ȭ�� �ȵ�, �̱۾����� ȯ�濡 ���
	// 2. HashTable			: ��� �޼ҵ尡 ����ȭ�Ǿ� �ִ�. ��Ƽ ������ ȯ�濡�� ����.
	// 3. LinkedHashMap		: �Է¼������ ���
	// 4. TreeMap			: �������� ���ĵǾ� �Է�, Comparable<E>, Comparator<E>

public class MapSummary {

	public static void main(String[] args) {
		// 1. HashMap : �Է¼����� ��¼����� �ٸ���.
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		
		System.out.println(hashMap);
		
		// 2. HashTable : �Է¼����� ��¼����� �ٸ���. <����ȭ �Ǿ� �ִ�> <��Ƽ ������ ȯ��>
		Map<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("��", 30);
		hashtable.put("��", 40);
		hashtable.put("��", 50);
		hashtable.put("��", 60);
		
		System.out.println(hashtable);
		
		// 3. LinkedHashMap : �Է¼����� ��¼����� ����.
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		
		System.out.println(linkedHashMap);
		
		// 4. TreeMap : �������� ���ĵǾ� ���(Map<K,V> K�� �������� �������� ����)
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		
		System.out.println(treeMap);
	}

}
