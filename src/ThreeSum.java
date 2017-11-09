
public class ThreeSum {

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

	// return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k]
	// = 0
	public static int count(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						count++;
						// System.out.println("Matched "+a[i] +" + "+ a[j]+" +
						// "+ a[k]);
					}
				}
			}
		}
		return count;
	}

	public static int countExp(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (i < j && j < k) {
						if (a[i] + a[j] + a[k] == 0) {
							count++;
							// System.out.println("Matched "+a[i] +" + "+ a[j]+"
							// + "+ a[k]);
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		StopWatch timer = new StopWatch();


			int arrTest[] = In.readInts(args[0]);
			int answer = countExp(arrTest);
			System.out.println("Hilarious Algorithm :Time"+timer.elapsedTime());
			StopWatch timer2 = new StopWatch();
			int answer2 = count(arrTest);
			System.out.println("Old Algorithm Time:"+timer2.elapsedTime());
			


			StopWatch timer3 = new StopWatch();
			int answer3 =ThreeSumFaster.count(arrTest);
			System.out.println("LOg N Algorithm Time:"+timer3.elapsedTime());

			
			
	}
}