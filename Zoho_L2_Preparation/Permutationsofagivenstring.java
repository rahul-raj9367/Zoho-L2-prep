/*

*/
import java.util.*;

class PermutationsString {
    private static void findPermutations(int index, char[] arr, List<String> ans) {
        if (index == arr.length) {
            ans.add(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            findPermutations(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }

    static void swap(int i, int j, char[] arr) {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        String str = "ABC";
        char[] arr = str.toCharArray();
        List<String> ans = new ArrayList<>();
        findPermutations(0, arr, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
