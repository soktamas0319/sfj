package coin_challange;

import com.sun.javafx.css.CalculatedValue;

/**
 *
 * @author st
 */
public class Coin_challange {

    public static void main(String[] args) {
        int[] coins = {1, 2};
        int totalAmount = 4;

        System.out.println(calculateCombo(coins, totalAmount, 0));

    }

    public static int calculateCombo(int[] coins, int amount, int currentIndex) {
        int countRightCombo = 0;
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        for (int i = currentIndex; i < coins.length; i++) {
            countRightCombo += calculateCombo(coins, amount - coins[i], i);
        }
        return countRightCombo;
    }

}
