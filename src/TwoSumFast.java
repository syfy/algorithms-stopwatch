import java.util.Arrays;

public class TwoSumFast {

	// print distinct pairs (i, j) such that a[i] + a[j] = 0
	public static void printAll(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] + a[j] == 0) {
					StdOut.println(a[i] + " " + a[j]);
				}
			}
		}
	}

	// return number of distinct pairs (i, j) such that a[i] + a[j] = 0
	public static int count(int[] a) {
		Arrays.sort(a);
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
		//	for (int j = i + 1; j < n; j++) {
			//	if (a[i] + a[j] == 0) {
			//		count++;
			//	}
				if(BinarySearch.rank(-a[i], a)>i){
					count++;
				}
				
			//}
		}
		return count;
	}

	public static void main(String[] args) {

	
		StopWatch timer = new StopWatch();
		int count = Integer.MAX_VALUE;
		StdOut.println("elapsed time = " + timer.elapsedTimeInMillis());
		StdOut.println(count);
	}
}
