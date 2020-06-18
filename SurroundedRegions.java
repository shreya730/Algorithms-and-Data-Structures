class Solution {
    public void solve(char[][] board) {
        int row=board.length;
        if(row<=2)return;
        int col=board[0].length;
        if(col<=2)return;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O' && (i==0||i==row-1||j==0||j==col-1))
                    dfs(board,i,j);
            }  
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='A')
                    board[i][j]='O';
            }  
        }
        
    }
    public void dfs(char[][] board,int i,int j){
        if(i>=0 && i<board.length && j>=0 && j<board[0].length && board[i][j]=='O'){
        board[i][j]='A';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
        }
    }
}