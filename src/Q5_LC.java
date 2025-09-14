public class Q5_LC {
    public static void main(String[] args) {
        class Solution {
            public void moveZeroes(int[] nums) {
                int index = 0;
                for(int i = 0; i<= nums.length -1 ; i++){
                    if (nums[i] == 0){

                    }
                    else if (nums[i] != 0){
                        nums[index] = nums[i];
                        index++;
                    }
                }
                for(int i = index; i<= nums.length -1 ; i++){
                    nums[i] = 0;
                }

            }
        }
    }
}
