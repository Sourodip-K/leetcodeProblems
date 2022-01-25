class Solution {
    public boolean isPalindrome(int x) {
        int num=x; int mod;
        int palinchk=0;
        while(x>0) {
            mod=x%10;
            palinchk=palinchk*10+mod;
            x=x/10;
        }
        //System.out.println(palinchk);
        if(palinchk==num) {
            return true;
        }
        return false;
    }
}