package Ex;

public class Ex_09 {
	public static void main(String[] args) {
		// [문항 9] 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든
		// 숫자들과 평균을 출력하라.
		// double c = (double) math.random(); <== 0.000000xxx  ~0.99999xxx < == 범위의 임의의 값을 발생시킴(난수발생기)
		// int i = (int) (math.random() * 10); // 0 ~ 9까지의 랜덤한 값을 생성
				
		int result = 0;
		int[] array = new int[10];
		System.out.print("랜덤한 정수들 : ");
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10+1);
			System.out.print(array[i] + " ");
			result += array[i];
		}
		System.out.println();
		System.out.println("합은 : " + result);
		System.out.println("평균은 : " + (double) result/array.length);
		System.out.println("방의 갯수는 : " + array.length);
		

	}

}
