package codechef.long_challenge.march;

import java.util.Scanner;

public class InterestingXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int num = sc.nextInt();
			int max = findMaxProduct(num);
			System.out.println(max);
		}

		sc.close();
	}

	private static int findMaxProduct(int n) {
		int max = Integer.MIN_VALUE;
		for (int i = (int) Math.sqrt(n); i <= n; i++) {
			int xor = i ^ n;
			if (max < (xor * i)) {
				max = xor * i;
			}
		}
		return max;
	}

}
