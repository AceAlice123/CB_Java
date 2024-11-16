import java.util.Arrays;

public class Nqueens {
    public static int [][]board;
    public static void main(String[] args) {
        
    }
    // public static boolean nqueens(int [][]board,int i,int n){
    //     //base case
    //     if(i==n){display(board);}
    //     //
    //     for (int j=0; j<n;j++){
            
    //     }
    // }
    public static boolean checksafe(int [][]board,int i , int j, int n ){
        //cols 
        for (int k =0;k<i;i++){
            if(board[k][j] ==1){return false;}
        }
        // right diagoanl
        int x = i-1,y=j+1;
        while (x>=0 && y<n) {
            if(board[x][y]==1){return false;}
            i--;j++;
        }
        // left diagonal
        x=i-1;y=j-1;
        while (x>=0 && y>=0) {
            if(board[x][y]==1){return false;}
            i--;j--;
        }
        return true;
    }
    public static void display(int[][]arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
