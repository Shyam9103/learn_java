class Solution {
    public int[] two_sum(int[] nums, int target) {
        int[] target_pair = new int[2];
        for (int index1 = 0; index1 < nums.length; index1++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2++) {
                if (nums[index1] + nums[index2] == target) {
                    target_pair[0] = index1;
                    target_pair[1] = index2;
                    return target_pair;
                }
            }
        }
        return target_pair;
    }
}

public class Two_Sum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        Solution obj = new Solution();
        int target_pair[] = obj.two_sum(arr, target);
        for (int target_index : target_pair)
            System.out.println(target_index);
    }
}