package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class SubsetsBacktracking {

    public static List<List<Integer>> subsets(int[] nums, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(
            int[] nums,
            int n,
            int start,
            List<Integer> current,
            List<List<Integer>> result
    ) {
        // condição de parada (solução válida)
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        // tenta adicionar próximos elementos
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);              // escolhe
            backtrack(nums, n, i + 1, current, result); // explora
            current.remove(current.size() - 1); // desfaz (backtracking)
        }
    }

    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;

        List<List<Integer>> result = subsets(S, n);
        System.out.println(result);
    }
}