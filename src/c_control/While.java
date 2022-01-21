package c_control;

public class While {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while( true ){
			sum += n;
			if ( n++   ==  10 ) break;
			}
			System.out.println("SUM = " + sum );

	}

}
