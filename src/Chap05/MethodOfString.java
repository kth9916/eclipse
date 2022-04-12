package chap05;

import java.util.Arrays;

public class MethodOfString {
	public static void main(String[] args) {
		// 1. ���ڿ� ���� ( length() ) : int Ÿ������ ��ȯ
		String str1 = "Hello Java!";
		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
		
			// str1 : ��������, ��ü, �ν��Ͻ�
		
		System.out.println(str1.length()); 	//11
		System.out.println(str2.length()); 	//13
				//�ڹٿ��� length�� ���ڼ��� ����. (�ѱ�)
		System.out.println(str1.length()+str2.length()); 	//������ ��ȯ�� �Ǿ��� ������ ���� ����
		System.out.println();
		
		// 2. ���ڿ� �˻� (charAt(), indexOf(), lastIndexOf())
		System.out.println(str1.charAt(1));  	// 1�� ���� ���ڸ� ��� // e
		System.out.println(str2.charAt(1));  	// 1�� ���� ���ڸ� ��� // ��
		System.out.println();
		
		//indexOf() : 0��° �濡�� ���� ������ ����� ������ ���ȣ(index)�� ���
		//lastIndexOf() : ������ ����� 0��° ������ ������ ���ȣ�� ���
		
		System.out.println(str1.indexOf('a')); //7
		System.out.println(str1.lastIndexOf('a'));//9
		System.out.println(str1.indexOf('a', 8)); // 8���濡������ ���������� �˻� ����
		System.out.println(str1.lastIndexOf('a', 8)); // 8���濡�� ���� �������� �˻� ����
		System.out.println(str1.indexOf("Java")); //6������� Java ���ڿ��� ����
		System.out.println(str1.lastIndexOf("Java")); // 6��
		System.out.println(str2.indexOf("�ϼ���"));
		System.out.println(str2.lastIndexOf("�ϼ���"));
		System.out.println(str1.lastIndexOf("bye"));    	//<<�߿�>> : -1 (���� �������� �ʴ� ���)
		System.out.println();
		
		// 3. ���ڿ� ��ȯ �� ���� (String.valueof(), concat())
		// String.valueof(�⺻�ڷ���) : �⺻�ڷ��� ==> String���� ��ȯ
		String str3 = String.valueOf(2.3); // �Ǽ� 2.3�� String������ ��ȯ
		String str4 = String.valueOf(false); 	// boolean Ÿ�� false�� String���� ��ȯ�ض�
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		//concat() : ���ڿ��� ���ڿ��� ���� : +�����ڿ� ����
		String str5 = str3.concat(str4);
		System.out.println(str5);
		System.out.println();
		
		// concat() �޼ҵ忡�� String.valueof ��� =====> + (�ڵ����� Ÿ�Ժ�ȯ)
		String str6 = "�ȳ�" + 3; 	// �ȳ�3, + : �����ڸ� ����� �� �ڵ� ��ȭ
		String str7 = "�ȳ�".concat(String.valueOf(3)); 	// concat�� ����� �� String Ÿ������ ��ȯ �ʿ�
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		
		//4. ���ڿ� ==> byte[] Ÿ������ ��ȯ, ����� ���� ó���� �� ���.
			// (getBytes(),
			// ���ڿ� ====> char[] (toCharArray())
		String str8 = "Hello Java!";
		String str9 = "�ȳ��ϼ���";
		
		// getBytes() : ���ڿ� ==> byte[] ��ȯ
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1)); 	//�ƽ�Ű �ڵ尡 ��� (11)
		System.out.println(Arrays.toString(array2));
		
		//toCharArray() ���ڿ� => char[] �� ��ȯ
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
		
		
		
		
		
		
	}

}