package chap05;
public class CreateStringObject {
	public static void main(String[] args) {
		// 1. String ��ü ���� 1 : new Ű�� ����ؼ� ��ü ���� : Heap ������ ������ ������ ����
				// RAM�� ���� ���� �������� �ʴ´�.
		String str1 = new String("�ȳ�");		// new Ű�� ��ü�� �����϶�. (Heap �޸𸮿� ����)
		System.out.println(str1);			// String�� ��ü�� ������� �� ��ü�� ���� ���.
											// String�� ������ Ư���� ���
											// ��ü ��ü�� ����ϸ�, Heap �޸��� ������ ����� �Ϲ���������,
											// String�� ��ü��.toString() �����ǵǾ� �־ ���� ���
		
		String str11 = new String("�ȳ�");	// str1�� str11�� ������ �޸� ������ ���� (Heap)
		
		if(str1 == str11) {			// == : ���� �ڷ����� ��, �����ϴ� �ּҸ� ��
			System.out.println(true);
		}else {
			System.out.println(false);		// false <== ������ �ּҸ� ����Ų��
		}
		
		System.out.println("================");
		
		// ���ͷ��� ���� �ٷ� �Ҵ� : ���� ���� ���, RAM�� ���� �����ϰ� �ȴ�. (Heap)
		String str2 = "�ȳ��ϼ���."; 
		String str22 = "�ȳ��ϼ���.";			// str2�� str22�� ������ �޸� ������ ���� (Heap)
		
		if(str2 == str22) {			
			System.out.println(true);	// true : ���� �ּҸ� ����Ų��. 
		}else {
			System.out.println(false);
		}
		
		
		
	}										
	

}
