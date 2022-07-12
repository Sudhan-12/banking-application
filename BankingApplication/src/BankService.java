import java.util.*;
public class BankService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********WELCOME TO BANKING APPLICATION****************");
		Scanner scan=new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR NAME:");
		String c_name=scan.nextLine();
		System.out.println("ENTER YOUR CUSTOMER ID:");
		int c_id=scan.nextInt();
		Services c1=new Services(c_name,c_id);
		c1.showMenu();

	}

}
class Services{
	String c_name;
	int c_id;
	int balance;
	int rt;
	Services(String c_name,int c_id){
		this.c_name=c_name;
		this.c_id=c_id;
	}
	int balance() {
		return balance;
	}
	void deposit(int amt) {
		if(amt>0) {
			balance+=amt;
			rt=amt;
		}
		else {
			System.out.println("ENTER A VALID AMOUNT!!!");
		}
	}
	void withdraw(int amt) {
		if(amt<=balance) {
			balance-=amt;
			rt=-amt;
			System.out.printf("YOU HAVE WITHDRAWN %d FROMM YOUR ACCOUNT.PLEASE COLLECT YOUR CASH",amt);
			System.out.println();
		}
		else {
			System.out.println("INSUFFICIENT BALANCE IN YOUR ACCOUNT");
		}
	}
	void rTranscation() {
		if(rt>0) {
			System.out.println("YOUR RECENT DEPOSITED AMOUNT IS: "+rt);
		}
		else {
			System.out.println("YOUR RECENT WITHDRAWN AMOUNT IS: "+Math.abs(rt));
		}
	}
	void showMenu() {
		Scanner sc=new Scanner(System.in);
		char op='\0';
		System.out.println("WELCOME: "+c_name);
		System.out.println("YOUR CUSTOMER ID IS: "+c_id);
		System.out.println();
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit The System");
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("PLEASE ENTER YOUR OPTION: ");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			op=sc.next().charAt(0);
			System.out.println();
			if(op=='A') {
				System.out.println("-------------------------------------------------------");
				System.out.println("YOUR ACCOUNT BALANCE IS: "+this.balance());
				System.out.println("-------------------------------------------------------");
			}
			else if(op=='B') {
				System.out.println("-------------------------------------------------------");
				System.out.println("ENTER THE AMOUNT TO DEPOSIT:");
				System.out.println("-------------------------------------------------------");
				int amt=sc.nextInt();
				this.deposit(amt);
				System.out.printf("%d IS SUCCESSFULLY DEPOSITED!!!",amt);
				System.out.println();
			}
			else if(op=='C') {
				System.out.println("-------------------------------------------------------");
				System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
				System.out.println("-------------------------------------------------------");
				int amt1=sc.nextInt();
				this.withdraw(amt1);
			}
			else if(op=='D') {
				System.out.println("-------------------------------------------------------");
				this.rTranscation();
				System.out.println("-------------------------------------------------------");
			}
			else if(op=='E') {
				System.out.println("=========================================================================================================");
			}
			else {
				System.out.println("**********************INVALID OPTION!!!*************************8");
			}
			
		}while(op!='E');
		System.out.println("THANK YOU FOR USING OUR SERVICES!!! && HAVE A NICE DAY");
	}
}
