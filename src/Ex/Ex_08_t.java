package Ex;

import java.util.Scanner;

public class Ex_08_t {
	public static void main(String[] args) {
		// [���� 8] �迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ��غ���. Ű���忡�� ������ �� ���� �׼��� �Է¹޾� ��������, ������, õ����,
		// 500�� ����, 100�� ����
		// 50�� ����, 10�� ����, 1�� ������ �� �� ���� ��ȯ�Ǵ��� ���ÿ� ���� ����϶�. �̶� �ݵ�� ���� �迭�� �̿��ϰ� �ݺ�������
		// �ۼ��϶�.

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");

		int money = sc.nextInt(); // ��ĳ�ʷ� ��ǲ ���� ���� �����ϴ� ����

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // ȯ���� ���� ������ �迭�� ����
		for (int i = 0; i < unit.length; i++) {
			System.out.printf(" %d �� ¥�� : %d �� \n", unit[i], money / unit[i]); // ù��° ������ %d, �ι�° ������ %d, \n�� �� �ٲ��.
			money = money - (money/unit[i])*unit[i];
							//ȯ���� ���� ����(1) * 50000
		}

	}

}
