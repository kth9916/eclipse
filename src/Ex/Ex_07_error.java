package Ex;
public class Ex_07_error {
	public static void main(String[] args) {
		
		//[����7] ���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.
		
		int[] array = {1,5,99,22,345,125,2346,55,32,85};
		for(int i = 0; i < array.length; i++) {
			if(array[i]%3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
