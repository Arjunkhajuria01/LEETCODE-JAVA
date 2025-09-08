public class Q3_LC {
    public int[] plusOne(int[] digits) {

        for (int i = 0; i <= digits.length - 1; i++) {
            if (i == digits.length - 1) {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
            } else if (digits[i] == 9) {
                digits[digits.length - 1] = 0;
                digits[digits.length - 2] = 1;
            }


        }
        return digits;
    }
}
