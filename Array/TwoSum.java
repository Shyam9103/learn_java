package Array;
class Solution{
    public int[] solve (int[] nums,int tar){
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==tar){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
        
    }
}
public class TwoSum {

    
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;

        Solution result=new Solution();
        int res[]=result.solve(arr,target);

        for(int n:res) System.out.println(n);
        
    }
}
