package bodyMassIndex;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Input data contain number of people in the first line. Other lines will
 * contain two values each - weight in kilograms and height in metres. Answer
 * should contain words under, normal, over, obese for each corresponding
 * test-case, separated with spaces.
 * 
 * input data:
 * 3
 * 80 1.73
 * 55 1.58
 * 49 1.91
 * 
 * answer: over normal under
 *
 */
public class BodyMassIndex {

	public static void main(String[] args) {
		System.out.println("input data:");

		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		int n = in.nextInt();
		double[][] array = new double[n][2];
		double bmi = 0;

		for (int i = 0; i < n; i++) {
			array[i][0] = in.nextDouble();
			array[i][1] = in.nextDouble();
		}
		System.out.println();

		for (double[] ar : array) {
			bmi = 0;
			bmi = ar[0] / (ar[1] * ar[1]);

			if (bmi < 18.5) {
				System.out.print("under ");
			}

			if (bmi >= 18.5 && bmi < 25) {
				System.out.print("normal ");
			}

			if (bmi >= 25 && bmi < 30) {
				System.out.print("over ");
			}

			if (bmi >= 30) {
				System.out.print("obese ");
			}
		}

	}

}
