class Solution {
    //Function for Two_Sum alogirthm.
    public int[] Two_Sum(int[] nums, int target) {
        int[] Target_Pair = new int[2];
        for (int index1 = 0; index1 < nums.length; index1++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2++) {
                /*
                checks whether the sum of values at two indexes is equal to target.
                if yes returns target.
                if no checks for next index.
                */
                if (nums[index1] + nums[index2] == target) {
                    Target_Pair[0] = index1; //first_index for target pair
                    Target_Pair[1] = index2; //second index of target pair
                    return Target_Pair;
                }
            }
        }
        return Target_Pair; //returns resultant pair
    }
}

public class Two_Sum {
    public static void main(String[] args) {
        int Arr[] = { 2, 7, 11, 15 };  //given array
        int Target = 9;  //required target
        Solution  Obj= new Solution();
        int Target_Pair[] = Obj.Two_Sum(Arr, Target); //stores the resultant pair
        for (int Target_Index : Target_Pair)
            System.out.println(Target_Index);
    }
}