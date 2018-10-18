public class Solution {

    public int solution(int N) {
        String binaryN = Integer.toBinaryString(N);
        if (!binaryN.contains("0")) {
            return 0;
        }

        return findMaxGap(binaryN);
    }

    private int findMaxGap(String binaryN) {
        int start = binaryN.indexOf("1");
        int next = binaryN.substring(start + 1).indexOf("1") + 1;
        int maxGap;
        int newGap;

        if (start == next) {
            return 0;
        }

        String newString = binaryN.substring(start + 1, next);
        newGap = newString.length();
        maxGap = findMaxGap(binaryN.substring(next));

        if (newGap > maxGap) {
            maxGap = newGap;
        }

        return maxGap;
    }
}
