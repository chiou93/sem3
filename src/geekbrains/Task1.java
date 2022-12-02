package geekbrains;

import java.util.List;
import java.util.ArrayList;
public class Task1 {

    private static char[] arrGlobal;
    private static List<Integer> indexesGlobal;

    public static void main(String[] args) {
        Task1 ans = new Task1();

        String s = "2? + ?5 = 69".replaceAll(" ", "");
        char[] arr = s.toCharArray();

        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                indexes.add(i);
            }
        }

        arrGlobal = arr;
        indexesGlobal = indexes;

        System.out.println(arr);
        System.out.println(indexes);

    }

    List<List<Integer>> ans;

    public List<List<Integer>> combine(int k) {
        ans = new ArrayList<>();
        helper(new ArrayList<>(), k);
        return ans;
    }

    private void helper(List<Integer> comb, int k) {
        if (comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(comb, k);
            comb.remove(comb.size() - 1);
        }
    }
}