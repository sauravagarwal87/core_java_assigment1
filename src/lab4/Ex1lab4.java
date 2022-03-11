package lab4;

import javax.swing.AbstractCellEditor;

class Account{
	long accNum;
	double balance;
	Person accHolder;
	
	public Account(){
		
	}
	
	public Account(double balance, Person accHolder) {
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setPerson(Person accHolder) {
		this.accHolder = accHolder;
	}

	void deposite(double money) {
		balance = money + balance;
	}
	
	void withdraw(double money) {
		balance = balance - money;
		
	}
	double getBalance() {
		return balance;
	}
}

class SavingAccount extends Account{
	 final double MINIMUN_BALANCE = 500;
	 
	 @Override
	 void withdraw(double money) {
		 	balance = balance - money;	
			if(balance<MINIMUN_BALANCE) {
				 System.out.println("Warning!!!!");
				 balance = balance + money;
			}
	 }
}

//class CurrentAccount extends Account{
//	final int overdraft_limit = 5;
//	
//	boolean withdraw() {
//		
//		return;
//	}
//}

class Person{
	String name;
	float age;
	 public Person(String name, float age) {
		 this.name = name;
		 this.age = age;
	 }	
}

public class Ex1lab4 {

	public static void main(String[] args) {
		Person name = new Person("Smith",22);
		SavingAccount Smith = new SavingAccount();
		Smith.setPerson(name);
		Smith.setBalance(2000);
		Smith.deposite(2000);
		System.out.println("Smith balnce : "+Smith.getBalance());
		//System.out.println();
		
		Person name2 = new Person("Kathy",22);
		SavingAccount Kathy = new SavingAccount();
		Kathy.setPerson(name2);
		Kathy.setBalance(3000);
		System.out.println("Kathy balance:"+Kathy.getBalance());
		Kathy.withdraw(2000);
		System.out.println("Kathy balance after withdraw:"+Kathy.getBalance());
	}
}
