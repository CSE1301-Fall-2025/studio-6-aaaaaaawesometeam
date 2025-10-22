package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
			// FIXME compute the geometric sum for the first n terms recursively
		//double sum = 0.0;
		if (n == 0){
			return 0;
		}
		return Math.pow(0.5, n) + geometricSum(n-1);
	}

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		StdDraw.circle(xCenter, yCenter, radius);
		// FIXME complete the recursive drawing
		if (radius>3*radiusMinimumDrawingThreshold){
			circlesUponCircles(xCenter+radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter+radius, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter-radius, radius/3, radiusMinimumDrawingThreshold);
		}
		else{ 
			return;
		}
		
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	/ */
	/*public static int[] toReversed(int[] array) {
		int[] newArray = new int[array.length];
			// FIXME create a helper method that can recursively reverse the given array
			if (array.length>0){
			return toReversedHelper(array, newArray, 0);
			}
			else {
				return newArray;
			}
	}
	public static int[] toReversedHelper(int[] array, int[]newArray , int index){
		newArray[index] = array[array.length-index-1];
		if (index == array.length-1){
			return newArray;
		}
		else{
		return toReversedHelper(array, newArray, index+1);
		}
	}*/
	public static int[] toReversed(int[] array) {
		// FIXME create a helper method that can recursively reverse the given array
		int[] newArray = new int[array.length];
		for (int i =0; i< array.length; i++) {
			newArray[i]=array[i];
		}
		return toReversedHelper(newArray, (array.length/2)-1);
		
	}
	public static int[] toReversedHelper(int[] array, int index){
		if (index == -1){
			return array;
		}
		int temp = array[index];
		array[index] = array[array.length - index-1];
		array[array.length - index-1] = temp;
		return toReversedHelper(array, index-1);
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			if (q == 0){
				return p;
			}
			return gcd(q,p%q);
		
	}


}