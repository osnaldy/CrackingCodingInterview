public class GetTheSumRecursively {

    public int pairSumSequence(int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += pairSum(i, i + 1);
        }

        return sum;
    }

    public int pairSum(int a, int b) {

        return a + b;
    }

    //another approach for sum using recursive calls

    public int sum(int n) {

        if (n <= 0) {
            return 0;
        }
        return n + (sum(n - 1));
    }

    public static void main(String[] args) {

        GetTheSumRecursively sum = new GetTheSumRecursively();
        System.out.println(sum.pairSumSequence(3));
        System.out.println(sum.sum(3));
    }
}
