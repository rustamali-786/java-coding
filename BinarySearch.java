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

/*
 Q. search element in sorted array.
 */
/*
public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(searchRotated(nums,target));
    }
    public static int searchRotated(int [] nums,int target){
        int n = nums.length;
        int low = 0, high = n-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return mid;
           else if(nums[low] < nums[mid]){
                if(nums[low] <= target && target < nums[mid]) high = mid-1;
                else low = mid+1;
            }
           else{
               if(nums[mid] < target && target <= nums[high]) low = mid+1;
               else high = mid-1;
            }

        }
        return -1;
    }
}
 */


/*
Q. search in sorted matrix
 */
/*
public class BinarySearch {
    public static void main(String[] args) {
        int [][] matrix  = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,16}};
        int target = 300;
        System.out.println(sortmatrix(matrix,target));
    }
    public static boolean sortmatrix(int [][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int low = 0, high = row * col - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midRow = mid / col;
            int midCol = mid % col;
            if (matrix[midRow][midCol] == target) return true;
            else if (matrix[midRow][midCol] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}

 */





























