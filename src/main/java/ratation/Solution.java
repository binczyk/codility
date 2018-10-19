package ratation;

public class Solution {

    public int[] solution(int[] A, int K) {
        int lastIndex = A.length - 1;
        if (lastIndex > 0) {
            int moveBy = K % A.length;
            int tmp;
            for (int i = 0; i < moveBy; i++) {
                tmp = A[lastIndex];
                for (int j = lastIndex - 1; j >= 0; j--) {
                    A[j + 1] = A[j];
                }
                A[0] = tmp;
            }
        }

        return A;
    }
}
