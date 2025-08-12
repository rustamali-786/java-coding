/*
Q1. Sum of Matrix.
 */

/*
import java.util.Scanner;
public class TwoDArray {
    static void printarray(int [][] matrix ){
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int [][] a ,int r1, int c1, int [][] b, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println(" Wrong Input ! Addition not possible");
            return;
        }
        int [][] sum = new int [r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(" Sum of matrix 1 and matrix 2 is ");
        printarray(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: And columns ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] a = new int [r1][c1];
        System.out.println("Enter matrix values : ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Enter number of Rows: And Columns: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] b = new int [r2][c2];
        System.out.println(" Enter matrix values : ");
        for(int i = 0; i < r2;i++){
            for(int j = 0; j < c2; j++){
                b [i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printarray(a);
        System.out.println("Matrix 2");
        printarray(b);
     add( a , r1, c1, b,  r2,  c2);

    }

}

 */

/*
Q2. Write a program to display multiplication of two matrices entered by the user.
 */

/*
import java.util.Scanner;
public class TwoDArray {
    static void printarray(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplay(int [][] a, int r1,int c1, int [][]b,int r2, int c2){
        if(c1 != r2){
            System.out.println("Invalid input!");
            return;
        }
    int [][] mul = new int [r1][c2];
    for(int i = 0 ; i < r1; i++){
        for(int j = 0; j < c2; j++){
            for(int k = 0; k < c1; k++){
                mul[i][j]+= (a[i][k] * b[k][j]);
            }
        }
    }
        System.out.println(" Matrix multiplication is ");
        printarray(mul);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows And Columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] a =  new int [r1][c1];
        System.out.println("Enter matrix 1 Values: ");
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
            System.out.println("Enter number of rows And Columns: ");
            int r2 = sc.nextInt();;
            int c2 = sc.nextInt();
            int [][] b = new int [r2][c2];
            System.out.println("Enter number of rows And columns: ");
            for(int i = 0; i < r2; i++){
                for(int j = 0; j < c2; j++){
                    b[i][j] = sc.nextInt();
                }
            }
        System.out.println("Matrix 1");
            printarray(a);
        System.out.println("Matrix 2");
        printarray(b);
            multiplay(a, r1, c1, b, r2, c2);

        }
    }

 */

/*
Q. WAP to display transpose of matrix entered by the user.( with new array banakr)
 */


/*
import java.util.Scanner;
public class TwoDArray{
    static void printarray(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    static int [][] transpose(int [][] arr, int r, int c ){
        int [][] ans = new int [c][r];
        for(int i = 0; i < c; i++){
            for (int j = 0; j < r; j++) {
                ans [i][j] = arr [j][i];
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int [r][c];
        int toatalelements = r * c;
        System.out.println("Enter "+toatalelements+" Elements : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j]  = sc.nextInt();
            }
        }
        System.out.println(" original matrix is ");
        printarray(arr);
        System.out.println("Transpose of matrix is ");
       int [][] ans = transpose(arr,r,c);
        printarray(ans);

    }
}

 */


/*
Q. WAP to display transpose of matrix entered by the user.( without new array banakr)

 */

/*
import java.util.Scanner;
public class TwoDArray{
    static void printarray(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void transpose(int [][] arr, int r, int c ){
        for(int i = 0 ; i < r ; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int [r][c];
        int toatalelements = r * c;
        System.out.println("Enter "+toatalelements+" Elements : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j]  = sc.nextInt();
            }
        }
        System.out.println(" original matrix is ");
        printarray(arr);
        System.out.println("Transpose of matrix is ");
        transpose(arr,r,c);
        printarray(arr);

    }
}

 */

/*
Q. Give a square matrix , turn it by 90 degrees in a clockwise diresction without using any extra space.
 */

/*
import java.util.Scanner;
public class TwoDArray{
    public static void printarray(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverses(int [] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void transposeInplace(int [][] matrix ,int r ,int c ){
        for(int i = 0; i < r; i++){
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void rotate(int [][] matrix, int n) {
              transposeInplace(matrix,n,n);
        for (int i = 0; i < n; i++) {
            reverses(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and columns ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int [r][c];
        System.out.println("Enter " + r*c +" element : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("original Matrix is ");
        printarray(matrix);
        rotate(matrix,r);
        System.out.println(" 90 degree rotate matrix is ");
        printarray(matrix);
    }
}

 */

/*
Q. Given an integers n return the first n rows of pascals tringle.
in pascal tringle each number is the sum of two numbers directly.
 */

/*
import java.util.Scanner;
public class TwoDArray{
    public static void printarray(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [][] pascal(int n){
        int [][] ans = new int [n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j]  = ans[i - 1][j] + ans[i - 1][j -1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int [][] ans = pascal(n);
        printarray(ans);

    }
}

 */


/*
Q.print matrix in spiral order.

1  2  3  4
12 13 14 5
11 16 15 6
10  9 8  7

 */

/*
import java.util.Scanner;
public class TwoDArray {
    static void squarelorder(int [][] matrix, int r, int c){
        int topRow = 0 , bottomRow = r -1 , rightCol = c -1 , leftCol = 0;
         int totalElements = 0;
        while(totalElements < r * c){

            // topRow => leftCol to rightCol
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                System.out.print(matrix[topRow][j] +" ");
                totalElements++;
            }
            topRow++;

            // rightCol => topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol] +" ");
                totalElements++;
            }
            rightCol--;

            // bottomRow => rightcol to leftcol
            for (int j = rightCol; j >= leftCol && totalElements < r * c ; j--) {
                System.out.print(matrix[bottomRow][j]+ " " );
                totalElements++;
            }
            bottomRow--;

            // leftcol => bottomrow to toprow
            for (int i = bottomRow; i >=topRow && totalElements < r * c ; i--) {
                System.out.print(matrix[i][leftCol] +" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void printmatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrixA = new int [r][c];
        System.out.println("Enter elements in first matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("first original matrix is ");
        printmatrix(matrixA);
        System.out.println("Spirial Matrix is ");
        squarelorder(matrixA,r,c);

    }

}

 */


/*
Q. given a positive integers n, generate an n * n matrix fikked with elements from 1 to n^2 in spirial order.
 */

/*
import java.util.Scanner;
public class TwoDArray {
    public static void printarr(int [][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [][]  spirial(int n) {
        int[][] matrix = new int[n][n];
        int current = 1;
        int toprow = 0, rightCol = n - 1, bottomrow = n - 1, leftCol = 0;
        while (current <= n * n) {


            // toprow => leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                matrix[toprow][j] = current++;
            }
            toprow++;

            // rightCol => topCol to bottomCol
            for (int i = toprow; i <= bottomrow && current <= n * n; i++) {
                matrix[i][rightCol] = current++;
            }
            rightCol--;

            // bottomRow => leftcol to rightcol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                matrix[bottomrow][j] = current++;
            }
            bottomrow--;

            // leftCol => bottomrow to toprow
            for (int i = bottomrow; i >= toprow && current <= n * n ; i--) {
                matrix[i][leftCol] = current++;
            }
            leftCol++;
        }
            return matrix;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        int [][] ans = spirial(n);
        printarr(ans);
    }
}

 */


/*
**************************** Pattern: prefixsum in 2D Arrays ***********************************************
*/

/*
Given a matix a of dimension n * m and 2 coordinates (l1, r1) and (l2, r2).
return the sum of the rectungle from (l1, r1) to (l2, r2).
 */
/*
import java.util.Scanner;
public class TwoDArray {
    public static int  findsum (int [][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2 ; j++) {
                sum += matrix[i][j];
             }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number off rows and column : ");
        int r = sc.nextInt();
        int c =sc.nextInt();
        int  [][] matrix = new int [r][c];
        System.out.println("Enter " + r * c +" elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
            System.out.println("Enter l1 to r1 ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            System.out.println("Enter l1 to r2 ");
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            int  summatrix = findsum(matrix,l1,r1,l2,r2);
        System.out.println(summatrix);
        }
}
*/


























































