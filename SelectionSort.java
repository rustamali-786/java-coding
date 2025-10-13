/*
    Find smallest first using selection sort.
 */

/*
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,-2,6,7,2,8,7,2};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < n; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index]= temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

 */

/*
   find largest first using selection sort.
 */
/*
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {8,4,1,9,-3,6,5};
        int n = arr.length;
        for (int i = n-1; i >0 ; i--) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int j = 0; j <= i; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

 */

/*
Q.  2 sum - find a pair with given sum.
 */
/*
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {7,0,4,3,20,8,10};
        Arrays.sort(arr);
        boolean found = false;
        int n = arr.length;
        int target = 300;
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i] + arr[j] == target){
            found = true;
            System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                break;
            }
            else if (arr[i] + arr[j] > target)  j--;
            else i++;
        }
         System.out.println(found);
    }
}

 */

/*
union of two sorted array
 */
/*
import java.util.ArrayList;
public class SelectionSort {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 6, 7};
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length || j < b.length){
            while (i >0 && i< a.length && a[i] == a[i-1]) i++;
            while (j >0 && j< b.length && b[j] == b[j-1]) j++;
            if (i >= a.length){
                ans.add(b[j]);
                j++;
                continue;
            }
            if (j >= b.length){
                ans.add(a[i]);
                i++;
                continue;
            }
            if (a[i] < b[j]){
                ans.add(a[i]);
                i++;
            }
            else if (a[i] > b[j]){
                ans.add(b[j]);
                j++;
            }
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}

 */



























