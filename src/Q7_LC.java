public class Q7_LC {
    public static void main(String[] args) {
        class Solution {
            public int arrangeCoins(int n) {
                int a = n;
                int b = 0;
                for (int i = 0; i <= n; i++) {
                    a = a - i;
                    if (a > i) {

                    } else if (a <= i) {
                        b = i;
                        break;
                    }

                }
                return b;
            }
        }
    }
}
