package Array;
public class arrays {
    public static void main(String a[]){
    int nums[]={3,45,6,7};
    for(int i=0;i<4;i++){
        System.out.print(nums[i]+ " ");
    }
    System.out.println();

    int twodarray[][]=new int[3][4];

    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
             twodarray[i][j]=(int)(Math.random()*100);
            System.out.print(twodarray[i][j] + " ");
            
        }
        System.out.println();
    }

    //enhanced for loop
    for(int n:nums){
        System.out.println(n);
    }

}
}

