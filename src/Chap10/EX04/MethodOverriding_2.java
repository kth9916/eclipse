package Chap10.EX04;

class Animal2{
	void run() {
		
	}
}

class Tiger extends Animal2{ 	// 호랑이는 네발로 달립니다.
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다. ");
	}
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다. ");
	}
}

class Eagle extends Animal2{ 	// 독수리는 하늘을 납니다.
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다. ");
	}
	void eagleEat() {
		System.out.println("독수리는 다른 새를 잡아 먹습니다. ");
	}
}

class Snake extends Animal2{	// 뱀은 기어다닙니다.
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다. ");
	}
	void snakeEat() {
		System.out.println("뱀은 벌레들을 삼켜 먹습니다. ");
	}
}

public class MethodOverriding_2 {

	public static void main(String[] args) {
		
		// 1. 모든 객체는 Animal2 타입으로 업캐스팅해서 생성
		Animal2 a = new Animal2();
		Tiger b = new Tiger();
		Eagle c = new Eagle();
		Snake d = new Snake();
		
		Animal2 ab = new Tiger();
		Animal2 ac = new Eagle();
		Animal2 ad = new Snake();
		
		// 2. Animal2 배열에 각 객체를 저장
		Animal2[] animal2 = {b,c,d};
		
		System.out.println("========= For 문 ==========");
		// 3. for문으로 배열의 객체를 출력 .run()을 실행
		for(int i = 0; i < animal2.length; i++) {
			animal2[i].run();
		}
		
		System.out.println("======== Enhanced For 문 =========");
		// 4. Enhanced For 문을 사용해서 객체의 run method 출력
		for(Animal2 k : animal2) {
			k.run();
		}
		System.out.println("======== instanceof =============");
		// 5. 다운 캐스팅 해서 (instanceof) 사용해서 
		if (ab instanceof Tiger) {
			Tiger t = (Tiger)ab;
			t.tigerEat();
		}else {
			System.out.println("ab는 Tiger 타입으로 다운캐스팅 불가");
		}
		
		if (ac instanceof Eagle) {
			Eagle e = (Eagle)ac;
			e.eagleEat();
		}else {
			System.out.println("ac는 Eagle 타입으로 다운캐스팅 불가");
		}
		
		if (ad instanceof Snake) {
			Snake s = (Snake)ad;
			s.snakeEat();
		}else {
			System.out.println("ad는 Snake 타입으로 다운캐스팅 불가");
		}
		
	}

}
