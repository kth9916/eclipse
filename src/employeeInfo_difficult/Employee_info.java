package employeeInfo_difficult;



import java.util.Iterator;



import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;




class Employee implements Comparable<Employee>{		// 사원의 정보를 담은 클래스
	
	
	
	private int empNo; 			// 사원번호
	private String empName;		// 사원이름
	private String phone;		// 연락처
	private int age;			// 나이
	private String dept;		// 부서
	private String compRank;	// 직급
	
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
// Treeset : 중복된 데이터를 저장할 수 없다. Wrapper 클래스는 재정의 되어 있다. equals(), hashCode()
		// 정렬되어서 저장,
			// 일반객체를 set 자료형에 저장할때는 객체의 특정필드가 중복 저장되지 않도록 equals(), hashCode() 재정의 해야한다.
	// Wrapper : 기본자료형을 객체와 기본자료형에는 없는 메소드가 추가.(Boolean, Byte, Character, Integer, Double ...)
		// Comparable compareTo() : 상속해서 구현, 객체 수정, ||| Comparator  compare() : 수정없이 사용가능

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
		
		System.out.println(empName + "님의 정보가 정상적으로 입력 되었습니다.");
		
	}
	
	
	private static void search() {
		System.out.println("검색하고 싶은 사원의 사번을 입력하세요.");
		
		int empNo = scanner.nextInt();
		

		
		Employee employee = searchEmp(empNo);
		
		if(employee == null) {
			System.out.println("해당 사원이 없습니다.");
			return;
		}
		
		System.out.print("사번\t이름\t연락처\t\t나이\t부서\t직급\t");
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
		System.out.println("수정하고 싶은 사원의 사번을 입력하세요.");
		int empNo = scanner.nextInt();
		
		Employee employee = searchEmp(empNo);
		
		if(employee == null) {
			System.out.println("해당 사원이 없습니다.");
			return;
		}
		
		System.out.print("사원의 수정하고 싶은 필드 선택 [1. 연락처, 2. 나이, 3. 부서, 4. 직급 5. 수정 종료] :");
		
		
		
		boolean run = true;
		while(run) {
			int modiNo = scanner.nextInt();
			switch (modiNo) {
			case 1: 
				System.out.println("사원의 수정할 연락처를 입력하세요.");
				String phone = scanner.next();
				employee.setPhone(phone);
				System.out.println("수정 완료했습니다.");
				break;
			case 2: 
				System.out.println("사원의 수정할 나이를 입력하세요.");
				int age = scanner.nextInt();
				employee.setAge(age);
				System.out.println("수정 완료했습니다.");
				break;
			case 3:
				System.out.println("사원의 수정할 부서를 입력하세요.");
				String dept = scanner.next();
				employee.setDept(dept);
				System.out.println("수정 완료했습니다.");
				break;
			case 4:
				System.out.println("사원의 수정할 직급를 입력하세요.");
				String compRank = scanner.next();
				employee.setCompRank(compRank);
				System.out.println("수정 완료했습니다.");
				break;
			case 5:
				run = false;
				break;
		}
		}
	}
	
	private static void erase() {
		System.out.println("삭제하고 싶은 사원의 사번을 입력하세요.");
		int empNo = scanner.nextInt();
		
		Employee employee = searchEmp(empNo);
		
		if(employee == null) {
			System.out.println("해당 사원이 없습니다.");
			return;
		}
		
		aSet.remove(employee);
		System.out.println("삭제 완료되었습니다.");
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
			System.out.println("=======사원관리 프로그램============");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 검색");
			System.out.println("# 3. 사원정보 수정");
			System.out.println("# 4. 사원정보 삭제");
			System.out.println("# 5. 프로그램 종료");
			System.out.println("===============================");
			System.out.print("메뉴 입력 >>>");
			
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
		
		
		System.out.println("프로그램이 종료 되었습니다.");
	}
}
