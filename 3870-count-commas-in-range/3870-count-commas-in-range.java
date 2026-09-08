class Solution {
    public int countCommas(int n) {
       // Arraylist<Integer> arr=new ArrayList<>();
       if(n<999)return 0;
       int cnt=1;
       if(999<n && n<=100000){
       
         for(int i=1000;i<n;i++){
            cnt=cnt+1;
         }
       }
       return cnt;
       
       
        

    }
}