package chap06_07.Ex02;

public class Car {

	String company ;
	String model;
	String color;
	int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {		// RAM의 값을 부여할 때 setter
		this.company = company;						// this : 자신의 객체
	}												// 메소드에 인풋되는 변수명, 인풋된 변수를 받는 변수명, 메모리에 로드할 변수명
													// 세개가 동일할 경우 this. 써야함 / this 빼면 오류가 발생
	public String getModel() {
		return model;
	}
	public void setModel(String model) { 			// 인풋, 인풋을 받는 변수, 메모리에 로드할 변수가 다를 때에는 this를 넣어도 되고 안넣어도 된다
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	

}
