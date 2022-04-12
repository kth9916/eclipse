package Ex;
public class Ex_04 {
	public static void main(String[] args) {
		//[문항4] for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해 보세요.
		
		
		for(int i = 0; i < 4; i++) {		//다음 라인으로 개행 변수
			for(int j = 0; j <= i; j++) {	//별을 출력하는 변수
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
