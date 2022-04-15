package employeeInfo_difficult;



import java.util.Iterator;



import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;




class Employee implements Comparable<Employee>{		// ����� ������ ���� Ŭ����
	
	
	
	private int empNo; 			// �����ȣ
	private String empName;		// ����̸�
	private String phone;		// ����ó
	private int age;			// ����
	private String dept;		// �μ�
	private String compRank;	// ����
	
	public Employee(int empNo, String empName, String phone, int age, String dept, String compRank) {
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.empNo <o.empNo) {
			return -1;
		} else if(this.empNo == o.empNo) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			if(empNo == ((Employee)obj).empNo) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(empNo);
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
// Treeset : �ߺ��� �����͸� ������ �� ����. Wrapper Ŭ������ ������ �Ǿ� �ִ�. equals(), hashCode()
		// ���ĵǾ ����,
			// �Ϲݰ�ü�� set �ڷ����� �����Ҷ��� ��ü�� Ư���ʵ尡 �ߺ� ������� �ʵ��� equals(), hashCode() ������ �ؾ��Ѵ�.
	// Wrapper : �⺻�ڷ����� ��ü�� �⺻�ڷ������� ���� �޼ҵ尡 �߰�.(Boolean, Byte, Character, Integer, Double ...)
		// Comparable compareTo() : ����ؼ� ����, ��ü ����, ||| Comparator  compare() : �������� ��밡��

public class Employee_info {
	
	private static TreeSet<Employee> aSet = new TreeSet<Employee>();
	
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
		
		aSet.add(newMember);
		
		System.out.println(empName + "���� ������ ���������� �Է� �Ǿ����ϴ�.");
		
	}
	
	
	private static void search() {
		System.out.println("�˻��ϰ� ���� ����� ����� �Է��ϼ���.");
		
		int empNo = scanner.nextInt();
		

		
		Employee employee = searchEmp(empNo);
		
		if(employee == null) {
			System.out.println("�ش� ����� �����ϴ�.");
			return;
		}
		
		System.out.print("���\t�̸�\t����ó\t\t����\t�μ�\t����\t");
		System.out.println();
		System.out.print(employee.getEmpNo()+ "\t");
		System.out.print(employee.getEmpName()+ "\t");
		System.out.print(employee.getPhone() + "\t");
		System.out.print(employee.getAge()+ "\t");
		System.out.print(employee.getDept()+ "\t");
		System.out.print(employee.getCompRank()+ "\t");
		System.out.println();
		

	}
	
	private static void modify() {
		System.out.println("�����ϰ� ���� ����� ����� �Է��ϼ���.");
		int empNo = scanner.nextInt();
		
		Employee employee = searchEmp(empNo);
		
		if(employee == null) {
			System.out.println("�ش� ����� �����ϴ�.");
			return;
		}
		
		System.out.print("����� �����ϰ� ���� �ʵ� ���� [1. ����ó, 2. ����, 3. �μ�, 4. ���� 5. ���� ����] :");
		
		
		
		boolean run = true;
		while(run) {
			int modiNo = scanner.nextInt();
			switch (modiNo) {
			case 1: 
				System.out.println("����� ������ ����ó�� �Է��ϼ���.");
				String phone = scanner.next();
				employee.setPhone(phone);
				System.out.println("���� �Ϸ��߽��ϴ�.");
				break;
			case 2: 
				System.out.println("����� ������ ���̸� �Է��ϼ���.");
				int age = scanner.nextInt();
				employee.setAge(age);
				System.out.println("���� �Ϸ��߽��ϴ�.");
				break;
			case 3:
				System.out.println("����� ������ �μ��� �Է��ϼ���.");
				String dept = scanner.next();
				employee.setDept(dept);
				System.out.println("���� �Ϸ��߽��ϴ�.");
				break;
			case 4:
				System.out.println("����� ������ ���޸� �Է��ϼ���.");
				String compRank = scanner.next();
				employee.setCompRank(compRank);
				System.out.println("���� �Ϸ��߽��ϴ�.");
				break;
			case 5:
				run = false;
				break;
		}
		}
	}
	
	private static void erase() {
		System.out.println("�����ϰ� ���� ����� ����� �Է��ϼ���.");
		int empNo = scanner.nextInt();
		
		Employee employee = searchEmp(empNo);
		
		if(employee == null) {
			System.out.println("�ش� ����� �����ϴ�.");
			return;
		}
		
		aSet.remove(employee);
		System.out.println("���� �Ϸ�Ǿ����ϴ�.");
	}
	
	private static Employee searchEmp(int empNo) {
		Iterator<Employee> iter = aSet.iterator();
		while(iter.hasNext()) {
			Employee employee = iter.next();
			if(empNo == employee.getEmpNo()) {
				return employee;
			}
		}
		return null;
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
			
			switch (selectNo) {
			case 1: 
				createMember();
				break;
			case 2: 
				search();
				break;
			case 3: 
				modify();
				break;
			case 4: 
				erase();
				break;
			case 5: 
				run = false;
				break;
			}
		}
		
		
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
}
