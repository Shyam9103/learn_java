class Solution {
    //Function for TwoSum alogirthm.
    public int[] twoSum(int[] nums, int target) {
        int[] targetPair = new int[2];
        for (int index1 = 0; index1 < nums.length; index1++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2++) {
                /*
                checks whether the sum of values at two indexes is equal to target.
                if yes returns target.
                if no checks for next index.
                */
                if (nums[index1] + nums[index2] == target) {
                    targetPair[0] = index1; //first_index for target pair
                    targetPair[1] = index2; //second index of target pair
                    return targetPair;
                }
            }
        }
        return targetPair; //returns resultant pair
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };  //given array
        int target = 9;  //required target
        Solution  obj= new Solution();
        int targetPair[] = obj.twoSum(arr, target); //stores the resultant pair
        for (int targetIndex : targetPair)
            System.out.println(targetIndex);
    }
}