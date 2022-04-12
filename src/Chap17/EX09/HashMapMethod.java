package Chap17.EX09;

// Map<K,V> : K <-- Key, V <-- Value �������� �����͸� ����. 
	// Key�� �ߺ��� �� ����. <== Set���� ���� 			index �ƴϴ�. index�� 0���� �Ҵ�, JVM�� �Ҵ�
	// Value�� �ߺ��� ���� ���� �� �ִ�.

	// HashMap : ����� �����ϰ� ���

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap1 = new HashMap<>();
		
		// 1. put(K key, V value) : ���� ���� ��
		hMap1.put(2, "���ٶ�");
		hMap1.put(1, "������");
		hMap1.put(3, "�ٶ�");
//		hMap1.put(3, "������"); 		// Ű�� �ߺ��ؼ� ����� �� ����. ���� ���� ��� ������ ���� �����ȴ�.
		
		System.out.println(hMap1);
		
		// 2. putAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> hMap2 = new HashMap<>();
		
		hMap2.putAll(hMap1);
		
		System.out.println(hMap2);
		
		// 3. replace(K key, V value) ; key�� ����� ���� value�� ����.
		hMap2.replace(1, "������");
		hMap2.replace(4, "����"); 	// key 4�� �������� �ʴ´�. �۵��� �ȵ�(���ܵ� �߻��ȵ�)
		
		System.out.println(hMap2);
		
		// 4. replace(K key, V oldValue, V newValue) 	: oldValue�� newValue�� ����
		hMap2.replace(1, "������", "������");
		hMap2.replace(2, "�ٴٴ�", "����"); 		// ���۾ȵ�... <== key�� value�� ��Ȯ�� ��ġ�ؾ���.
		
		System.out.println(hMap2);
		
		// 5. get(Object key) : Map�� ���� ������ ��. key�� �־���� key�� �Ҵ�� value�� ���
		System.out.println(hMap2.get(1));  		// ���� 1. index�� �ƴ϶� key
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		// 6. containsKey(Object key) ; �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true / false�� 
		System.out.println(hMap2.containsKey(1)); 	// true
		System.out.println(hMap2.containsKey(5));	// false
		
		// 7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		
		System.out.println(hMap2.containsValue("������"));
		System.out.println(hMap2.containsValue("�ٴٴ�"));
		
		// 8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = hMap2.keySet(); 		// hMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		// 9. Set<Map.Entry<K,V>> entrySet() : key�� value�� set�� ����
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet);
		
		// 10. size(); �� ����
		System.out.println(hMap2.size()); 	// 3
		
		// 11. remove(Object key) 		// Ű�� �־ key�� value�� ����.
		hMap2.remove(1); 			// 1�� ����
		hMap2.remove(4);			// �������� ����
		System.out.println(hMap2);
		
		// 12. remove(Object key, Object Value)		: key�� value�� ��Ȯ�ϰ� ��ġ�� �� ����
		hMap2.remove(2, "���ٶ�"); 		// 2�� ����
		hMap2.remove(3, "�ٴٴ�");		// ���� ����. key�� value�� ��ġ���� ����
		System.out.println(hMap2);
		
		// 13. clear() : ��� ����
		hMap2.clear();
		System.out.println(hMap2);
	}

}
