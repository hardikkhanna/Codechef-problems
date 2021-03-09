

import java.util.Scanner;

public class NoTimeToWait {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Number of time Zones
		int n = sc.nextInt();
		int[] arr = new int[n];
		int timeRequired = sc.nextInt();
		int hoursLeft = sc.nextInt();
		// Store the time zones
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		String canSolve = solveTheProblem(n, arr, timeRequired, hoursLeft);
		System.out.println(canSolve);
		sc.close();
	}

	private static String solveTheProblem(int n, int[] arr, int timeRequired, int hoursLeft) {
		for (int i = 0; i < n; i++) {
			if (timeRequired <= arr[i] + hoursLeft)
				return "YES";
		}
		return "NO";
	}

}
