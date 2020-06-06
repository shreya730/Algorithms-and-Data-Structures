class Solution {
    public int twoCitySchedCost(int[][] costs) {
       int sum=0;
       int countA=0,countB=0;
        int n=costs.length;
        Arrays.sort(costs,(a,b)->Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]));
        for(int i=0;i<n;i++){
            if(costs[i][0]<costs[i][1]){
                if(countA<n/2){
                    sum=sum+costs[i][0];
                    countA++;
                }
                else{
                    sum=sum+costs[i][1];
                    countB++;
                }
            }
            else{
                if(countB<n/2){
                    sum=sum+costs[i][1];
                    countB++;
                }
                else{
                    sum=sum+costs[i][0];
                    countA++;
                }
            }
            }
        return sum;
        }
    }