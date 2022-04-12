package chap04;
public class IF_Ex01 {
	public static void main(String[] args) {
		
		//if �� : 
		/*
		 * if (����) {
		 *    ������ ���϶� ����� �ڵ�;
		 * }
		 */
		
		int value1 = 5;
		if (value1 < 3) {
			System.out.println("����1 : ������ ���϶� ���� ");
		}
		
		/*
		 * if (����) {
		 * 		������ ���� �� ������ ����;
		 * } 
		 * else {
		 * 		������ ������ �� ������ ����;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("���� 3");			// ������ true�� �� ����
		}
		else {
			System.out.println("���� 4");			// ������ false�� �� ����
		}
		
		if (bool2) {
			System.out.println("���� 5");			// ������ true�� �� ����
		}
		else {
			System.out.println("���� 6");			// ������ false�� �� ����
		}
		System.out.println("==========");
		
		// if ~ else �� ���� �����ڷ� ��ȯ�� ����
		
		System.out.println((bool1) ? "���� 7" : "���� 8");		// ���̹Ƿ� "����7"�� ���
		System.out.println((bool2) ? "���� 9" : "���� 10");	// �����̹Ƿ� "����10"�� ���
		
		System.out.println("========");
		/*
		 * if�� ������ ���� ���� �� ?
		 * 
		 * if (����1) {
		 * 		����1�� ���� �� ���� �ڵ�;
		 * } else if (����2) {
		 * 		����2�� ���� �� ���� �ڵ�;
		 * } else if (����3) {
		 * 		����3�� ���� �� ���� �ڵ�;
		 * } else {
		 * 		���� ������ ��� �������� ���� �� ���� �ڵ�;
		 * }
		 * 
		 * 
		 */
		
		int value3 = 65;
		
		if (value3 >= 90) {
			System.out.println("A���� , ���� : " + value3);
		}
		else if (value3 >= 80) {
			System.out.println("B���� , ���� : " + value3);		//���� �Ŀ� if���� ���� ���´�.
		}
		else if (value3 >= 70) {
			System.out.println("C���� , ���� : " + value3);
		}
		else {
			System.out.println("F���� , ���� : " + value3);
		}
		
		/*
		 * IF ������ ������ ������ �ٲ�� ���� ��� 
		 */
		value3 = 85;
		if (value3 >= 90) {
			System.out.println("A���� , ���� : " + value3);
		}
		else if (value3 >= 70) {
			System.out.println("C���� , ���� : " + value3);		//���� �Ŀ� if���� ���� ���´�.
		}
		else if (value3 >= 80) {
			System.out.println("B���� , ���� : " + value3);
		}
		else {
			System.out.println("F���� , ���� : " + value3);
		}
		System.out.println("===========");
		
		/*
		 * ������ �ο� �� �� �����ϰ� ����
		 */
		value3 = 85;
		if (value3 <= 100 && value3 >= 90) {
			System.out.println("A ����");
		}
		else if (value3 < 80 && value3 >= 70) {
			System.out.println("C ����");
		}else if (value3 < 90 && value3 >= 80){
			System.out.println("B ����");
		}else {
			System.out.println("F����");
		}
		
		/*
		 * if ������ ���๮�� �ϳ��� �� {}�� ���� �� �� �ִ�.
		 */
		
		System.out.println("===================");
		
		if (3 < 5)
			System.out.println("�ȳ�");		//if���� {} �� ������ ���
		
		System.out.println("==============");
		
		if (3 > 5)
			System.out.println("�ȳ�2");
			System.out.println("�ݰ�");
		
		
	}

}
