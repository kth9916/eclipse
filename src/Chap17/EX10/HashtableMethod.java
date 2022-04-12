package Chap17.EX10;



// Map<K,V> : K <-- Key, V <-- Value �������� �����͸� ����. 


	// Key�� �ߺ��� �� ����. <== Set���� ���� 			index �ƴϴ�. index�� 0���� �Ҵ�, JVM�� �Ҵ�
	// Value�� �ߺ��� ���� ���� �� �ִ�.

	// HashMap : ����� �����ϰ� ���. ���� ������ ȯ�濡 ����. ��� �޼ҵ尡 ����ȭ �Ǿ����� �ʴ�.
	// Hashtable : ��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 �����ϴ�.
				// ��� �޼ҵ�� HashMap�� ����


import java.util.Map;

import java.util.Set;
import java.util.Hashtable;

public class HashtableMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> htable1 = new Hashtable<>();
		
		// 1. put(K key, V value) : ���� ���� ��
		htable1.put(2, "���ٶ�");
		htable1.put(1, "������");
		htable1.put(3, "�ٶ�");
//		htable1.put(3, "������"); 		// Ű�� �ߺ��ؼ� ����� �� ����. ���� ���� ��� ������ ���� �����ȴ�.
		
		System.out.println(htable1);
		
		// 2. putAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> htable2 = new Hashtable<>();
		
		htable2.putAll(htable1);
		
		System.out.println(htable2);
		
		// 3. replace(K key, V value) ; key�� ����� ���� value�� ����.
		htable2.replace(1, "������");
		htable2.replace(4, "����"); 	// key 4�� �������� �ʴ´�. �۵��� �ȵ�(���ܵ� �߻��ȵ�)
		
		System.out.println(htable2);
		
		// 4. replace(K key, V oldValue, V newValue) 	: oldValue�� newValue�� ����
		htable2.replace(1, "������", "������");
		htable2.replace(2, "�ٴٴ�", "����"); 		// ���۾ȵ�... <== key�� value�� ��Ȯ�� ��ġ�ؾ���.
		
		System.out.println(htable2);
		
		// 5. get(Object key) : Map�� ���� ������ ��. key�� �־���� key�� �Ҵ�� value�� ���
		System.out.println(htable2.get(1));  		// ���� 1. index�� �ƴ϶� key
		System.out.println(htable2.get(2));
		System.out.println(htable2.get(3));
		
		// 6. containsKey(Object key) ; �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true / false�� 
		System.out.println(htable2.containsKey(1)); 	// true
		System.out.println(htable2.containsKey(5));	// false
		
		// 7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		
		System.out.println(htable2.containsValue("������"));
		System.out.println(htable2.containsValue("�ٴٴ�"));
		
		// 8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = htable2.keySet(); 		// hMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		// 9. Set<Map.Entry<K,V>> entrySet() : key�� value�� set�� ����
		Set<Map.Entry<Integer, String>> entrySet = htable2.entrySet();
		System.out.println(entrySet);
		
		// 10. size(); �� ����
		System.out.println(htable2.size()); 	// 3
		
		// 11. remove(Object key) 		// Ű�� �־ key�� value�� ����.
		htable2.remove(1); 			// 1�� ����
		htable2.remove(4);			// �������� ����
		System.out.println(htable2);
		
		// 12. remove(Object key, Object Value)		: key�� value�� ��Ȯ�ϰ� ��ġ�� �� ����
		htable2.remove(2, "���ٶ�"); 		// 2�� ����
		htable2.remove(3, "�ٴٴ�");		// ���� ����. key�� value�� ��ġ���� ����
		System.out.println(htable2);
		
		// 13. clear() : ��� ����
		htable2.clear();
		System.out.println(htable2);
	}

}
