package practice;
public class FloatVsDouble {
	public static void main(String[] args) {
		float f1 = 1.0000001f; //4byte�ϱ� 7�ڸ����� ����
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		double d1 = 1.000000000000001; //8byte�ϱ� 15�ڸ����� ����
		System.out.println(d1);
		double d2 = 1.00000000000000001;
		System.out.println(d2);
		
	}

}
