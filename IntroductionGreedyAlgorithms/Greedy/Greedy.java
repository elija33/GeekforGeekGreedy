package IntroductionGreedyAlgorithms.Greedy;

import java.util.Arrays;

import javax.naming.ldap.ManageReferralControl;

public class Greedy {
    // Sort the array in decreasing order
    // creata a value and set it equal to 0
    // for loop to gos thought the arra
    // check if the the first array is equal to the given amount
    // - array[i] <= amount
    // creata a value and set it equal amount / array[i];
    // add the first value to the second value.

    public static int minCoins(int coins[], int amount) {
        Arrays.sort(coins);
        int reslt = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                int sum = (int) Math.floor(amount / coins[i]);

                reslt = reslt + sum;
                amount = amount - sum * coins[i];
            }
            if (amount == 0) {
                break;
            }
        }
        return reslt;
    }

    public static void main(String[] args) {
        int coins[] = { 5, 10, 2, 1 };
        int amount = 57;
        System.out.println(minCoins(coins, amount));
    }
}
