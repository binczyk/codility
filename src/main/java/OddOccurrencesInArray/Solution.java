package OddOccurrencesInArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {
        Map<Integer, Integer> integers = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (integers.containsKey(A[i])) {
                integers.remove(A[i]);
            } else {
                integers.put(A[i], A[i]);
            }
        }
        return integers.values().iterator().next();
    }
}
