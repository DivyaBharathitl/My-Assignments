package Day2Assignement;

public class IsPrimeNew {
	
	public static void main(String[] args) {
		int num=9;
		boolean P=true;
		
		for (int i = 2; i <= num-1; i++) {
			
		if (num%i==0) {
			P=false;
			break;
			
		} 
		}
		
		if (P==true) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not prime");
		}
			
		}
	}


