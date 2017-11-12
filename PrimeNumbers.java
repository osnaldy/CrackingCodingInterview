public class PrimeNumbers {

    public void primeNumber(int n){

        String word = "";

        for (int i = 2; i <= n; i++){

            int count = 0;

            for (int j = i; j >= 1; j--){

                if (i % j == 0){

                    count = count + 1;
                }
            }

            if (count == 2){

                word = word + i + " ";
            }
        }

        System.out.println(word);
    }

    public static void main(String[] args) {


        PrimeNumbers primeNumbers = new PrimeNumbers();

        primeNumbers.primeNumber(20);
    }

}
