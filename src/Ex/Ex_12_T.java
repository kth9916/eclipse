package Ex;

import java.util.Scanner;

public class Ex_12_T {

	public static void main(String[] args) {
//		[���� 12] ��ǻ�Ϳ� ���� ������ ���� ���� �� ������ ������. ���ô� ���� �׸��� ����. ���ں��� ���� �����Ѵ�. ���ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ�
//		<Enter>Ű�� ġ��, ���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ� ��ǻ�Ͱ� �� ������ �Ѵ�. ���ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ�  ���� �̰���� �Ǵ��Ѵ�. 
//		���ڰ� ���� ���� �� ��� "�׸�"�� �Է��ϸ� ������ ������.
//		��ǻ�Ϳ� ���� ���� �� ������ �մϴ�. ���� ���� ��! >> ����
//		����� = ���� , ��ǻ�� = ���� ����ڰ� �̰���ϴ�. ���� ���� ��! >> ����
//		����� = ���� , ��ǻ�� = ���� �����ϴ�. ���� ���� ��! >> �׸�
//		������ �����մϴ�...
//
//		[Hint]
//
//		������ ���� ���ڿ� �迭�� �����.
//		String str[] = {"����", "����", "��"};
//		��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ��� ���� �ڵ带 �̿��Ѵ�. int n = (int)(Math.random()*3); 
//		// n �� 0, 1, 2 �߿��� �����ϰ� ���� ��ǻ�Ͱ� �� ���� "����" ���� ���ϴ� �ڵ�� ������ ���� �Ѵ�. if(str[n].equals("����")) 
//		//��ǻ�Ͱ� �� ���� "����"���� ���ϴ� ��
		
		/*
		int n = (int)(Math.random()*3);		// 0, 1, 2 : n�� ��
			//Math. random() : 0.0000000xxx ~ 0.99999999xxx ������ ��
		System.out.println(n);
		*/
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String uSelect, comSelect ;	//uSelect : ����� �� ��(��ĳ�ʷ� ��ǲ), 
									//comSelect : ��ǻ�Ͱ� �� ��(���� �߻���(Math.random())�� ��ǲ 
		int n ; //��ǻ�Ͱ� �� ��(0 : ����, 1 : ����, 2 : ��)
		
		System.out.println("��ǻ�Ϳ� \'���� ���� ��\' ������ �մϴ�. ");
		
		do {
			System.out.print("���� ���� �� !! >>> ");
			uSelect = sc.next();			// ����� ���� �� : ��ǲ
			if ( uSelect.equals("�׸�")) {
				break;
			}
			
			n = (int)(Math.random()*3);			// ��ǻ�Ͱ� ���� �� : 0 , 1, 2
			comSelect = str[n];				// ��ǻ�Ͱ� ���� �� : ����, ����, ��
			
			if ( uSelect.equals("����")) {		// ����ڰ� ������ ��?
				if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�.");
				} else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				} else if(comSelect.equals("��")){
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ����� �̰���ϴ�.");
				}
			} else if(uSelect.equals("����")) {	// ����ڰ� ������ ��?
				if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ����� �̰���ϴ�.");
				} else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�.");
				} else if(comSelect.equals("��")){
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
			} else if(uSelect.equals("��")) {	// ����ڰ� ���� ��? 
				if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				} else if(comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ����� �̰���ϴ�.");
				} else if(comSelect.equals("��")){
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�.");
				}
			}
			System.out.println();
			// ����ڰ� ������ ��?
			
			// ����ڰ� ���� ��?
			
		}while (true);
		
		sc.close();
		System.out.println("���α׷��� ���� �մϴ�. ");
		
	}

}
