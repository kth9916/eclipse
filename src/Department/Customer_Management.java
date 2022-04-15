package Department;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



/*
  		��ȭ���� �� ���� ���α׷� (��Ӱ� ������)
  		
  		�� ��� : 1. �Ϲݰ�(silver) : ���ʽ�����Ʈ(1%����), ������(����) 
  				  2. Gold �� 		: ���ʽ�����Ʈ(2%����), ������(5%)
  				  3. VIP �� 		: ���ʽ�����Ʈ(5%����), ������(10%), ��� ������Ʈ  
 */

class Customer{ 	// �Ϲݰ�
	int customerID; 		// �� ID
	String customerName;	// �� �̸�
	String customerGrade;	// �� ���("Silver", "Gold", "VIP" )
	double bonusPoint; 		// ���ʽ� ����Ʈ ��
	double bounusRatio;		// ���ʽ� ����Ʈ ������ : "Silver : 1%, Gold : 2%, VIP : 5% 
	double saleRatio; 
	
	
	public Customer() {};
	// �����ڿ��� �⺻������ 2���� �ʵ��� ���� �ε� : customerGrade : Silver , bonusRatio : 1% 
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
	public double calcPrice(int price) { 				// ���� Ŭ�������� �������̵� �ؼ� ó�� >>
		// ��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
		
		return price;	// ���ε� ������ ���Ͻ��� �ش�.
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
	double saleRatio; 		// ��ǰ ������ : �����ڿ��� �⺻������ : 5%
	
	// �����ڿ��� �⺻������ 3���� �ʵ��� ���� �ε� : customerGrade : Gold , bonusRatio : 2% , saleRatio : 5% 
	
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
	double saleRatio;			// ��ǰ ������ : 10%
	private int agentID; 		// private �־����� ������ , setter ���ؼ� ����, �ʵ� �̸����� ���� X
	
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
	
	// �����ڿ��� �⺻������ 3���� �ʵ��� ���� �ε� : customerGrade : VIP , bonusRatio : 5% , saleRatio : 10% 
	
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
	
		// �� ID : �ߺ����� �ʵ���
	
	public static void regCusotmer(){

		System.out.println("�� ID�� �Է��ϼ���.");
		int customerID = sc.nextInt();
		System.out.println("�� �̸��� �Է��ϼ���.");
		String customerName = sc.next();
		System.out.println("���ʽ� ����Ʈ ���� �Է��ϼ���.");
		double bonusPoint = sc.nextDouble();
		
		cSet.add(new Customer(customerID, customerName, bonusPoint));
		System.out.println(customerName + "���� ������ ���������� �Է� �Ǿ����ϴ�.");
	}
	
	public static void regGoldCustomer(){

		System.out.println("�� ID�� �Է��ϼ���.");
		int customerID = sc.nextInt();
		System.out.println("�� �̸��� �Է��ϼ���.");
		String customerName = sc.next();
		System.out.println("���ʽ� ����Ʈ ���� �Է��ϼ���.");
		double bonusPoint = sc.nextDouble();
		
		cSet.add(new GoldCustomer(customerID, customerName, bonusPoint));
		System.out.println(customerName + "���� ������ ���������� �Է� �Ǿ����ϴ�.");
	}
	
	public static void regVIPCustomer(){

		System.out.println("�� ID�� �Է��ϼ���.");
		int customerID = sc.nextInt();
		System.out.println("�� �̸��� �Է��ϼ���.");
		String customerName = sc.next();
		System.out.println("���ʽ� ����Ʈ ���� �Է��ϼ���.");
		double bonusPoint = sc.nextDouble();
		System.out.println("������Ʈ�� ID�� �Է��ϼ���.");
		int agentID = sc.nextInt();
		
		cSet.add(new VIPcustomer(customerID, customerName, bonusPoint, agentID));
		
		
		System.out.println(customerName + "���� ������ ���������� �Է� �Ǿ����ϴ�.");
		
	}
	
	public static void showInfo() {
		
		Iterator<Customer> iter1 = cSet.iterator();
		System.out.println("��ID\t���̸�\t�����\t������\t���ʽ�����Ʈ����\t���ʽ�����Ʈ\t������ƮID");
		while(iter1.hasNext()) {
			Customer customer = iter1.next();
			customer.showinfo();
		}
	}
	
	public static void buy() {
		System.out.println("�����ϴ� ���� ���̵� �Է����ּ���.");
		int customerID = sc.nextInt();
		Customer customer = search(customerID);
		System.out.println("�����ϴ� ��ǰ�� ������ �Է����ּ���.");
		int price = sc.nextInt();
		customer.calcPrice(price);
		
		System.out.println(customer.getCustomerName() + " ����" + customer.calcPrice(price) + "�� ���� �ϼ̽��ϴ�.");
		System.out.println(customer.getCustomerName() + " ������ ����� " + customer.getCustomerGrade()+"�̰� ���� ����Ʈ�� " +( ( customer.calcPrice(price)*customer.getBounusRatio())+customer.getBonusPoint()) + " ������ " + (price*customer.saleRatio) + "�� �Ǿ����ϴ�.");
		
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
		System.out.println("1. �Ϲݰ� ��� | 2. VIP �� ��� | 3. Gold �� ��� | 4. ���� ��� | 5. ��ǰ���� | 6. ����");
		System.out.println("====================================================================================");
		
		System.out.print("���� >> ");
		
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
		���� >> 1
		==�Ϲݰ� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>2
		==VIP �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 
		��翡����Ʈ(ID) ��� : 

		���� >>3
		==Gold �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>4
		==�� ���� ���  �Դϴ�. ==
		��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>


		���� >>5
		==��ǰ������ ������ �ּ��� ==
		�� ���̵� : 
		���� ��ǰ ���� :  

		000 ���� 000 �� ���� �ϼ̽��ϴ�. 
		000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 
		  
		 */
	}
	}



