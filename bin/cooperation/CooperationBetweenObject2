package cooperation;

import java.util.ArrayList;

//객체간의 협업 
/*				학생의 용돈 : 100,000
 		학생 		: 			버스를 탈때(-1000원)	지하철을 탈때 (-1,500)
 		버스		: 1,000원	승객수 증가, 수입 증가	
 		지하철 	: 1,500원 						승객수 증가, 수입 증가
 
 */

class Student {
	String studentName ; 	//학생명
	int money; 				//학생이 가진돈, 초기값 : 100,000
	
	public void takeBus (Bus bus) {		//학생이 버스를 탔을때? 버스에 돈을 지불 해야 한다. 
		bus.take(1000);
	}
	public void takeOutBus (Bus bus) {	//버스에서 내림. 
		bus.takeOut(); 
	}
	public void takeSubway(Subway subway) {		//지하철을 탈때
		subway.take(1500); 
	}
	public void takeOutSubway(Subway subway) {	//지하철을 내릴때 
		subway.takeOut();
	}
	
}
class Bus{
	 int busName; 	// 100번 버스, 200버스		<== 인풋값을 받아서 , 생성자. 
	 int passengerCount; 	// 승객수 
	 int money;				// 버스의 수입 
	 
	 public void take(int money) { 		//버스의 수입을 처리, 승객수를 처리 
		 
	 }
	 public void takeOut() {	//승객수만 감소 
		 
	 }
	 
	
}
class Subway{
	String lineNumber;     //"1호선", 2호선, 3호선
	int passengerCount; 	//승객수 
	int money; 				//수입 
	
	//생성자를 통해서 지하철 호선을 인풋 받아서 활성화. 
	
	public void take(int money) {    //수입을 처리하는 메소드, 승객수 
		
	}
	public void takeOut() {		//지하철에서 승객감소
			
	}
	
}


public class CooperationBetweenObject {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>(); 
		
		/*
		학생 5명 입력 : 학생당 100,000만원 초기값 할당. 
		=============================================
		1. 학생객체 생성  | 2. 학생정보 출력 및 선택  
		3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  
		=============================================
		선택>> 1
		학생이름  : 
		 돈 입력   : 

		선택>> 2 
		=====학생정보 출력=====
		학생이름	가진돈



		학생선택(이름입력)>> 


		선택>> 3
		000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		버스 000번의 승객은 000명이고 수입은000 입니다. 

		선택>> 4
		000 님 000 번 버스를 내렸습니다. 굿바이~~~. 
		000 님의 남은돈은 000 입니다. 
		버스 00번의 승객은 000명이고 수입은 000 입니다. 

		선택>> 5
		000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 

		선택>> 6
		000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
		*/ 


		

	}

}
