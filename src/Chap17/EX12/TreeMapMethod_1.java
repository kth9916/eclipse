package Chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

// TreeMap<K,V> : ����ÿ� Key�� �������� �������� ���ĵǾ� �����.
	// ��½ÿ� �������� ���ĵǾ� ���
	// Key�� �Ϲ� ��ü�� ������ �� Comparable<E> compareTo() ������ 
							//Comparator<E> compare()�� ������ <== ��ü �������� ���, 

// Map<K,V> <== SortedMap<K,V> (���� �޼ҵ� ����)<== NavigableMap<K,V> (�˻� �޼ҵ� ����) <== TreeMap<K,V>
	// TreeMap�� ����� ���� Ÿ���� TreeMap���� �����ؼ� �˻�, ������ �޼ҵ带 ����� �� �ִ�.

public class TreeMapMethod_1 {
	public static void main(String[] args) {
		// TreeMap<K,V>�� Map<K,V> �޼ҵ带 ��� ���. �߰������� SortedMap, NavigableMap�� �߰����� �޼ҵ带 ���.
		TreeMap<Integer, String> treeMap = new TreeMap(); 	// ������������ ���ĵǾ� �Էµ�.
		
		for(int i = 20; i > 0; i -=2) {
			treeMap.put(i, i+ " ��° ������");
		}
		System.out.println(treeMap); 	// Key, Value : Key�� �������� �������� ���ĵ�.
		
		// 1. firstKey() : ���� ù ��° ���� ���
		System.out.println(treeMap.firstKey()); 	//2
		
		// 2. firstEntry() : entry = key + Value ��
		System.out.println(treeMap.firstEntry());
		
		// 3. lastKey() : ������ Ű
		System.out.println(treeMap.lastKey());
		// 4. lastEntry() : ������ Ű�Ͱ�
		System.out.println(treeMap.lastEntry());
		
		// 5. lowerKey(K key) : �Է� ���� Ű�� ���� Ű�� ���
		System.out.println(treeMap.lowerKey(10)); 		// 8
		// 6. higherKey(K key) : �Է� ���� Ű�� ���� Ű�� ��� 
		System.out.println(treeMap.higherKey(10));		// 12
		
		// 7. pollFirstEntry() : ù ��° Ű�� ���� ������ ����´�.
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		// 8. pollLastEntry() : ��������° Ű�� ���� ������ ����´�.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		// 9. SortedMap<K,V> headMap(K toKey) : ��ǲ ���� Ű�� head ������ ó��
		SortedMap<Integer, String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
		
		// 10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true); 		// key 8�� �����ϸ鼭 Head ������ ���
		System.out.println(nMap);
		
		// 11. SortedMap<K,V> tailMap (K toKey)
		SortedMap<Integer, String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		// 12. NavigableMap<K,V> tailMap (K toKey)
		NavigableMap<Integer,String> nMap2 = treeMap.tailMap(14, false); 	// ������ ������ �⺻, ���� �������� �⺻
		System.out.println(nMap2);
		
		// 13. SortedMap<K,V> subMap(K fromKey, K toKey) : Ư�� ������ ���� ����.
		SortedMap<Integer, String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);
		
		// 14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		NavigableMap<Integer, String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		// 15. NavigableSet<K> descendingKeySet() : ���� Ű ������ �ݴ�� ���
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		// 16. NavigableMap<K,V> descendingMap() : ���� ������ �ݴ�� ����
		NavigableMap<Integer,String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());
		
	}

}
