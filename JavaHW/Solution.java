package JavaHW;

public class Solution {
    public static void main(String[] args) {

        boolean solution = isPalindrome(4004);


        if(solution==true){
            System.out.println("the statement is a palindrome");
        }
        else{
            System.out.println("false");
        }

}
    
    public static boolean isPalindrome(int x) {
       String pal = Integer.toString(x);
       char[] ch = pal.toCharArray();

    for(int i = 0; i < ch.length/2; i++){
        if(ch[i]!= ch[ch.length-1-i]){
            return false;
        }
    }

    return true;
    

   


}
}
