class Solution {
    public int singleNumber(int[] nums) {
      Arrays.sort(nums);
        int i=1;
        if(nums.length==1)
            return nums[0];
        if(nums[0]!=nums[1])
            return nums[0];
        while(i<nums.length-1){
           if(nums[i]!=nums[i-1])
               return nums[i-1];
            i=i+3;
        }
        return nums[nums.length-1];
    }
}