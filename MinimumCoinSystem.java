public class MinimumCoinSystem {

    public int test(int value, int[] coins){
        int min = 1;
        for(int coin: coins){
            if(value >= coin) {
                return min + test(value-coin,coins);
            }
        }
        return min-1;
    }

    public static void main(String[] args) {

        int [] coins = {25, 10, 5, 1};

        MinimumCoinSystem minimumCoinSystem = new MinimumCoinSystem();

        System.out.println("The minimum number of coins is: " + minimumCoinSystem.test(50, coins));
    }
}
