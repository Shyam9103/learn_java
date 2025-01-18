class Solution1{
    public int partition(int low,int high,int[] arr) {
        int left = low;
        int right = high;
        while (left < right) {
            while (arr[left] <= arr[low] && left < high) {
                left++;
            }
    
            while (arr[right] > arr[low] && right > low) {
                right--;
            }
    
            if (left < right) {
                int temp = arr[right];
                arr[right] = arr[low];
                arr[low] = temp;
            }
    
        }
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;
        return right;
    }
    
    public void quickSort(int[] arr,int low,int high){
    
        if(low>=high) return;
        int partition=partition(low,high,arr);
        quickSort(arr,low,partition-1);
        quickSort(arr,partition+1,high);
    
    }
    }
    
    
    
    public class QuickSort{
        public static void main(String[] args){
            int[] arr={4,6,2,5,7,9,1,3};
            Solution1 obj=new Solution1();
            obj.quickSort(arr,0,arr.length-1);
            for(int index=0;index<arr.length;index++){
                System.out.print(arr[index]+ " ");
            }
        }
    }