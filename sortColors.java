class Solution {
    public void sortColors(int[] nums) {
     int low=0;
     int high=nums.length-1;
     int mid=0;
     if(nums.length==0||nums.length==1) return;
     while(mid<=high){
         if(nums[mid]==0){
             swap(mid,low,nums);
             mid++;
             low++;
         }
         else if(nums[mid]==1)
             mid++;
         else if(nums[mid]==2){
             swap(mid,high,nums);
             high--;
         }
         else
             return;
     }
    }
    public void swap(int a,int b,int[] nums){
        int temp=0;
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}