package Chap17.EX13;

import java.util.Scanner;

class Account{				// 계좌 정보를 저장하는 객체. 중요한 필드, private(캡슐화), 			// DTO, VO <== 각계층으로 필드의 값을 저장하고 전달
							// 객체명 필드접근(X), 생성자(O), getter(O), setter(O)
	private String ano; 		// 계좌 번호
	private String owner; 		// 계좌 주, 이름
	private int balance; 		// 금액
	
	public Account (String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

public class BankAccountUsingArray_difficult {
	
	// 배열을 사용해서 Account 객체 등록 // 하나 배열 하나 어레이리스트
	private static Account[] accountArray = new Account[100]; 		// 배열에 객체 저장.
			// Account[] : 배열 타입, 참조타입, 각 방에 값이 존재하지 않을 경우 기본값으로 NULL
			// 배열 생성시 방(index)의 크기를 선언, index = 0; length() <==
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// 코드 작성 : 1. 계좌 생성. 스캐너로 1.계좌번호, 2. 이름, 3. 초기통장 금액
		// 배열 객체(accountArray)에 저장.
		

		System.out.println("---------------------");
		System.out.println("계좌 생성 완료");
		System.out.println("---------------------");
		System.out.println("1. 계좌번호를 입력하세요.");
		String ano = scanner.next();
		System.out.println("2. 이름을 입력하세요.");
		String owner = scanner.next(); 	// 계좌 번호를 인풋 받아서 ano 변수에 할당
		System.out.println("3. 초기통장 금액을 입력하세요.");
		int balance = scanner.nextInt();
		System.out.println("입력 완료");
		
		// 각 필드의 정보를 사용자로부터 할당받아서 객체를 생성 후 객체에 필드의 값을 저장
		Account newAccount = new Account(ano,owner,balance);
		
		// 객체(newAccount)를 배열에 저장(비어있는 방에 저장) for 문을 사용해서 null인 방을 찾아서 null인 경우 객체를 저장
		for(int i = 0; i < accountArray.length; i++) { 		// accountArray 배열 방을 0 ~ 99까지 순회
			if(accountArray[i] == null) { 	// 각 방의 값이 null이 아닐 경우만 객체 정보를 가져와서 출력.
				accountArray[i] = newAccount;
				System.out.println("게좌가 생성되었습니다.");
				break;
			}
		}
		
	}
		
	
	private static void accountList() {
		// 코드 작성 : 2. 계좌 목록 출력 : 배열에 저장된 객체를 가져와서 계좌번호, 계좌주, 이름, 통장 금액을 출력
		// 배열의 각 방을 순회하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.println("계좌 번호 : "+ account.getAno() + "// 계좌주의 이름 : " + account.getOwner() + "// 통장 금액 : " + account.getBalance());
			}
		}
	}
	private static void deposit() {
		// 코드 작성 : 3. 예금 : <== 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금금액 : 인풋 받아서 저장
		// 1. 사용자로부터 입금할 계좌를 받아야 한다.
		// 2. 사용자로부터 받은 계좌 번호를 배열에 저장된 객체 내의 계좌 번호를 확인 후 해당 계좌에 입금
		System.out.println("예금할 계좌의 계좌번호를 입력하세요");
		String ano = scanner.next();
		
		// 해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다.
		Account account = findAccount(ano); 		// findAccount(계좌번호)
		
		if(account == null) {
			System.out.println("해당 계좌가 없습니다.");
			return; 		// 메소드를 빠져 나오기 위함. 메소드 종료
		}
		
		System.out.println("입금할 금액을 넣으세요.");
		int balance = scanner.nextInt();
		
		account.setBalance(account.getBalance() + balance);  	// setter를 사용해서 기존의 금액 + 추가 입금 금액
		System.out.println("입금 완료");
		System.out.println("현재 금액 : " + account.getBalance());
		
	}
	private static void withdraw() {
		// 코드 작성 : 4. 출금 : 계좌 번호를 인풋 받아 해당 계좌를 객체에서 찾아서 출금.
		System.out.println("출금할 계좌의 계좌번호를 입력하세요");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("해당 계좌가 없습니다.");
			return;
		}
		
		System.out.println("출금할 금액을 넣으세요.");
		int balance = scanner.nextInt();
		
		if(balance > account.getBalance()) {
			System.out.println("잔액이 부족합니다.");
		} else {
			account.setBalance(account.getBalance()-balance);
			System.out.println("출금 완료");
			System.out.println("현재 금액 : " + account.getBalance());
		}
	}
	
	// 배열에서 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
	// 예금, 출금할 때 공통코드, 여러 메소드에서 중복 사용 될 때 별도의 메소드를 생성해서 중복코드를 간단하게 만들어 준다.
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) { 		// 배열방의 값이 null이 아닐 경우에 객체의 ano[계좌] 번호.
				// 각 객체의 방의 ano를 담는 변수 선언
				String dbAno = accountArray[i].getAno(); 	// 배열의 각 방에 저장된 객체의 ano를 dbAno 변수에 할당
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	

	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>>");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount(); 		// 메소드 호출, 객체 생성 없이 메소드명으로 호출(static)
			} else if(selectNo == 2) {
				accountList(); 		// 메소드 호출
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}

}
