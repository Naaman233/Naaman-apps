

@SuppressWarnings("serial")
public class InsufficientFunds extends Exception {
	
	
	/********************
	 * Exception message 
	 * for account class
	 * 
	 ********************/
	private String msg = "Sorry, You have insufficient funds"
			+ " to complete this Transaction";
	
	public String toString(){
		return msg;
	}
	
	public void Display(){
		System.out.println(msg);
	}
			

} // end class 
