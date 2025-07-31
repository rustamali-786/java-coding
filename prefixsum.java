
/*
Q1. Given an integer array return the prefix sum/running sum in the same array without
creating a new array.
 */

// but ham arry new bana kaar ye code kar rahe hai approach 1 me
/*
import java.util.Scanner;
public class prefixsum {
    public static void printarr(int [] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int [] prefixsum(int []arr){
        int n = arr.length;                          // 2 3 6 5 8
        int [] pref = new int [n];
        pref[0] = arr[0];
        for(int i = 1; i < n; i++){
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int [] pref = prefixsum(arr);
        printarr(pref);

    }
}


 */

//                   without creating a new array.(aproach 2)
/*
import java.util.Scanner;
public class prefixsum {
    public static void printarr(int [] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int [] prefsum(int [] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] ans = prefsum(arr);
        printarr(ans);
    }
}

 */

/*
Q2. Given an array of integers of size n. Answer q queries where you need to print
the sum of values in a range of indices from 1 to (both included ).
Note=> The values of l and r in queries follow 1 based indexing.

import java.util.Scanner;
public class prefixsum{
    public static int [] sumvaluerange(int [] arr){
      int n = arr.length;
      for(int i = 1; i < n; i++){
          arr[i] = arr[ i - 1 ] + arr[i];
      }
      return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("Enter element: ");
        for (int i = 1 ; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = sumvaluerange(arr);
        System.out.println("Enter quaries: ");
        int q = sc.nextInt();
        while(q > 0) {
            System.out.println(" Enter l = ");
            int l = sc.nextInt();
            System.out.println("Enter r = ");
            int r = sc.nextInt();
           int results = ans[r] - ans[l-1];
            System.out.println("sum is " + results);
            q--;
        }
    }
    }

*/