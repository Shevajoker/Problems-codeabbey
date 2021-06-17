package medianOfThree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Input data will contain in the first line the number of triplets to follow.
 * Next lines will contain one triplet each. Answer should contain selected
 * medians of triplets, separated by spaces.
 * 
 * data:
 * 3
 * 7 3 5
 * 15 20 40
 * 300 550 137
 * 
 * answer: 5 20 300
 *
 */
public class MedianOfThree {

	public static void main(String[] args) {

		System.out.println("input data:");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] array = new int[n][3];

		for (int i = 0; i < n; i++) {
			array[i][0] = in.nextInt();
			array[i][1] = in.nextInt();
			array[i][2] = in.nextInt();
		}
		System.out.println();
		
		for (int[] ar : array) {
			Arrays.sort(ar);
			System.out.print(ar[1] + " ");
		}
		
	}
}
