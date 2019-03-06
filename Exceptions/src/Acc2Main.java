
public class Acc2Main {

	/*********************
	 * Main method for 
	 * withdraw function
	 * 
	 *********************/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1;
		a1 = new Account("Marie",200,234543);
		
		try{
			a1.withdraw(900);
		}
		catch(InsufficientFunds e){
			System.out.println(e);
		}
		
		a1.Display();

	} //end main
	

}// end class
