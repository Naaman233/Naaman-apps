/*************************************
 * A simple overview on an application                               
 * designed to implement few banking
 * functions. 
 *************************************
 
 
 
public class Account {
	
	public String Owner;
	public double Balance;
	public int AcctNo;
	
	/************************
	 * Constructor taking
	 * three arguments
	 * @ author Makafui Naaman
	 ***********************/
	public Account(String Owner,double Balance,int AcctNo) {
		this.Owner = Owner;
		this.Balance = Balance;
		this.AcctNo = AcctNo;
		
		
	}
	/***********************
	 * Constructor taking
	 * zero arguments
	 * 
	 *********************/
	public Account(){ 
		this.Owner = "Default Name ";
		this.Balance = 0;
		this.AcctNo = 0;
		
	}
	public void getBalance(){
		System.out.println("Your balance is " + this.Balance);
		
	}
	public void setBalance(int b){
		this.Balance = b; 
		
	}
	public void deposit(double amount){
		this.Balance = this.Balance + amount;
		
	}
	
	public void withdraw(double amount) throws InsufficientFunds{
		try{
			if(amount > Balance){
				throw new InsufficientFunds();
			}
			else {
				Balance -= amount;
			}
		}
		catch(InsufficientFunds e){
			System.out.println(e);
			e.Display();
			
		}
		
	}
	public void Display(){
		System.out.println("************************************");
		System.out.println("Owner: " + this.Owner);
		System.out.println("Balance: " +this.Balance);
		System.out.println("Account No#: " + this.AcctNo);
		System.out.println("************************************");
	}
	
	
}
