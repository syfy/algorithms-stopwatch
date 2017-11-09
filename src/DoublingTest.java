import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

public class DoublingTest {
	private static final int MAXIMUM_INTEGER = 1000000;
	public static final double OFFSET_X = 0.05;
	// This class should not be instantiated.
	private DoublingTest() {
	}

	/**
	 * Returns the amount of time to call {@code ThreeSum.count()} with
	 * <em>n</em> random 6-digit integers.
	 * 
	 * @param n
	 *            the number of integers
	 * @return amount of time (in seconds) to call {@code ThreeSum.count()} with
	 *         <em>n</em> random 6-digit integers
	 */
	
	
	
	
	static ArrayList<CustomPoint> points;
	
	private static void resizePoints(ArrayList<CustomPoint> points){
		for(CustomPoint point : points){
			point.setX(point.getX()*1/(points.size()/2));
			point.setY(point.getY()*1/(points.size()/2));
		}
		
	}
	private static void drawPlot(ArrayList<CustomPoint> points){
		
		StdDraw.clear();
		resizePoints(points);
		
		for(CustomPoint point : points){
			//StdDraw.point(0.1*n / 1000, OFFSET_X+(time/100));
			StdDraw.point(point.getX(),point.getY());
	
		}
		
	}
	
	
	
	public static double timeTrial(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = StdRandom.uniform(-MAXIMUM_INTEGER, MAXIMUM_INTEGER);
		}
		StopWatch timer = new StopWatch();
		ThreeSum.count(a);
		return timer.elapsedTime();
	}

	/**
	 * Prints table of running times to call {@code ThreeSum.count()} for arrays
	 * of size 250, 500, 1000, 2000, and so forth.
	 *
	 * @param args
	 *            the command-line arguments
	 */
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.BOOK_RED);
		StdDraw.setPenRadius(0.010);
		points =new  ArrayList<CustomPoint> ();
		
		for (int n = 1; true; n += n) {
			double time = timeTrial(n);
			StdOut.printf("%7d %7.1f\n", n, time);
			//StdDraw.point(0.1*n / 1000, OFFSET_X+(time/100)); // x= number // y = time
			System.out.println("Plot points: X: " + (0.1*n / 100) +" Y :" +(time/10));
		
			CustomPoint plotNewCoord=	new CustomPoint();
			plotNewCoord.setX( (0.1*n / 100));
			plotNewCoord.setY( (OFFSET_X+(time/10)));

			points.add(plotNewCoord);
			drawPlot(points);
		}

	
	}
}
