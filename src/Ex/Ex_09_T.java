package Ex;

public class Ex_09_T {

	public static void main(String[] args) {
		// [���� 9] ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� ��
				// ���ڵ�� ����� ����϶�.
				// double c = (double) math.random(); <== 0.000000xxx  ~0.99999xxx < == ������ ������ ���� �߻���Ŵ(�����߻���)
				// int i = (int) (math.random() * 10); // 0 ~ 9������ ������ ���� ����
		
		int[] num = new int[10];
		int sum = 0;
		double avg = 0; 	// ��� = ��ü���� ���ؼ� (sum) / ���� ����
		
		System.out.print("������ ������ : ");
		
		//�迭�� �� �濡 ������ ���� �߻����Ѽ� �Է�
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10 + 1); //num[0] ~ num[9] ���濡 ���� : 1 ~ 10
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		// ��հ� : �迭�� �� ���� ������ ���� ���ؼ� ��ü ���� ������ ������
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		avg = (double) sum / num.length;	// ��� = �� / ���� ����
		System.out.println("����� : " + avg);
		System.out.println("���� : " + sum);
		System.out.println("���� ������ : " + num.length);
	}

}
