package practice;
public class RangeOfVariableUse {
	public static void main(String[] args) {
		int value01 = 3;
		{
			int value02 = 5;
			System.out.println(value01);
			System.out.println(value02);
		}
		
		System.out.println(value01);
//		System.out.println(value02);
	}

}
