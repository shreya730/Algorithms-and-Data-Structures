class Solution {
    public int countNodes(TreeNode root) {
    int lcount=1,rcount=1;
    if(root==null)
        return 0;
    TreeNode l=root.left;
        while(l!=null){
            l=l.left;
            lcount++;
        }
    TreeNode r=root.right;
        while(r!=null){
            r=r.right;
            rcount++;
        }
    if(lcount==rcount)
        return (int)(Math.pow(2,lcount))-1;
    return 1+countNodes(root.left)+countNodes(root.right);
    }
}