public class Q2_LC {
    public static void main(String[] args) {
        class Solution {
            public int removeElement(int[] nums, int val) {
                int k = 0;

                for ( int i = 0 ; i<= nums.length -1 ; i++){
                    if (nums[i] == val){

                    }
                    else if (nums[i] != val){
                        nums[k] = nums[i];
                        k++;
                    }
                }
                return k;
            }

        }
    }
}
