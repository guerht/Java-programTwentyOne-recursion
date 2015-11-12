// recursiveMath.java
public class recursiveMath {
	public static int factorial(int n) {
		if(n > 1) {
			n *= factorial(n-1);
		}
		return n;
	}
	public static int fibonacci(int n) {
		// start with 0+1 -> 1,
		// previous answer + 2nd level previous answer = 2
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		/*if(n == 0) {
			System.out.print("0, ");
		}*/
		// System.out.print(prev + ", " + next + ", "  );
	}
	public static void puf(int n) {
		if (n == 1) {
			System.out.print("x");
		}
		else if (n%2 == 0) {
			System.out.print("{");
			puf(n-1);
			System.out.print("}");
		}
		else {
			System.out.print("<");
			puf(n-1);
			System.out.print(">");
		}
	}
	/*public static int sal(int n) {
		if (n == 1) {
				return 10l
		}
		else if(n == 2) {
			return 100;
		}
		else if(n == 3) {
			return 200;
		}
		else {
			return (2*sal(n-1) + sal(n-2) +1);
		}
	}
	*/
	public static void elvis(int n) {
		if(n <= 3) {
			System.out.print(n + 1);
		}
		else {
			elvis(n-3);
			System.out.print(">>" + (n-1));
		}
	}
	public static void main(String args[]) {
		System.out.println(factorial(10));
		int fibnum = 5;
		int salnum = 5;
		/*for(int i = 0; i <= salnum; i++) {
			System.out.print(sal(i) + ", ");
		}*/
		System.out.println(fibonacci(10));
		puf(10);
		// sal(5);
		System.out.println();
		elvis(11);
	}
}
	