/*Find the number of 1s in the binary representation of a number */

public class NumberOfOnes {

    public int ones(int x) {

        int sum = 0;

        while (x > 0) {

            sum += x & 1;
            x >>= 1;
        }
        return sum;
    }

    public static void main(String[] args) {

        NumberOfOnes numberOfOnes = new NumberOfOnes();

        System.out.println(numberOfOnes.ones(6));
    }
}
