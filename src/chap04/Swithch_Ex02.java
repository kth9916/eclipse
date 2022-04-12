package chap04;
public class Swithch_Ex02 {
	public static void main(String[] args) {
		
		// 1. Switch 문에서 Break를 처리 하지 않았을 때 : 해당 case로 이동한 후 switch 문을 빠져나오지 않고 하위의 case를 모두 실행한다.
		
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A 학점");
		case 2:
			System.out.println("B 학점");
		case 3:
			System.out.println("C 학점");
		default :
			System.out.println("F 학점");
		}
		
		System.out.println("=======");
		
		// 2. break가 포함된 경우
		
		int value2 = 3;
		switch(value2) {
		case 1:
			System.out.println("A 학점");
			break;
		case 2:
			System.out.println("B 학점");
			break;
		case 3:
			System.out.println("C 학점");
			break;
		default :
			System.out.println("F 학점");		//switch의 마지막 case(default)는 break를 생략 가능
		}
		
		System.out.println("=======");
		
		//if는 빠져나오기 때문에 break가 필요 없다.
		
		value2 = 5;
		
		if (value2 == 1) {
			System.out.println("A 학점(if)");
		}else if (value2 == 2){
			System.out.println("B 학점(if)");
		}else if (value2 == 3) {
			System.out.println("C 학점(if)");
		}else {
			System.out.println("F 학점(if)");
		}
		
		System.out.println("=============");
		
		/*
		 * switch문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail을 출력 (점수 : 1 ~ 10)
		 */
		
		int a = 1;
		
		switch (a) {
		case 10: // System.out.println("pass");
				//	break; 
				// 위의 구문을 다 넣어도됨. 넣을 필요가 없어서 생략한 것.
		case 9:
		case 8:
		case 7:
			System.out.println("pass");
			break;
		default :
			System.out.println("fail");
		}
	}

}
