/* Output numbers from 1 to x. if the number is divisible by 3, replace it with "Fizz"
   if the number is divisible by 5 replace the number with "Buzz". If the number is divisible by
    5 and 3, return "FizzBuzz"*/

public class FizzBuzz {

    public void fizzBuzz(int x) {

        for (int i = 1; i <= x; i++) {

            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {

        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(15);
    }
}
