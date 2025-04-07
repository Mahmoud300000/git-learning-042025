package Com.git.learning;

public class Calculoter {

	public int add (int x , int y) {
		return x + y;
	}
	
	public int divid(int x , int y) {
		
		int result =0 
		if (y ! = 0) {
			result = x / y ;
		}else{
			throw new Exception(" you cannot divide number by Zero. ")
		}
	}
	
}
