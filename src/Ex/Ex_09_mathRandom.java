package Ex;

public class Ex_09_mathRandom {

	public static void main(String[] args) {
		// double c = (double) math.random(); <== 0.000000xxx  ~0.99999xxx < == 범위의 임의의 값을 발생시킴(난수발생기)
				// int i = (int) (math.random() * 10); // 0 ~ 9까지의 랜덤한 값을 생성
				
				double d = (double) Math.random();
				System.out.println(d);
				int c = (int)(Math.random() * 10); // 0부터 9까지의 랜덤한 값을 생성
				System.out.println("0부터 9까지의 랜덤한 값 : "+c);
				int e = (int)(Math.random() * 10 + 1); // 1부터 10까지의 랜덤한 값을 생성
				System.out.println("1부터 10까지의 랜덤한 값 : "+e);
				int f = (int)(Math.random() * 100 + 1); // 1부터 100까지의 랜덤한 값을 생성
				System.out.println("1부터 100까지의 랜덤한 값 : "+f);

	}

}
