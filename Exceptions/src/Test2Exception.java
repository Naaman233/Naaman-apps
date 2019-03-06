
public class Test2Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myArr [] = new int[10];
		int x,y,z;
		x = 0;
		y = 10;
	
		
		try {
			z = y/x;
			System.out.println(z);
		}
		catch(ArithmeticException e){
			System.out.println("Error");
			System.out.println(e);
			System.out.println("Please Select a Number greater than Zero");
		}
		myArr[9] = 0;

	}

}
