import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(k, n,1, resultList, new ArrayList<>());
        return resultList;
    }
    public void backtrack (int k, int target, int i, List<List<Integer>> resultList, List<Integer> currentList){
        if(target == 0 && k == 0){
            resultList.add(new ArrayList<>(currentList));
        }
        if( k <= 0){
            return;
        }
        if (target < 0) {
            return;
        }
        if (i == 10) {
            return;
        }

        currentList.add(i);
        backtrack(k - 1, target - i, i + 1, resultList, currentList);
        currentList.remove(currentList.size() - 1);
        backtrack(k, target, i + 1, resultList, currentList);



    }
}