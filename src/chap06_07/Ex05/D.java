package chap06_07.Ex05;

public class D {
	// �ʵ忡 �ο� �Ǵ� ���� ������
	private String company = "�����ڵ���"; 		// ȸ���
	String model; 		// ��, default
	protected String color; 	// ����
	public int maxSpeed; 		// �ִ� �ӵ�
	
	public void setModel(String model) { 	//public �ܺ� ��Ű���� Ŭ�������� ���� ����
		this.model	= model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	public void print() {
		System.out.println("company : " + company + " model : " + model + " color : " + color + " maxSpeed : " + maxSpeed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
