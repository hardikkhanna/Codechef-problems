package codechef.long_challenge.march;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ATM {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int toWithdraw = sc.nextInt();
		double totalAmount = sc.nextDouble();
		double amountLeft = amountAfterWithdrawal(toWithdraw, totalAmount);
		System.out.println(BigDecimal.valueOf(amountLeft).setScale(2, RoundingMode.HALF_UP));
		sc.close();
	}

	private static double amountAfterWithdrawal(double toWithdraw, double totalAmount) {
		double leftAmount = totalAmount;

		if (toWithdraw <= 2000 && toWithdraw > 0 && toWithdraw % 5 == 0 && totalAmount > toWithdraw + 0.50) {
			leftAmount = totalAmount - toWithdraw - 0.50;
		}

		return leftAmount;
	}

}
