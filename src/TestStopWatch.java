
public class TestStopWatch {

	public static void main(String[] args) {

		// int N = Integer.parseInt(args[0]);
		int N = 4000;
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = StdRandom.uniform(-1000000, 1000000);
		StopWatch timer = new StopWatch();
		int cnt = ThreeSum.count(a);
		double time = timer.elapsedTime();
		StdOut.println(cnt + " triples " + time);
	}

}
