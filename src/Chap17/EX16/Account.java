package Chap17.EX16;

import java.util.Objects;

public class Account implements Comparable<Account> {
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
	@Override
	public String toString() {
	return "계좌번호는 " + ano + " / 계좌주의 이름은 " + owner + " / 금액은 " + balance;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Account) {
	if(this.ano.equals(((Account)obj).ano)) {
	return true;	
	}
	}
	return false;
	}
	
	@Override
	public int hashCode() {
	return Objects.hash(ano);
	}
	@Override
	public int compareTo(Account o) {
		if(this.ano.charAt(0) < o.ano.charAt(0)){
			return 1;
		} else if(this.ano.charAt(0) == o.ano.charAt(0)) {
			return 0;
		} else {
			return -1;
		}
	}
}
