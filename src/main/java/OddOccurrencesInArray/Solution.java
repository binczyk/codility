package OddOccurrencesInArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] A) {
        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (integers.contains(A[i])) {
                integers.remove(A[i]);
            } else {
                integers.add(A[i]);
            }
        }
        return integers.iterator().next();
    }
}
