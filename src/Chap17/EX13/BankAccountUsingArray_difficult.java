package Chap17.EX13;

import java.util.Scanner;

class Account{				// ���� ������ �����ϴ� ��ü. �߿��� �ʵ�, private(ĸ��ȭ), 			// DTO, VO <== ���������� �ʵ��� ���� �����ϰ� ����
							// ��ü�� �ʵ�����(X), ������(O), getter(O), setter(O)
	private String ano; 		// ���� ��ȣ
	private String owner; 		// ���� ��, �̸�
	private int balance; 		// �ݾ�
	
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
	
	// �迭�� ����ؼ� Account ��ü ��� // �ϳ� �迭 �ϳ� ��̸���Ʈ
	private static Account[] accountArray = new Account[100]; 		// �迭�� ��ü ����.
			// Account[] : �迭 Ÿ��, ����Ÿ��, �� �濡 ���� �������� ���� ��� �⺻������ NULL
			// �迭 ������ ��(index)�� ũ�⸦ ����, index = 0; length() <==
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// �ڵ� �ۼ� : 1. ���� ����. ��ĳ�ʷ� 1.���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		// �迭 ��ü(accountArray)�� ����.
		

		System.out.println("---------------------");
		System.out.println("���� ���� �Ϸ�");
		System.out.println("---------------------");
		System.out.println("1. ���¹�ȣ�� �Է��ϼ���.");
		String ano = scanner.next();
		System.out.println("2. �̸��� �Է��ϼ���.");
		String owner = scanner.next(); 	// ���� ��ȣ�� ��ǲ �޾Ƽ� ano ������ �Ҵ�
		System.out.println("3. �ʱ����� �ݾ��� �Է��ϼ���.");
		int balance = scanner.nextInt();
		System.out.println("�Է� �Ϸ�");
		
		// �� �ʵ��� ������ ����ڷκ��� �Ҵ�޾Ƽ� ��ü�� ���� �� ��ü�� �ʵ��� ���� ����
		Account newAccount = new Account(ano,owner,balance);
		
		// ��ü(newAccount)�� �迭�� ����(����ִ� �濡 ����) for ���� ����ؼ� null�� ���� ã�Ƽ� null�� ��� ��ü�� ����
		for(int i = 0; i < accountArray.length; i++) { 		// accountArray �迭 ���� 0 ~ 99���� ��ȸ
			if(accountArray[i] == null) { 	// �� ���� ���� null�� �ƴ� ��츸 ��ü ������ �����ͼ� ���.
				accountArray[i] = newAccount;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}
		
	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, �̸�, ���� �ݾ��� ���
		// �迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.println("���� ��ȣ : "+ account.getAno() + "// �������� �̸� : " + account.getOwner() + "// ���� �ݾ� : " + account.getBalance());
			}
		}
	}
	private static void deposit() {
		// �ڵ� �ۼ� : 3. ���� : <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ� : ��ǲ �޾Ƽ� ����
		// 1. ����ڷκ��� �Ա��� ���¸� �޾ƾ� �Ѵ�.
		// 2. ����ڷκ��� ���� ���� ��ȣ�� �迭�� ����� ��ü ���� ���� ��ȣ�� Ȯ�� �� �ش� ���¿� �Ա�
		System.out.println("������ ������ ���¹�ȣ�� �Է��ϼ���");
		String ano = scanner.next();
		
		// �ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano); 		// findAccount(���¹�ȣ)
		
		if(account == null) {
			System.out.println("�ش� ���°� �����ϴ�.");
			return; 		// �޼ҵ带 ���� ������ ����. �޼ҵ� ����
		}
		
		System.out.println("�Ա��� �ݾ��� ��������.");
		int balance = scanner.nextInt();
		
		account.setBalance(account.getBalance() + balance);  	// setter�� ����ؼ� ������ �ݾ� + �߰� �Ա� �ݾ�
		System.out.println("�Ա� �Ϸ�");
		System.out.println("���� �ݾ� : " + account.getBalance());
		
	}
	private static void withdraw() {
		// �ڵ� �ۼ� : 4. ��� : ���� ��ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���.
		System.out.println("����� ������ ���¹�ȣ�� �Է��ϼ���");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("�ش� ���°� �����ϴ�.");
			return;
		}
		
		System.out.println("����� �ݾ��� ��������.");
		int balance = scanner.nextInt();
		
		if(balance > account.getBalance()) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			account.setBalance(account.getBalance()-balance);
			System.out.println("��� �Ϸ�");
			System.out.println("���� �ݾ� : " + account.getBalance());
		}
	}
	
	// �迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	// ����, ����� �� �����ڵ�, ���� �޼ҵ忡�� �ߺ� ��� �� �� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�.
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) { 		// �迭���� ���� null�� �ƴ� ��쿡 ��ü�� ano[����] ��ȣ.
				// �� ��ü�� ���� ano�� ��� ���� ����
				String dbAno = accountArray[i].getAno(); 	// �迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�
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
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("--------------------------------------------------");
			System.out.print("����>>");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount(); 		// �޼ҵ� ȣ��, ��ü ���� ���� �޼ҵ������ ȣ��(static)
			} else if(selectNo == 2) {
				accountList(); 		// �޼ҵ� ȣ��
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
		System.out.println("���α׷� ����");
	}

}
