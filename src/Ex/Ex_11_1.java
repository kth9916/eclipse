package Ex;

public class Ex_11_1 {
	public static void main(String[] args) {
//		[���� 11]  ���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2 ���� �迭�� �ۼ���  ��.
//
//		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"}; int score[]	= {95, 88, 76, 62, 55};
//
//		�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �� ���϶�. "�׸�"�� �Է¹����� �����Ѵ�. (Java �� �ε��� 0 �� �����Ƿ� score[0] �� ���)
//
//		���� �̸� >> Jaba ���� �����Դϴ�. ���� �̸� >> Java Java �� ������ 95
//		���� �̸� >> �ȵ���̵� �ȵ���̵��� ������ 55 ���� �̸� >> �׸�
//
//		[Hint] ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals()�޼ҵ带 �̿��ؾ� �Ѵ�.
//
//		String name;
//		if(course[i].equals(name)) { int n = score[i];
//		...
//		}
		
		//�⺻ �ڷ����� �� : '=='�� ���� ��
		//���� �ڷ����� �� : '=='�� �����ϴ� �ּ��� ������ ��
		//���� �ڷ����� �� ���� �� : str1.equals(str2) <== �������� str1 ���� str2�� �� �ִ� �޸��� ���� ��. 
		
		//String�� ���� �Ҵ� �� �� �����ڸ� ���ؼ� �Ҵ�. // new��� Ű�� ����ϸ� �� �޸� �� ������ �޸� ������ ������. ���� ������ aa-�ȳ�� bb-�ȳ��� ���� �����.
		String aa = new String("�ȳ�");
		String bb = new String("�ȳ�");
		System.out.println(aa);
		System.out.println(bb);
		
		if ( aa == bb) {			// �޸��� �ּ� ���� �� ( aa, bb�� �ٸ� �޸� �ּҸ� ���´�)
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		System.out.println("==================");
		
		if (aa.equals(bb)) {			// �޸��� ���� ���� �� aa.equals(bb)
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println("=========================");
		
		// String�� ���� ���ͷ� ���� �ٷ� �Ҵ�. // �޸� ������ ����(�ּҰ� ����)�Ѵ�
		
		String a = "�ȳ�";
		String b = "�ȳ�";
		
		if (a == b ) {					//���� �ڷ������� "==" : �޸��� �ּҸ� ��
			System.out.println(true);	//true�� �߻��Ѵ�
		}else {
			System.out.println(false);
		}
		
	}

}
