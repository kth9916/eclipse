package Chap16.EX06.EX1;

// GenericPrinter�� ���� ��ü [���]

public class Plastic extends Material{

	@Override
	public String toString() {
		return "���� �ö�ƽ �Դϴ�.";
	}
	
	public void doPrinting() {   // �߻� �޼ҵ�� Ŭ������ ������ �޼ҵ�
		System.out.println("�ö�ƽ ���� ����մϴ�. ");
	}

}