package lesson13;

public class Application {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        int[]arr = new int[]{1,2,3,4,5};
        arrays.reverseArray(arr);
        arrays.average(arr);

        String left = "abc";
        String right = "bcc";
        Anagram anagram = new Anagram();
        boolean result = anagram.check(left, right);

        System.out.println(result);
    }
}
