import java.util.*;
public class Matrices {
    public static boolean search(int matrix[][], int key){
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix [i][j] == key){
                    System.out.println("Element found in cell (" + i + "," + j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void check(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest No: "+largest);
        System.out.println("Smallest No: "+smallest);
    }

    public static void sprialMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startCol<= endCol && startRow<=endRow){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            
            //left
            for(int i=endRow-1; i>= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i + j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static boolean sortedMatrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }   
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void findNum(int matrix[][], int num){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == num){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static int sumOfMatrix(int matrix[][]){
        int row = 0;
        int sum = 0;
        for(int col=0; col<matrix[row].length; col++){
            sum += matrix[row][col];
        }
        return sum;
    }

    public static int[][] transposedmatrix(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;

        int temp [][] = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                temp[j][i] = matrix[i][j];
            }
        }

        return temp;
    }

    public static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main (String agrs[]){

        // int matrix [][] = new int [3] [3];
        // int n = matrix.length, m = matrix[0].length;

        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix [i][j] = sc.nextInt();
        //     }
        // }

        // //output
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix [i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // int matrix[][] = {{10,20,30,40},
        //                   {15,25,35,45},
        //                   {27,29,37,48},
        //                   {32,33,39,50}};
        // int key = 40;
        // sortedMatrix(matrix, key);
        
        // int matrix2[][] = { {4,7,8},{8,8,7} };
        // int num = 8;
        // findNum(matrix2, num);

        // int[][] nums = { {1,4,9},
        //                  {11,4,3},
        //                  {2,2,3},
        //                 {1,2,3} };
        // int n = sumOfMatrix(nums);
        // System.out.println(n);

        
    
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         System.out.print(matrix[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transposedMatrix = transposedmatrix(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
        
    }
}
