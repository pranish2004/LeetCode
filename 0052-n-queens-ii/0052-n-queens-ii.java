class Solution {
    static void rec(int col,int n,char board[][],HashMap<Integer,Integer>leftrow,HashMap<Integer,Integer>leftcol,HashMap<Integer,Integer>upper,HashMap<Integer,Integer>lower,int count[]){
         if(col>=n){
           count[0]++;
           return;
         }
         for(int row=0;row<n;row++){
         if((leftrow.get(row)==0)&&(upper.get(n-1+row-col)==0)&&(lower.get(row+col)==0)&&(leftcol.get(col)==0)){
             board[row][col]='Q';
             leftrow.put(row,1);
             leftcol.put(col,1);
             upper.put(n-1+row-col,1);
             lower.put(row+col,1);
             rec(col+1,n,board,leftrow,leftcol,upper,lower,count);
              board[row][col]='.';
             leftrow.put(row,0);
             leftcol.put(col,0);
             upper.put(n-1+row-col,0);
             lower.put(row+col,0);
         }
    }
    }
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        board[i][j]='.';
	    }
	}
HashMap<Integer,Integer>leftrow=new HashMap<>();
for(int i=0;i<n;i++){
    leftrow.put(i,0);
}
HashMap<Integer,Integer>leftcol=new HashMap<>();
for(int i=0;i<n;i++){
    leftcol.put(i,0);
}
HashMap<Integer,Integer>upper=new HashMap<>();
for(int i=0;i<2*n;i++){
    upper.put(i,0);
}
HashMap<Integer,Integer>lower=new HashMap<>();
for(int i=0;i<2*n;i++){
    lower.put(i,0);
}
int count[]=new int[n];
rec(0,n,board,leftrow,leftcol,upper,lower,count);
return count[0];
    }
}