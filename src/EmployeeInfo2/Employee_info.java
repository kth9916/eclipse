package EmployeeInfo2;



import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;



class Employee implements Comparable<Employee>{		// 사원의 정보를 담은 클래스
	
	
	
	int empNo; 			// 사원번호
	String empName;		// 사원이름
	String phone;		// 연락처
	int age;			// 나이
	String dept;		// 부서
	String compRank;	// 직급
	
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

// do while문 써서 1번 누르면 

public class Employee_info {
	
	private static TreeSet<Employee> aSet = new TreeSet<Employee>();
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createMember() {
		System.out.println("----------------------");
		System.out.println("사번을 입력하세요.");
		int empNo = scanner.nextInt();
		System.out.println("이름을 입력하세요.");
		String empName = scanner.next();
		System.out.println("연락처를 입력하세요.");
		String phone = scanner.next();
		System.out.println("나이를 입력하세요.");
		int age = scanner.nextInt();
		System.out.println("부서를 입력하세요.");
		String dept = scanner.next();
		System.out.println("직급을 입력하세요.");
		String compRank = scanner.next();
		System.out.println();
		Employee newMember = new Employee(empNo, empName, phone, age, dept, compRank);
		
		aSet.add(newMember);
		
		System.out.println(newMember.empName + "님의 정보가 정상적으로 입력 되었습니다.");
		
	}
	
	private static void employeeList() {
		System.out.println("검색하고 싶은 사원의 사번을 입력하세요.");
		int empNo = scanner.nextInt();
		
		Iterator iter = aSet.iterator();
		while(iter.hasNext()) {
			iter.next().
		}
		
		if(employee == null) {
			System.out.println("해당 사원이 없습니다.");
			return;
		}
		
		System.out.println("사번 : " + employee.getEmpNo() + "		이름 : " + employee.getEmpName() + "		연락처 : " + employee.getPhone() + "		나이 : " + employee.getAge() + "		부서 : " + employee.getDept() + "		직급 : " + employee.getCompRank());
		
		
	}
	
	private static void modify() {
		System.out.println("수정하고 싶은 사원의 사번을 입력하세요.");
		int empNo = scanner.nextInt();
		
		Employee employee = findEmployee(empNo);
		
		if(employee == null) {
			System.out.println("해당 사원이 없습니다.");
			return;
		}
		
		System.out.println("사원의 수정할 연락처를 입력하세요.");
		String phone = scanner.next();
		employee.setPhone(phone);
		
		System.out.println("사원의 수정할 나이를 입력하세요.");
		int age = scanner.nextInt();
		employee.setAge(age);
		
		System.out.println("사원의 수정할 부서를 입력하세요.");
		String dept = scanner.next();
		employee.setDept(dept);
		
		System.out.println("사원의 수정할 직급를 입력하세요.");
		String compRank = scanner.next();
		employee.setCompRank(compRank);
	}
	
	private static void erase() {
		System.out.println("삭제하고 싶은 사원의 사번을 입력하세요.");
		int empNo = scanner.nextInt();
		
		Employee employee = findEmployee(empNo);
		
		if(employee == null) {
			System.out.println("해당 사원이 없습니다.");
			return;
		}
		
		aSet.remove(employee);
	}
	

		
		

	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("=======사원관리 프로그램============");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 검색");
			System.out.println("# 3. 사원정보 수정");
			System.out.println("# 4. 사원정보 삭제");
			System.out.println("# 5. 프로그램 종료");
			System.out.println("===============================");
			System.out.print("메뉴 입력 >>>");
			
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
		System.out.println("프로그램이 종료 되었습니다.");
	}
}
