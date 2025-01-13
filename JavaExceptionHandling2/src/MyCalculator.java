
public class MyCalculator {
	public long power(int n, int p) throws Exception {
		if (n < -10 || n > 10 || p < -10 || p > 10) {
			throw new Exception("n and p should be in the range of -10 to 10.");
		}
		
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		}
		if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		
		return (long) Math.pow(n, p);
		
	}
	
	}
