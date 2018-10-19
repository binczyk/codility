package PermMissingElem;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        } else if (A.length == 1) {
            if (A[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            integers.add(A[i]);
        }

        if (integers.iterator().next() != 1) {
            return 1;
        } else if (!integers.contains(integers.size() + 1)) {
            return integers.size() + 1;
        }

        for (Integer integer : integers) {
            if (!integers.contains(integer + 1)) {
                return integer + 1;
            }
        }

        return -1;
    }
}
