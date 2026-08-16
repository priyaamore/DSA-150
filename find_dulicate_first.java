import java.util.*;

public class Main {

    public static int findFirstDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int result = findFirstDuplicate(arr);

        System.out.println("First duplicate: " + result);
    }
}
