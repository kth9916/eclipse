package Chap16.EX13;

// �� ���� ��ǥ ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���. ���ʸ� �޼ҵ带 ���.

class Point <T,V>{ 		// �� ���� ��ǥ�� ��� Ŭ����
	T x;	// �� ���� X ��ǥ
	V y;	// �� ���� Y ��ǥ
	
	Point(T x, V y){ 	// ������. Setter ��� �����ڸ� ���ؼ� ��ǥ�� �Ҵ�
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}	
}

class GenericMethod{

	
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		// �ڵ� �ۼ�
		double left = (double) p1.getX();
		double right = (double)p2.getX();
		double top = (double)p2.getY();
		double bottom = (double)p1.getY();
		
		double width = right - left;
		double height = top - bottom;
		
		return width * height; 		// ���� * ���� = ���� �� ����
	}
}

public class EX_Make_Rectangle_Difficult {

	public static void main(String[] args) {
		Point<Double, Double> p1 = new Point<Double, Double>(1.0,2.0);
		Point<Double, Double> p2 = new Point<Double, Double>(10.0,50.0);
		
		
		double rect = GenericMethod.<Double, Double>makeRectangle(p1, p2);
		System.out.println("�� ���� ���̴� : " + rect + " �Դϴ�.");

	}

}
