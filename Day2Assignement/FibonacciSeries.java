package Day2Assignement;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int a=0;
		int b=1;
		int c;
		System.out.print("Fibonacci Series:" +a +"," +b);
		
		for (int i = 3; i <=range; i++) {
			//a=1,b=1
			c=a+b;
			//c=2
			System.out.print("," +c);
			a=b;
			//a's new value=1
			b=c;
			//b's new value=2
			
		}
		

	}

}



