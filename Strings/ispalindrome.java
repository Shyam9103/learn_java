package Strings;
class solution{
    public boolean solve(String s){

        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
public class ispalindrome {
    public static void main(String[] args) {
        String t=new String("hannah");

        solution check=new solution();
        boolean res= check.solve(t);
        if(res) System.out.println("String is palindrome");
        else System.out.println("String is not a palindrome");

    }
}
