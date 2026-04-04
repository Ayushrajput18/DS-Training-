package Two_Pointers;

public class Remove_Element {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            // int j=0;
            // nums[j] = val;
            for (int i = 0; i < nums.length ; i++) {
                if (nums[i] != val) {
                    nums[k]=nums[i];
                    k++;
                }

            }
            return k;
        }

    }
}
