public class MinimumCoinSystem {

    public int change(int x, int[] coins) {

        int min = x;

        for (int coin: coins) {

            if (x - coin >= 0) {

                int c = change(x - coin, coins);
                if (min > c + 1) {
                    min = c + 1;
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int [] coins = {25, 10, 5, 1};

        MinimumCoinSystem minimumCoinSystem = new MinimumCoinSystem();

        System.out.println("The minimum number of coins is: " + minimumCoinSystem.change(32, coins));
    }
}
