package arithmeticProgression;

import java.util.Scanner;

/**
 * 
 * Input data: first line contains the number of test-cases. Other lines contain
 * test-cases in form of triplets of values A B N where A is the first value of
 * the sequence, B is the step size and N is the number of first values which
 * should be accounted.
 * 
 * Answer: you are to output results (sums of N first members) for each
 * sequence, separated by spaces.
 *
 * data:
 * 2
 * 5 2 3
 * 3 0 10
 *
 * answer: 21 30
 *
 */
public class ArithmeticProgression {

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
			int summ = 0;
			for(int i = 0; i < ar[2]; i++) {
				summ += ar[0] + i * ar[1]; 
			}
			System.out.print(summ + " ");
		}
		

	}

}
