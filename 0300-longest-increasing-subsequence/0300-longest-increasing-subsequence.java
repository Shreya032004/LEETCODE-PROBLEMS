class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis=new int[nums.length];
        Arrays.fill(lis,1);
        int max=1;

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    lis[i]=Math.max(lis[i],1+lis[j]);
                    max=Math.max(max,lis[i]);
                }
            }
        }
        return max;
    }
}