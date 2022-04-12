package chap05;
public class Ex04_PrimaryAndReferenceType {
	public static void main(String[] args) {
		//1. 기본 데이타 타입에 대입 연산 ( Stack 값을 복사 )
		
		int value1 = 3;
		int value2 = value1;		// stack의 값을 복사한 것. value1과 value2의 값이 같아지지는 않음.
		
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		//2. 참조 자료형의 대입 연산 ( Stack의 힙 영역의 주소를 복사 )
		
		int[] array1 = new int[] {3,4,5,7};
		int[] array2 = array1; 	// array2는 스택영역에서 array1의 힙 영역의 주소를 복사
		array2[0] = 7; 	//array1과 array2의 힙 영역 주소가 같기 때문에 하나를 바꾸면 둘이 같이 바뀜
		
		System.out.println(array1[0]);		//7
		System.out.println(array2[0]);		//7
		
		System.out.println(array1);		//객체의 힙영역의 주소값 출력 (힙영역의 주소가 동일함)
		System.out.println(array2);		//객체의 힙영역의 주소값 출력 (힙영역의 주소가 동일함)
		
		
	}

}
