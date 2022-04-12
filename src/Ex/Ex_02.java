package Ex;
public class Ex_02 {
	public static void main(String[] args) {
		//[문항2] 1~100 까지 합 프로그램을 작성하시오
		
		int sum = 0;	//합한 값을 저장하는 변수
		for (int i=1; i <= 100; i++) {
			sum += i;		
		}
		System.out.println("1부터 100까지 더한 값 : " + sum);
		
		System.out.println("==================");
		
		
		
		
		/*선생님이 하신 방법
		 * int sum = 0;
		 * int num = 1;
		 * 
		 * while (num <=100){
		 * 		sum += num;
		 * 		num ++;
		 * 		}
		 * 
		 */
	}

}
