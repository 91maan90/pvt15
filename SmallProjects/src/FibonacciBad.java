// TEST 2
public class FibonacciBad {
	// I was too lazy/stupid too create a main class so I call this class from GuessingGame...
	
	// Recursive way to calculate Fibonacci numbers. It's bad. Integer overflow at 57th number.
	public int fibo(int i) {
			if (i == 0) return 0;
			else if (i == 1) return 1;
			else return fibo(i-1) + fibo(i-2);
			
	}
}
