package Ex;
public class Ex_06 {
	public static void main(String[] args) {
		//[문항6] 주어진 배열의 항목에서 최대값을 구해보세요 (for 문을 이용하세요)
		
		int max = 0;	//최대 값을 저장하는 변수
		int[] array = {4,5,1,2,3};
		for(int i = 0; i <array.length; i++) {		//각방의 값을 순환 하면서 가지고 온다
			if(max < array[i]) {
				max = array[i];
			} 
		}
		System.out.println("max : " + max);
	}

}
