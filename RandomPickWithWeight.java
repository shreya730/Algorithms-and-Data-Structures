class Solution {
    private int[] w_cum;
    private int sum=0;
    public Solution(int[] w) {
     w_cum=new int[w.length];
        for(int i=0;i<w.length;i++){
            sum=sum+w[i];
            w_cum[i]=sum;
        }
        
    }
    
    public int pickIndex() {
      int index=(int)(Math.random()*sum);
        return BinarySearch(index+1);
    }
    private int BinarySearch(int val){
        int l=0;
        int r=w_cum.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
        if(w_cum[mid]<val)
            l=mid+1;
        else
            r=mid;
        }
        return l;
    }
}
