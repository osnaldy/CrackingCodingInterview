public class Permutation {

    public boolean checkPermuatation(String s1, String s2) {

        String copy1 = s1.replaceAll("\\s", "").toLowerCase();
        String copy2 = s2.replaceAll("\\s", "").toLowerCase();

        char [] sc1 = copy1.toCharArray();
        char [] sc2 = copy2.toCharArray();

        int count = 0;

        for (int i = 0; i < sc1.length; i++) {

            for (int j = 0; j < sc2.length; j++) {

                if (sc1[i] == sc2[j]) {
                    sc1[i] = ' ';
                    count ++;
                }
            }
        }
        return count == sc1.length;
    }

    public static void main(String[] args) {

        String s1 = "nag a ram";
        String s2 = "anaGram";

        Permutation permutation = new Permutation();

        System.out.println(permutation.checkPermuatation(s1, s2));
    }
}
