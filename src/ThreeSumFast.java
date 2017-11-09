import java.util.Arrays;

public class ThreeSumFast {

	public static void main(String[] args) {

		int[] a = { 2, -2, 0, 3, 1234567891, Integer.MAX_VALUE };
		Arrays.sort(a);
		;
		StopWatch timer = new StopWatch();
		int count = count(a);
		StdOut.println("elapsed time = " + timer.elapsedTime());
		StdOut.println(count);
	}

	// print distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
	public static void printAll(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						StdOut.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
	}

	public static int indexOf(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	// return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k]
	// = 0
	public static int count(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (BinarySearch.rank(-a[i] - a[j], a) > j) {

					count++;
				}
			}
		}
		return count;
	}

}
