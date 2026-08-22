class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int x=n;
        while(x>0){
           int rem=x%10;
           sum=sum+rem;
           prod=prod*rem;
           x=x/10;
           
        }
        return n%(sum+prod)==0;
        
    }
}