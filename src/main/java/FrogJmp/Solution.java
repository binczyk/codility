package FrogJmp;

public class Solution {
    public int solution(int X, int Y, int D) {

        int i1[] = {100_000, 500_000, 1_000_000, 5_000_000, 10_000_000, 50_000_000, 100_000_000, 100_000_000,
                    500_000_000, 1_000_000_000};

        float f1[] = {11, 121, 1331};

        float res;

        for (int i = 0; i < i1.length; i++) {
            for (int f = 0; f < f1.length; f++) {
                System.out.print(i1[i] + " / " + f1[f] + " = ");
                res = i1[i] / f1[f];
                System.out.println(res);
                if (f > 0) {

                    System.out.println(res * f1[f - 1]);
                }
            }
            System.out.println("----------------------------------");
        }

        return -1;
    }
}

