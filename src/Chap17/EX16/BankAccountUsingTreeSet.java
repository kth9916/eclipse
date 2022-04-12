package Chap17.EX16;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// Account ��ü�� TreeSet�� ����. ano[���� ��ȣ],  owner[�̸�], balance[���� �ݾ�]
// TreeSet�� �Ϲݰ�ü�� ���� �� � �÷��� ���������� ����. Comparable<E>, Comparator<E>
// Account ��ü�� �������� �ʰ� balance ���� ū �ͺ��� ��µǵ��� ���� <��������>



public class BankAccountUsingTreeSet {

	private static TreeSet<Account> tSet = new TreeSet<Account>();		
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {

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
		tSet.add(newAccount);
		System.out.println("���� ���� �Ϸ�");
		
	}
		
	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, �̸�, ���� �ݾ��� ���
		// �迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���
		Iterator<Account> ir = tSet.iterator();
		while(ir.hasNext()) {
			Account account = ir.next();
			if(account != null) {
				System.out.println(account.getAno() + "   " + account.getOwner() + "   " + account.getBalance() );
			}
		}
		
	}
	private static void deposit() {
		// �ڵ� �ۼ� : 3. ���� : <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ� : ��ǲ �޾Ƽ� ����
		// 1. ����ڷκ��� �Ա��� ���¸� �޾ƾ� �Ѵ�.
		// 2. ����ڷκ��� ���� ���� ��ȣ�� �迭�� ����� ��ü ���� ���� ��ȣ�� Ȯ�� �� �ش� ���¿� �Ա�
		System.out.println("������ ������ ���¹�ȣ�� �Է��ϼ���");
		String ano = scanner.next();
		
		System.out.println("�Ա��� �ݾ��� ��������.");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}

		
		account.setBalance(account.getBalance() + balance);  	// setter�� ����ؼ� ������ �ݾ� + �߰� �Ա� �ݾ�
		System.out.println("�Ա� �Ϸ�");
		System.out.println("���� �ݾ� : " + account.getBalance());
/*	
 * ���� ���� -- > �ߵ�	
		Iterator<Account> iterator1 = tSet.iterator();
		while(iterator1.hasNext()) {
			Account account = iterator1.next();
			String dbAno = account.getAno();
			
			if(dbAno.equals(ano)) {
				account.setBalance(account.getBalance() + balance);
				System.out.println("�Ա� �Ϸ�");
				System.out.println(account.getOwner() + "�� ���� �ݾ� : " + account.getBalance());
				return true;
			}
			
		}
		System.out.println("�ش� ���°� �����ϴ�.");
		return false;	
 * 
 */
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

		// ���� ���� --> �ߵ�
//		System.out.println("����� ������ ���¹�ȣ�� �Է��ϼ���");
//		String ano = scanner.next();
//		
//		System.out.println("����� �ݾ��� ��������.");
//		int balance = scanner.nextInt();
//		
//		Iterator<Account> iterator1 = tSet.iterator();
//		while(iterator1.hasNext()) {
//			Account account = iterator1.next();
//			String dbAno = account.getAno();
//			
//			if(dbAno.equals(ano)) {
//				account.setBalance(account.getBalance() - balance);
//				System.out.println("�Ա� �Ϸ�");
//				System.out.println(account.getOwner() +"�� ���� �ݾ� : " + account.getBalance());
//				return true;
//			}
//			
//		}
//		System.out.println("�ش� ���°� �����ϴ�.");
//		return false;	
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		Iterator<Account> ir = tSet.iterator(); 	// Iterator �ڿ� <Account>�� �־�� �Ѵٴ� ���� ����
		while(ir.hasNext()) {
			Account a1 = ir.next();
			String dbAno = a1.getAno();
			if(dbAno.equals(ano)) {
				account = a1;
				return account;
			}
		}
		return account;
	}
	
	// �迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	// ����, ����� �� �����ڵ�, ���� �޼ҵ忡�� �ߺ� ��� �� �� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�
	
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
