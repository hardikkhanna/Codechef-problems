package codechef.long_challenge.march;

import java.util.Scanner;

public class ChefAndGroups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String seats = sc.next();
			int number = findNumberOfGroups(seats);
			System.out.println(number);
		}
		sc.close();
	}

	private static int findNumberOfGroups(String seats) {
		int count = 0;
		for (int i = 0; i < seats.length(); i++) {
			if (seats.charAt(i) == '1') {
				int j;
				count++;
				for (j = i + 1; j < seats.length(); j++) {
					if (seats.charAt(j) == '0')
						break;
				}
				i = j;
			}
		}
		return count;
	}

}
