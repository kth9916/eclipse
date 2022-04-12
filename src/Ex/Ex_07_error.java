package Ex;
public class Ex_07_error {
	public static void main(String[] args) {
		
		//[문항7] 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.
		
		int[] array = {1,5,99,22,345,125,2346,55,32,85};
		for(int i = 0; i < array.length; i++) {
			if(array[i]%3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
