package chap03;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է� �ϼ���");
		
		int input = sc.nextInt();
		System.out.println((input % 3 == 0)?"3�� ����Դϴ�.":"3�� ����� �ƴմϴ�.");
	}

}
