class Solution {
    public int removeDuplicates(int[] nums) {
        int iIdx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[iIdx]=nums[i];
                iIdx++;
            }
        }
        return iIdx;
    }
}