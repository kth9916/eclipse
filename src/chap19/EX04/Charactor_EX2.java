package chap19.EX04;

/*
 * ��Ʈ : �迭 �� 26�� �����ؼ� for���� �����ؼ� ���
 A ~ Z ������ �ƽ�Ű �ڵ尪 ���
 
 ��� ���
===========================
 A,65
 B, 66
 ...
 Z, 97
 
  a ~ z ������ �ƽ�Ű �ڵ尪 ���
 
 ��� ���
===========================
 a,97
 b, 98
 ...
 z, 
 

 */

public class Charactor_EX2 {

	public static void main(String[] args) {
		System.out.println("1. �빮�� : A ~ Z������ �ƽ�Ű �ڵ尪 ���");
		System.out.println();
		System.out.println("��°��");
		System.out.println("================================");
		for(int i = 65; i < 91; i++) {
			System.out.println((char)i + " , " + i);
		}
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		
		System.out.println("2. �ҹ��� : a ~ z������ �ƽ�Ű �ڵ尪 ���");
		System.out.println();
		System.out.println("��°��");
		System.out.println("================================");
		for(int i = 97; i < 123; i++) {
			System.out.println((char)i + " , " + i);
		}
	}

}
