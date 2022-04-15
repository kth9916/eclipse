package Department;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



/*
  		백화점의 고객 관리 프로그램 (상속과 다형성)
  		
  		고객 등급 : 1. 일반고객(silver) : 보너스포인트(1%적립), 할인율(없음) 
  				  2. Gold 고객 		: 보너스포인트(2%적립), 할인율(5%)
  				  3. VIP 고객 		: 보너스포인트(5%적립), 할인율(10%), 담당 에이전트  
 */

class Customer{ 	// 일반고객
	int customerID; 		// 고객 ID
	String customerName;	// 고객 이름
	String customerGrade;	// 고객 등급("Silver", "Gold", "VIP" )
	double bonusPoint; 		// 보너스 포인트 값
	double bounusRatio;		// 보너스 포인트 적립율 : "Silver : 1%, Gold : 2%, VIP : 5% 
	double saleRatio; 
	
	
	public Customer() {};
	// 생성자에서 기본적으로 2개의 필드의 값은 로드 : customerGrade : Silver , bonusRatio : 1% 
	public Customer(int customerID,String customerName, double bonusPoint ) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusPoint = bonusPoint;
		this.bounusRatio = 0.01;
	}
	public void showinfo() {
		System.out.println(customerID+ "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio + "\t" + bounusRatio + "\t\t" + bonusPoint);
	}
	public double calcPrice(int price) { 				// 하위 클래스에서 오버라이딩 해서 처리 >>
		// 물품의 가격을 받아서 보너스 포인트를 적립하는 코드
		
		return price;	// 할인된 가격을 리턴시켜 준다.
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBounusRatio() {
		return bounusRatio;
	}

	public void setBounusRatio(double bounusRatio) {
		this.bounusRatio = bounusRatio;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(customerID);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Customer) {
			if(customerID == ((Customer)obj).customerID) {
				return true;
			}
		}
		
		return false;
	}
	

}

class GoldCustomer extends Customer{
	double saleRatio; 		// 물품 할인율 : 생성자에서 기본적으로 : 5%
	
	// 생성자에서 기본적으로 3개의 필드의 값은 로드 : customerGrade : Gold , bonusRatio : 2% , saleRatio : 5% 
	
	public GoldCustomer(int customerID, String customerName, double bonusPoint ) {
		this.customerID = customerID;
		super.customerName = customerName;
		this.customerGrade = "Gold";
		super.bonusPoint = bonusPoint;
		this.bounusRatio = 0.02;
		super.saleRatio = 0.05;
	}
	
	public void showinfo() {
		System.out.println(customerID+ "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio + "\t" + bounusRatio + "\t\t" + bonusPoint);
	}
	
	@Override
	public double calcPrice(int price) {
		return (price*0.95);
	}
	

}

class VIPcustomer extends Customer{
	double saleRatio;			// 물품 할인율 : 10%
	private int agentID; 		// private 넣었으니 생성자 , setter 통해서 접근, 필드 이름으로 접근 X
	
	public VIPcustomer(int customerID, String customerName, double bonusPoint, int agentID) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.customerGrade = "Vip";
		this.bonusPoint = bonusPoint;
		super.bounusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
		super.saleRatio = 0.1;
	}
	
	public void showinfo() {
		System.out.println(customerID+ "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio + "\t" + bounusRatio + "\t\t" + bonusPoint + "\t\t" + agentID);
	}
	
	// 생성자에서 기본적으로 3개의 필드의 값은 로드 : customerGrade : VIP , bonusRatio : 5% , saleRatio : 10% 
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	@Override
	public double calcPrice(int price) {
		return price*0.9;
	}
	

}



public class Customer_Management {
	public static Scanner sc = new Scanner(System.in);
	public static Set<Customer> cSet = new HashSet<Customer>();
	
		// 고객 ID : 중복되지 않도록
	
	public static void regCusotmer(){

		System.out.println("고객 ID를 입력하세요.");
		int customerID = sc.nextInt();
		System.out.println("고객 이름을 입력하세요.");
		String customerName = sc.next();
		System.out.println("보너스 포인트 값을 입력하세요.");
		double bonusPoint = sc.nextDouble();
		
		cSet.add(new Customer(customerID, customerName, bonusPoint));
		System.out.println(customerName + "님의 정보가 정상적으로 입력 되었습니다.");
	}
	
	public static void regGoldCustomer(){

		System.out.println("고객 ID를 입력하세요.");
		int customerID = sc.nextInt();
		System.out.println("고객 이름을 입력하세요.");
		String customerName = sc.next();
		System.out.println("보너스 포인트 값을 입력하세요.");
		double bonusPoint = sc.nextDouble();
		
		cSet.add(new GoldCustomer(customerID, customerName, bonusPoint));
		System.out.println(customerName + "님의 정보가 정상적으로 입력 되었습니다.");
	}
	
	public static void regVIPCustomer(){

		System.out.println("고객 ID를 입력하세요.");
		int customerID = sc.nextInt();
		System.out.println("고객 이름을 입력하세요.");
		String customerName = sc.next();
		System.out.println("보너스 포인트 값을 입력하세요.");
		double bonusPoint = sc.nextDouble();
		System.out.println("에이전트의 ID를 입력하세요.");
		int agentID = sc.nextInt();
		
		cSet.add(new VIPcustomer(customerID, customerName, bonusPoint, agentID));
		
		
		System.out.println(customerName + "님의 정보가 정상적으로 입력 되었습니다.");
		
	}
	
	public static void showInfo() {
		
		Iterator<Customer> iter1 = cSet.iterator();
		System.out.println("고객ID\t고객이름\t고객등급\t할인율\t보너스포인트비율\t보너스포인트\t에이전트ID");
		while(iter1.hasNext()) {
			Customer customer = iter1.next();
			customer.showinfo();
		}
	}
	
	public static void buy() {
		System.out.println("구매하는 고객의 아이디를 입력해주세요.");
		int customerID = sc.nextInt();
		Customer customer = search(customerID);
		System.out.println("구매하는 물품의 가격을 입력해주세요.");
		int price = sc.nextInt();
		customer.calcPrice(price);
		
		System.out.println(customer.getCustomerName() + " 고객님" + customer.calcPrice(price) + "원 지불 하셨습니다.");
		System.out.println(customer.getCustomerName() + " 고객님의 등급은 " + customer.getCustomerGrade()+"이고 현재 포인트는 " +( ( customer.calcPrice(price)*customer.getBounusRatio())+customer.getBonusPoint()) + " 할인은 " + (price*customer.saleRatio) + "원 되었습니다.");
		
		customer.bonusPoint = ( ( customer.calcPrice(price)*customer.getBounusRatio())+customer.getBonusPoint());
	
		
		
		
		
		
	}
	
	private static Customer search(int customerID) {
		Iterator<Customer> iter = cSet.iterator();
		while (iter.hasNext()) {
			Customer customer = iter.next();
			if(customerID == customer.getCustomerID()) {
				return customer;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println("====================================================================================");
		System.out.println("1. 일반고객 등록 | 2. VIP 고객 등록 | 3. Gold 고객 등록 | 4. 정보 출력 | 5. 물품구매 | 6. 종료");
		System.out.println("====================================================================================");
		
		System.out.print("선택 >> ");
		
		boolean run = true;
		while(run) {
			int selectNo = sc.nextInt();
			switch(selectNo) {
			
			case 1:
				regCusotmer();
				break;
			case 2:
				regVIPCustomer();
				break;
			case 3:
				regGoldCustomer();
				break;
			case 4:
				showInfo();
				break;
			case 5:
				buy();
				break;
			case 6:
				run = false;
				break;
			}
			
		}
		/*
		선택 >> 1
		==일반고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>2
		==VIP 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 
		담당에이젼트(ID) 등록 : 

		선택 >>3
		==Gold 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>4
		==고객 정보 출력  입니다. ==
		고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>


		선택 >>5
		==물품가격을 지불해 주세요 ==
		고객 아이디 : 
		구매 물품 가격 :  

		000 고객님 000 원 지불 하셨습니다. 
		000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 
		  
		 */
	}
	}



