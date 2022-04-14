package EmployeeInfo.E1;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


//�̴��� : 1:06�� �Ϸ�. 

class Employee implements Comparable<Employee> { // ��������� ���� Ŭ����
	private int empNo;
	private String empName;
	private String phone;
	private int age;
	private String department;
	private String compRank;

	public Employee(int empNo, String empName, String phone, int age, String department, String compRank) {
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.department = department;
		this.compRank = compRank;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			if (empNo == ((Employee) obj).empNo) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.empNo < o.empNo)
			return -1;
		else if (this.empNo == o.empNo)
			return 0;
		else
			return 1;
	}
}





public class Employee_info_1 {
	private static TreeSet<Employee> emp = new TreeSet<>();
	private static Scanner scan = new Scanner(System.in);

	private static void createEmpInfo() {
		System.out.print("- ��� : ");
		int empNo = scan.nextInt();
		System.out.print("- �̸� : ");
		String empName = scan.next();
		System.out.print("- ����ó : ");
		String phone = scan.next();
		System.out.print("- ���� : ");
		int age = scan.nextInt();
		System.out.print("- �μ� : ");
		String department = scan.next();
		System.out.print("- ���� : ");
		String compRank = scan.next();
		emp.add(new Employee(empNo, empName, phone, age, department, compRank));
		System.out.println(empName + "���� ������ ���������� �Է� �Ǿ����ϴ�.");
	}

	private static Employee searchEmpInfo(int empNo) {
		Iterator<Employee> iter = emp.iterator();
		while (iter.hasNext()) {
			Employee employee = iter.next();
			if(empNo == employee.getEmpNo()) {
				return employee;
			}
		}
		return null;
	}
	
	private static void showEmpInfo() {
		Iterator<Employee> iter = emp.iterator();
		System.out.println("���\t�̸�\t����ó\t����\t�μ�\t����");
		while (iter.hasNext()) {
			Employee employee = iter.next();
			System.out.print(employee.getEmpNo());
			System.out.print("\t");
			System.out.print(employee.getEmpName());
			System.out.print("\t");
			System.out.print(employee.getPhone());
			System.out.print("\t");
			System.out.print(employee.getAge());
			System.out.print("\t");
			System.out.print(employee.getDepartment());
			System.out.print("\t");
			System.out.println(employee.getCompRank());
		}
	}
	
	private static void modEmpInfo() {
		System.out.print("������ ��� : ");
		int empNo = scan.nextInt();
		
		Employee employee = searchEmpInfo(empNo);
		
		System.out.print("������ �ʵ� ���� [1. ����ó, 2.����, 3. �μ�, 4.����] : ");
		int sel = scan.nextInt();
		switch(sel){
		case 1:
			System.out.print("������ ����ó �Է� : ");
			String phone = scan.next();
			employee.setPhone(phone);
			break;
		case 2:
			System.out.print("������ ���� �Է� : ");
			int age = scan.nextInt();
			employee.setAge(age);
			break;
		case 3:
			System.out.print("������ �μ� �Է� : ");
			String department = scan.next();
			employee.setDepartment(department);
			break;
		case 4:
			System.out.print("������ ���� �Է� : ");
			String compRank = scan.next();
			employee.setCompRank(compRank);
			break;
		}
	}
	
	private static void delEmpInfo() {
		System.out.print("������ ��� : ");
		int empNo = scan.nextInt();
		
		Employee employee = searchEmpInfo(empNo);
		
		emp.remove(employee);
	}

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("=======������� ���α׷�============");
			System.out.println("# 1. ������� �űԵ��");
			System.out.println("# 2. ������� �˻�");
			System.out.println("# 3. ������� ����");
			System.out.println("# 4. ������� ����");
			System.out.println("# 5. ���α׷� ����");
			System.out.println("===============================");
			System.out.print("�޴� �Է� : ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				createEmpInfo();
				System.out.println();
				break;
			case 2:
				showEmpInfo();
				System.out.println();
				break;
			case 3:
				modEmpInfo();
				System.out.println();
				break;
			case 4:
				delEmpInfo();
				System.out.println();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");

	}

}
