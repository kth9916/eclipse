package chap04;
public class For_Ex03 {
	public static void main(String[] args) {
		
		
		//For �⺻ �۵� 
		//for (�ʱ��; ���ǽ�; ������){
		//���೻��; > ������ true���� ����
		//}
		
		int a;		//��� �ۿ��� ����� ���� , ���� (O) , �ʱⰪ (X)
		for ( a = 0; a < 5; a++) {
			System.out.print(a + " ");		//
		}
		
		System.out.println();
		System.out.println("��� �ۿ��� ��� : " + a);
		
		System.out.println("=========");
		
		for (int b = 0; b <= 10; b++) {
			System.out.println(b );
		}
		
		//System.out.println(b); //for�� �������� ��ȿ�� (��������)
		
		System.out.println("===========");
		int c;
		for (c = 10; c > 0; c--) {
			System.out.println(c);
		}
		
		// 2�� ����� ���
		for (int i = 0; i < 100; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		/*for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ� �� �� �ִ�. */
		
		for (int i=0, j=0 ; i < 10; i++, j++) {
			System.out.println(i + " * " + j + " : "  + (i * j));
		}
		
		System.out.println("==================");
		
		// * for���� ����ؼ� 1���� 10���� ���� ���� ����� ������ 
		
		
		int s=1;
		for (int i=1; i <= 10; i++) {
			s *= i;		//s = s * i
		}
		System.out.println("1���� 10���� ���� �� : " + s);
		
		System.out.println("==================");
		
		// for���� ����ؼ� 1���� 100���� ���� ���� ����� ������
		
		int z;
		int sum;
		for (z=1, sum=0; z <= 100; z++) {
			sum += z;
		}
		System.out.println("1���� 100���� ���� �� : " + sum);
		
		// ���� for�� : 1�� ~ 9�� ���� ������ ���
		
		System.out.println("=====������ ���======");
		
		
		for ( int i = 1; i <= 9; i++) {		//i : ���� ���
			for ( int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		System.out.println("================");
		
		/*
		 * for������ ���� ���� �߻� : ������ ���� ���
		 */
		
//		for(int ib = 0 ;; ib++) {
//			System.out.println(ib + " ");
//		}
		
		
//		for(  ;  ;  ) {
//			System.out.println("���� ���� ");
//		}
		
		System.out.println("============");
		
		//���ѷ��� Ż��
		
		for (int i = 0;  ; i++) {
			if(i > 10) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("=====���� �� ���=====");
//		FOR ���� ����ؼ� 1���� 1000���� 4�� ����� ���� ��:         ��հ� : double�������� 
		
		int sa = 0;
		for (int i = 0; i<=1000; i += 4) {
			sa += i;
		}System.out.println(sa);
		
		//for ���� ����ؼ� ��հ� 
		
		double va = 0;
		int qa = 1000/4;
		for (int i = 0; i <= 1000; i += 4) {
			va += i;
		}System.out.println(va/qa);
		
		
		System.out.println("===�������� �˷��ֽ� ���===");
		
		double sum12 = 0; //���� ���� �����ϴ� ����
		double j = 0; 	//4�� ����� ī��Ʈ �ϴ� ����
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0 ) {
				sum12 += i; // sum = sum + i   // 4�� ����� ���Ѵ�.
				j++;
			}
		}
		System.out.println("���� : " + sum12);
		System.out.println("����� : " + sum12 / j);
		System.out.println(j);
	}

}
