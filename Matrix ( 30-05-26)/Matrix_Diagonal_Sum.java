class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0;i<mat.length;i++){
            s+=mat[i][i];
        }
        int j=0;
        for(int i=mat.length-1;i>=0;i--){
            s+=mat[j++][i];
        }
        if(mat.length%2!=0){
            int n=mat.length/2;
            s-=mat[n][n];
        }
        return s;
    }
}