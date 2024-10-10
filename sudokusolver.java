import java.util.Arrays;
import java.util.Scanner;

public class sudokusolver {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =9;
        int [][] matrix=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=scn.nextInt();
            }
        }
        scn.close();
        display(matrix);
        System.out.println();
        SudokuSolver(matrix,0,0,9);
        display(matrix);

    }
    public static boolean SudokuSolver(int[][] matrix,int i ,int j,int n){
        if(i==n){return true;}
        if(j==n) {return SudokuSolver(matrix,i+1,0,n);}
        if(matrix[i][j]!=0){return SudokuSolver(matrix,i,j+1,n);}
        for(int num=1;num<=9;num++){
            if(check(matrix,i,j,n,num)){
                matrix[i][j]=num;
                if(SudokuSolver(matrix, i, j+1, n)){return true;}
            }
        }
        matrix[i][j]=0;
        return false;
    }
    public static boolean check(int[][] arr, int i,int j, int n , int num ){
        // for row and col
        int q=num;
        for (int a =0;a<arr.length;a++ ){
            if(a!=i){
                if(q==arr[a][j]) return false;
            }
            if(a!=j){
                if(q==arr[i][a]) return false;
            }
        }
        // blocks
        int ib=i-(i%3);
        int jb=j-(j%3);
        for (int x=ib;x<ib+3;x++){
            for(int y=jb;y<jb+3;y++){
                if(x!=i && y!=j){
                    if(q==arr[x][y]) return false;
                }
            }
        }
        return true;

    }
    public static void display(int[][]arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
