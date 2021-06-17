package triangles;

import java.util.Scanner;

/**
 * 
 * Input data: First line will contain number of triplets. Other lines will
 * contain triplets themselves (each in separate line). Answer: You should
 * output 1 or 0 for each triplet (1 if triangle could be built and 0
 * otherwise).
 * 
 * data:
 * 2
 * 3 4 5
 * 1 2 4
 * 
 * answer: 1 0
 *
 */

public class Triangles {

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
			int check = 1;
			if (ar[0] + ar[1] < ar[2]) {
				check = 0;
			}

			if (ar[1] + ar[2] < ar[0]) {
				check = 0;
			}

			if (ar[0] + ar[2] < ar[1]) {
				check = 0;
			}

			System.out.print(check + " ");
		}
	}

}
