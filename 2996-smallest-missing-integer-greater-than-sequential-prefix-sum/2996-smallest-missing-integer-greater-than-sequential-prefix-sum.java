class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
              sum+=nums[i];
            }else{
                break;
            }
        }
        while(contains(nums,sum)){
            sum++;
        }
        return sum;
    }
    public boolean contains(int[] nums,int sum){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==sum){
                return true;
            }
        }
        return false;
    }
}