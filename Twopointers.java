/*
 Q1.sort an array consisting of only 0s and 1s.
suppose => [ 1 0 1 0 0 0 1 0 1 1 0 1 1 ]
 */

//     First Approach

/*
import java.util.Scanner;
public class Twopointers {
    public static void printarray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortzeroone(int[] arr) {
        int n = arr.length;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < zero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter element:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(" Original array");
            printarray(arr);
            sortzeroone(arr);
            System.out.println();
            System.out.println(" Sorted Array");
            printarray(arr);

        }
    }

 */


//  Second approach


/*

import java.util.Scanner;

public class Twopointers{
    public static void printarray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortzeroone(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] == 0){
                arr[i]++;
            }
            if(arr[j] == 1){
                arr[j]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array ");
        printarray(arr);
        sortzeroone(arr);
        System.out.println();
        System.out.println("Sorted Array ");
        printarray(arr);


    }
}


 */

/*
Q.2 Given an array of integers `a`, move all the even integers at the begining of the array followed by all the odd
integers. The relative order of odd or even integers does not matter.return any array that satisfies the condition.
 */


import static java.util.Collections.swap;

/*
import java.util.Scanner;
public class Twopointers{
    public static void Arrayprint(int []arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int []arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortinteger(int []arr){
        int n = arr.length;
        int i = 0 , j = n -1;
        while(i < j){
            if(arr[i] % 2 != 0 && arr[j] % 2 ==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] % 2 ==0 ){
                i++;
            }
            if(arr[j] % 2 != 0){
                j--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int []arr = new int [n];
        System.out.println("Enter element:");
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("  before original array");
        Arrayprint(arr);
        sortinteger(arr);
        System.out.println();
        System.out.println(" After Sorted array Odd And Even ");
        Arrayprint(arr);

    }
}


 */


/*
 Q3.Given an in integers array sorted in non - decreasing order , return an array of the squares of each number sorted in non-decreasing order.
 */

/*
import java.util.Scanner;
public class Twopointers{
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void rev(int [] arr){
        int n = arr.length;
        int i = 0 , j = n -1;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void arrprint(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int [] sortsquares(int [] arr){
        int n = arr.length;
        int i = 0, j = n - 1;
        int [] ans = new int [n];
        int k = 0;
        while(i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i] * arr[i];
                i++;
            }
            else{
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println(" Enter array size:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" Before Sort Squares");
        arrprint(arr);
        System.out.println();
        System.out.println(" After Sort Squares");
        int [] ans = sortsquares(arr);
        rev(ans);
        arrprint(ans);

    }
}

 */


















































