public class GivenNumberReturnValueInWords {

    private String [] singleDigit = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","ten","eleven","twelve","thirteen", "fourteen", "fifteen","sixteen","seventeen","eighteen","nineteen"};
    private String [] doubleDigit = {"Twenty", "Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private String word = "";

    public String convertNumberToWord(int n) {

        if (n == 0) {
            word = "zero";
        }

        else if (n <= 19) {
            word = singleDigit[n-1];
        }

        else if (n <= 99) {

            word += doubleDigit[n / 10 - 2];
            n = n % 10;

            if (n != 0) {
                word += " " + singleDigit[n%10 -1];
            }
            else {

                word += "";
            }
        }

        else if (n < 1000) {

            word += singleDigit[n / 100 - 1] + " hundred ";
            n = n % 100;

            if (n == 0) {

                word += "";
            }
            else if (n <= 19) {

                word += "and " + singleDigit[n % 100 - 1];
            }

            else if (n <= 99) {

                word += "and " + doubleDigit[n / 10 - 2];
                n = n % 10;

                if (n != 0) {
                    word += " " + singleDigit[n%10 -1];
                }
                else {

                    word += "";
                }
            }
        }

        return word;
    }

    public static void main(String[] args) {

        GivenNumberReturnValueInWords givenNumberReturnValueInWords = new GivenNumberReturnValueInWords();
        System.out.println(givenNumberReturnValueInWords.convertNumberToWord(898));
    }
}
