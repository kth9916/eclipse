package chap05;

public class PlusOperationOfString {

	public static void main(String[] args) {
		//1. ���ڿ� + ���ڿ�
		String str1 = "�ȳ�" + "�ϼ���" + "!";
		System.out.println(str1);
		
		String str2 = "�ݰ�";
		str2 += "���ϴ�"; 		//str2 = str2 + "���ϴ�"
		str2 += "!";			//str2 = str2 + "!"
		System.out.println(str2);
		
		//2. ���ڿ� + �⺻�ڷ��� // �⺻ �ڷ����� ���ڿ��� ��ȯ
		String str3 = "�ȳ�" + 1;  	// �ȳ�1 	- �⺻�ڷ����� jvm�� ���� string���� �ٲ�
		String str4 = "�ȳ�" + String.valueOf(1); // �ȳ�1
		String str5 = "�ȳ�" + "1"; // �ȳ�1
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		// 3. ���ڿ��� �⺻ �ڷ����� ȥ���ؼ� ����ϴ� ���
		System.out.println(1 + "�ȳ�"); 	//1�� ���� string�� ���� �޾Ƽ� string ��
		System.out.println(1 + "�ȳ�" + 2); 	// 1�� 2�� ��� string�� ���� �޾� string��
		System.out.println("�ȳ�" + 1 + 2); // 1�� string�� ������ �ް� 2�� ���� string�� �� 1�� ������ �޾� string�� ��
		System.out.println("�ȳ�" + (1+2)); // ��ȣ�� �켱������ ���� ������ ������ �Ǿ� 3�� �ǰ� �� string�� ���� �޾� string�� ��
		System.out.println(1+2 + "�ȳ�"); 	// 1�� ���������� 2�� ������ �Ǿ� 3�� �ǰ� ���� string ���� �޾� string�� ��
		
		
		
	}

}
