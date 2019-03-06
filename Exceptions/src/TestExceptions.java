
public class TestExceptions {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  myArr [] =new  int[10];
		int x,y,z;
		
		x = 0;
		y = 10;
		if (x != 0){
			z = y/x;
			System.out.println(z);
			
		}
		else{
			System.out.println("Error, can't devide by zero");
		}
		
		myArr[9] = 0;

	}

}
