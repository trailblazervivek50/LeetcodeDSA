class PalindromeCheck {
    public static boolean isPalindrome(int x) {
        int rev=0;
        int org = x;
        if(x<0){
            return false;
        }
        while(x!=0){
            rev= rev*10 + x%10;
            x=x/10;
        }
        if(org!=rev){
            return false;
        }
        return true;
    }
}
class Palindrome{
    public static void main(String[] args) {
        boolean result= PalindromeCheck.isPalindrome(121);
        System.out.println(result);
    }
}