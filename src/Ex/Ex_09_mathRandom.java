package Ex;

public class Ex_09_mathRandom {

	public static void main(String[] args) {
		// double c = (double) math.random(); <== 0.000000xxx  ~0.99999xxx < == ������ ������ ���� �߻���Ŵ(�����߻���)
				// int i = (int) (math.random() * 10); // 0 ~ 9������ ������ ���� ����
				
				double d = (double) Math.random();
				System.out.println(d);
				int c = (int)(Math.random() * 10); // 0���� 9������ ������ ���� ����
				System.out.println("0���� 9������ ������ �� : "+c);
				int e = (int)(Math.random() * 10 + 1); // 1���� 10������ ������ ���� ����
				System.out.println("1���� 10������ ������ �� : "+e);
				int f = (int)(Math.random() * 100 + 1); // 1���� 100������ ������ ���� ����
				System.out.println("1���� 100������ ������ �� : "+f);

	}

}
