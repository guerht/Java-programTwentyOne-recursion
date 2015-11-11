// recursiveMath.java
public class recursiveMath {
	public static int factorial(int n) {
		if(n > 1) {
			n *= factorial(n-1);
		}
		return n;
	}
	public static void fibonacci(int n) {
		// start with 0+1 -> 1,
		// previous answer + 2nd level previous answer = 2
		int prev = 0;
		int next = 1;
		int result = 0;
		/*if(n == 0) {
			System.out.print("0, ");
		}*/
		// System.out.print(prev + ", " + next + ", "  );
		if(n > 0) {
			result = prev + next;
			System.out.print(result + ", ");
			fibonacci(result);
		}
		else {
			System.out.print("1, ");
		}
	}
	public static void main(String args[]) {
		System.out.println(factorial(10));
		fibonacci(10);
	}
}
	