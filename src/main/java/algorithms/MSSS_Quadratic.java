package algorithms;
public class MSSS_Quadratic {

	public static int msssQuadratic(int[] a) {
		int n = a.length;
		int maxSum = 0;
		for (int i = 0; i < n; i++) {
			int thisSum = 0;
			for (int j = i; j < n; j++) {
				thisSum += a[j];
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
	}

}
