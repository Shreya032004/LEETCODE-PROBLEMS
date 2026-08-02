class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int prefix=1;
        int post=1;
        Arrays.fill(result,1);

        for(int i=0;i<nums.length;i++){
            result[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;
    }
}