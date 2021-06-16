package sumOfDigits;

import java.util.Scanner;

public class SumOfDigits {

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
		for (int[] arr : array) {
			char[] m = null;
			m = Integer.toString(arr[0] * arr[1] + arr[2]).toCharArray();
			int summ = 0;
			for (char m1 : m) {
				summ = summ + Character.getNumericValue(m1);
			}
			System.out.print(summ + " ");

		}

	}

}
