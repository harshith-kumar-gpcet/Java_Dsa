//java 
//Palindrome Number
//Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;
        StringBuilder sb =new StringBuilder("");
        int ori=x;
        while(ori >0 ){
            int temp=ori%10;
            sb.append(temp);
            ori=ori/10;
        }
        return sb.toString().equals(String.valueOf(x));
    }
}
