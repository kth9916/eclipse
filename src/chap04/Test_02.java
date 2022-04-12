package chap04;
public class Test_02 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 20; i++) {
			for(int j = 1; j < 20; j++) {
				if((i%3 == 1) || (i%3 == 2)) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + i*j);
			} 
		}
	}

}



