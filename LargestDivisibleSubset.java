class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<Integer>();
        if(n==0)
            return (list);
        Arrays.sort(nums);
        int max=1;
        int[] dp=new int[n+1];
        for(int x=0;x<n+1;x++)
            dp[x]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    if(max<dp[i])
                        max=dp[i];
                }
                    
            }
        }
        int prev=-1;
        for(int k=n-1;k>=0;k--){
            if(dp[k]==max && (prev%nums[k]==0||prev==-1)){
                list.add(nums[k]);
                max=max-1;
                prev=nums[k];
            }
        }
        return (list);
   }
}