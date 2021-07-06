import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;

public class optionMenu1 extends Account1{
	
	Scanner menuInput=new Scanner (System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data =new HashMap<Integer,Integer>();
	
	public void getLogin()throws IOException{
		int x=1;
		do {
			try {
				data.put(952141,191904);
				data.put(989947,71976);
				
				System.out.println("welcome to ATM!");
				System.out.println("Enter your customer number:");
				setCustomerNumber(menuInput.nextInt());
				
				
				System.out.println("Enter your PIN number:");
				setPinNumber(menuInput.nextInt());
	
			} catch(Exception e) {
				System.out.println("\n"+"invalid character(s).only number."+"\n");
				x=2;
			}
			int cn=getCustomerNumber();
			int pn=getPinNumber();
			if(data.containsKey(cn)&&data.get(cn)==pn) {
				getAccountType();
			}else
				System.out.println("\n"+"wrong customer number or pin number"+"\n");
		} while(x==1);
	}
	public void getAccountType() {
		System.out.println("slect the account you want to access:");
		System.out.println("Type 1 - checking account ");
		System.out.println("Type 2 - savinging account ");
		System.out.println("Type 3 - Exit ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
		    System.out.println("thank you for using this ATM, bye.  \n");
			break;
		default:
			System.out.println("\n"+"Invalid choice."+"\n");
			break;
		}
	}
	public void getChecking() {
		System.out.println("checking account:");
		System.out.println("type 1 - view balance");
		System.out.println("type 2 - withdraw funds:");
		System.out.println("type 3 - deposite funds");
		System.out.println("type 4 - exist");
		
		int selection =menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("checking account balance : "+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositeInput();
			getAccountType();
			break;
		
		case 4:
			System.out.println("thank you for using this ATM, bye. ");
			break;
		
		default:
			System.out.println("\n"+"invalid choice."+"\n");
			getChecking();
			
		}
	}
	public void getSaving() {
	System.out.println("saving account:");
	System.out.println("type 1 - view balance");
	System.out.println("type 2 - withdraw funds:");
	System.out.println("type 3 - deposite funds");
	System.out.println("type 4 - exist");
	System.out.println("choic: ");
	
	int selection =menuInput.nextInt();
	
	switch (selection) {
	case 1:
		System.out.println("checking account balance : "+moneyFormat.format(getSavingBalance()));
		getAccountType();
		break;
		
	case 2:
		getSavingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getSavingDepositeInput();
		getAccountType();
		break;
	
	case 4:
		System.out.println("thank you for using this ATM, bye. ");
		break;
	
	default:
		System.out.println("\n"+"invalid choice."+"\n");
		getSaving();
		
	}
 }
	
}
