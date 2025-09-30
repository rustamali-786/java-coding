/*
search target by using binary search

 */

import java.lang.reflect.Array;
import java.util.Arrays;
/*
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 20, 897, 1746, 5394, 7934, 8845, 9342, 109089};
        int target = 109089;
        System.out.println(bin(arr, target));
    }
        public static int bin(int [] arr, int target){
            int n  = arr.length;
            int low = 0, high = n-1;
            while(low <= high){
                int mid = (low + high)/2;
                if(arr[mid] == target){
                    return mid;   // arr[mid]
                } else if (mid < target) {
                    low = mid +1;
                }
                else {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }

 */

/*
Q.  Binary search in descending order
 */
/*
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 1;
        System.out.println(find(arr, target));
    }
    public static int find(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
}

 */

/*
Q. leetcode  find mountain in arry.
 */


















