package Ex;

public class Ex_09 {
	public static void main(String[] args) {
		// [���� 9] ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� ��
		// ���ڵ�� ����� ����϶�.
		// double c = (double) math.random(); <== 0.000000xxx  ~0.99999xxx < == ������ ������ ���� �߻���Ŵ(�����߻���)
		// int i = (int) (math.random() * 10); // 0 ~ 9������ ������ ���� ����
				
		int result = 0;
		int[] array = new int[10];
		System.out.print("������ ������ : ");
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.print(array[i] + " ");
			result += array[i];
		}
		System.out.println();
		System.out.println("���� : " + result);
		System.out.println("����� : " + (double) result/array.length);
		System.out.println("���� ������ : " + array.length);
		

	}

}
