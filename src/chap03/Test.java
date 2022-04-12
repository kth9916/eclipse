package chap03;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력 하세요");
		
		int input = sc.nextInt();
		System.out.println((input % 3 == 0)?"3의 배수입니다.":"3의 배수가 아닙니다.");
	}

}
