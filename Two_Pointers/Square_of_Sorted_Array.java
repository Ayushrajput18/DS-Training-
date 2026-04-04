package Two_Pointers;

public class Square_of_Sorted_Array {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int len = nums.length;
            int[] ans = new int[len];
            int left = 0, right = len - 1, idx = len - 1;

            while (left <= right) {
                int v1 = nums[left] * nums[left];
                int v2 = nums[right] * nums[right];

                if (v1 > v2) {
                    ans[idx--] = v1;
                    left++;
                } else {
                    ans[idx--] = v2;
                    right--;
                }
            }
            return ans;
        }
    }
}
