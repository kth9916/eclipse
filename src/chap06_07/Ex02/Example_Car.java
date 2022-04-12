package chap06_07.Ex02;

public class Example_Car {

	public static void main(String[] args) {
		// Car Class를 객체화 해서 5개의 객체를 생성해서 값을 할당 해서 출력 해보세요.
		// 각 변수의 값을 할당하고 출력해보세요(메모리를 직접 사용, settor를 통해서 값을 할당)
		
		Car sonata = new Car();
		
		System.out.println("=======sonata=========");
		
		// 변수의 값을 직접 할당, 권장 사항은 아니다. 메모리에 원치 않는 값을 직접 할당
		// private 변수명 : 캡슐화, 직접 변수의 값을 할당하지 못하도록 한다. 
		// settor를 통해서 값을 부여 : 변수의 입력되는 값을 제어할 수 있다.
		
		sonata.company = "현대";
		sonata.model = "중형";
		sonata.color = "black";
		sonata.maxSpeed =290; 		// 마이너스 값, 700값 이상을 넣을 수 없도록 제어
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("현대");
		sonata.setModel("중형");
		sonata.setColor("black");
		sonata.setMaxSpeed(290);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car avantte = new Car();
		
		System.out.println("==========avantte========");
		sonata.company = "현대";
		sonata.model = "준중형";
		sonata.color = "white";
		sonata.maxSpeed =204;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("현대");
		sonata.setModel("준중형");
		sonata.setColor("white");
		sonata.setMaxSpeed(204);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car gradndeur = new Car();
		
		System.out.println("==========grandeur========");
		sonata.company = "현대";
		sonata.model = "준대형";
		sonata.color = "gray";
		sonata.maxSpeed =290;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("현대");
		sonata.setModel("준대형");
		sonata.setColor("gray");
		sonata.setMaxSpeed(290);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car ferrari = new Car();
		
		System.out.println("==========ferrari========");
		sonata.company = "페라리";
		sonata.model = "스포츠카";
		sonata.color = "red";
		sonata.maxSpeed =830;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("페라리");
		sonata.setModel("스포츠카");
		sonata.setColor("red");
		sonata.setMaxSpeed(830);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		Car rollsroyce = new Car();
		
		System.out.println("==========rollsroyce========");
		sonata.company = "롤스로이스";
		sonata.model = "대형 SUV";
		sonata.color = "black";
		sonata.maxSpeed =563;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		
		System.out.println("===get - set====");
		
		sonata.setCompany("롤스로이스");
		sonata.setModel("대형 SUV");
		sonata.setColor("black");
		sonata.setMaxSpeed(563);
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
	
	}

}
