public class BinarySearch {

    public boolean binarySearch(int[] numbers, int element) {

        int first = 0;
        int last = numbers.length - 1;
        while (first <= last) {

            int middle = (first + last) / 2;;

            if (numbers[middle] == element) {

                return true;
            }
            else if(numbers[middle] < element) {

                first = middle + 1;

            }
            else {

                last = middle - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(bs.binarySearch(arr, 8));
    }
}
