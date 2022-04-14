package EmployeeInfo;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{		// ����� ������ ���� Ŭ����
	
	
	
	int empNo; 			// �����ȣ
	String empName;		// ����̸�
	String phone;		// ����ó
	int age;			// ����
	String dept;		// �μ�
	String compRank;	// ����
	
	public Employee(int empNo, String empName, String phone, int age, String dept, String compRank) {
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	
	
	
}

// do while�� �Ἥ 1�� ������ 

public class Employee_info {
	
	private static ArrayList<Employee> aList = new ArrayList<Employee>();
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createMember() {
		System.out.println("----------------------");
		System.out.println("����� �Է��ϼ���.");
		int empNo = scanner.nextInt();
		System.out.println("�̸��� �Է��ϼ���.");
		String empName = scanner.next();
		System.out.println("����ó�� �Է��ϼ���.");
		String phone = scanner.next();
		System.out.println("���̸� �Է��ϼ���.");
		int age = scanner.nextInt();
		System.out.println("�μ��� �Է��ϼ���.");
		String dept = scanner.next();
		System.out.println("������ �Է��ϼ���.");
		String compRank = scanner.next();
		System.out.println();
		Employee newMember = new Employee(empNo, empName, phone, age, dept, compRank);
		
		aList.add(newMember);
		
		System.out.println(newMember.empName + "���� ������ ���������� �Է� �Ǿ����ϴ�.");
		
	}
	
	private static void employeeList() {
		System.out.println("�˻��ϰ� ���� ����� ����� �Է��ϼ���.");
		int empNo = scanner.nextInt();
		
		Employee employee = findEmployee(empNo);
		
		if(employee == null) {
			System.out.println("�ش� ����� �����ϴ�.");
			return;
		}
		
		System.out.println("��� : " + employee.getEmpNo() + "		�̸� : " + employee.getEmpName() + "		����ó : " + employee.getPhone() + "		���� : " + employee.getAge() + "		�μ� : " + employee.getDept() + "		���� : " + employee.getCompRank());
		
		
	}
	
	private static void modify() {
		System.out.println("�����ϰ� ���� ����� ����� �Է��ϼ���.");
		int empNo = scanner.nextInt();
		
		Employee employee = findEmployee(empNo);
		
		if(employee == null) {
			System.out.println("�ش� ����� �����ϴ�.");
			return;
		}
		
		System.out.println("����� ������ ����ó�� �Է��ϼ���.");
		String phone = scanner.next();
		employee.setPhone(phone);
		
		System.out.println("����� ������ ���̸� �Է��ϼ���.");
		int age = scanner.nextInt();
		employee.setAge(age);
		
		System.out.println("����� ������ �μ��� �Է��ϼ���.");
		String dept = scanner.next();
		employee.setDept(dept);
		
		System.out.println("����� ������ ���޸� �Է��ϼ���.");
		String compRank = scanner.next();
		employee.setCompRank(compRank);
	}
	
	private static void erase() {
		System.out.println("�����ϰ� ���� ����� ����� �Է��ϼ���.");
		int empNo = scanner.nextInt();
		
		Employee employee = findEmployee(empNo);
		
		if(employee == null) {
			System.out.println("�ش� ����� �����ϴ�.");
			return;
		}
		
		aList.remove(employee);
	}
	
	private static Employee findEmployee(int empNo) {
		Employee employee = null;
		for(int i = 0; i < aList.size(); i++) {
			if(aList.get(i) != null) {
				int dbNo = aList.get(i).getEmpNo();
				if(dbNo == empNo) {
					employee = aList.get(i);
					break;
				}
			}
		}
		return employee;
	}
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("=======������� ���α׷�============");
			System.out.println("# 1. ������� �űԵ��");
			System.out.println("# 2. ������� �˻�");
			System.out.println("# 3. ������� ����");
			System.out.println("# 4. ������� ����");
			System.out.println("# 5. ���α׷� ����");
			System.out.println("===============================");
			System.out.print("�޴� �Է� >>>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createMember();
			}else if(selectNo == 2) {
				employeeList();
			}else if(selectNo == 3) {
				modify();
			}else if(selectNo == 4) {
				erase();
			}else if(selectNo == 5) {
				run = false;
				break;
			}
		}
		scanner.close();
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
}
