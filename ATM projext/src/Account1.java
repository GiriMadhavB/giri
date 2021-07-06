import java.text.DecimalFormat;
import java.util.Scanner;

public class Account1 {
 
	  private int customerNumber;
	  private int pinNumber;
	  private double checkingBalance=0;
	  private double savingBalance=0;
	  
	  Scanner input=new Scanner(System.in);
	  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00"); 
	  
	  public int setCustomerNumber(int customerNumber) {
		  this.customerNumber = customerNumber;
		  return customerNumber;
	  }
	  public int getCustomerNumber() {
		  return customerNumber;
	  }
	  
	  public int setPinNumber(int pinNumber) {
		  this.pinNumber = pinNumber;
		  return pinNumber;
	  }
	 
	  public int getPinNumber() {
		  return pinNumber;
	  }
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance-amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance-amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposite(double amount) {
		checkingBalance = (checkingBalance+amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposite(double amount) {
		savingBalance = (savingBalance+amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("checking account balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking Account:");
		double amount =input.nextDouble();
		
		if((checkingBalance - amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("new checking Account balance: "+moneyFormat.format(checkingBalance));
		} else {
			System.out.println("balance cannot be nagative. "+"\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("saving account balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving Account:");
		double amount =input.nextDouble();
		
		if((savingBalance - amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("new checking Account balance: "+moneyFormat.format(savingBalance));
		} else {
			System.out.println("balance cannot be nagative. "+"\n");
		}
	}
	
	public void getCheckingDepositeInput() {
		System.out.println("checking account balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposite from checking Account:");
		double amount =input.nextDouble();
		
		if((checkingBalance + amount)>=0) {
			calcCheckingDeposite(amount);
			System.out.println("new checking Account balance: "+moneyFormat.format(checkingBalance));
		} else {
			System.out.println("balance cannot be nagative. "+"\n");
		}
	}
	
	public void getSavingDepositeInput() {
		System.out.println("checking account balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposite from saving Account:");
		double amount =input.nextDouble();
		
		if((savingBalance + amount)>=0) {
			calcSavingDeposite(amount);
			System.out.println("new checking Account balance: "+moneyFormat.format(savingBalance));
		} else {
			System.out.println("balance cannot be nagative. "+"\n");
		}
	}
}
