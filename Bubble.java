
/*
check array is sorted or not.
 */
/*
public class Bubble {
    public static void main(String[] args) {
        int [] arr = {1,200,5,6,84,300,310,600};
        System.out.println(sort(arr));
    }
    public static boolean sort(int [] arr){
         for(int i = 0; i < arr.length -1; i++){
             if(arr[i] > arr[i + 1]) return false;
         }
         return true;
    }
}
 */


/*
           Bubble sort
 */
/*
public class Bubble {
    public static void print(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {1,4,-3,0,54,3,8};
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}
 */

/*
            optimise Bubble sort
 */
/*
public class Bubble {
    public static void print(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int swap = 0;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        print(arr);
    }
}

 */

/*
Q.   sort an array in descending order using bubble sort.
 */
/*
public class Bubble {
    public static void main(String[] args) {
        int [] arr = {4,3,6,35,-465,3,24,};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
            if(arr[j] < arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

 */

/*
       move all zero to end.
 */
/*
public class Bubble {
    public static void main(String[] args) {
        int[]arr = {1,2,0,4,3,0,5,0};
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] != 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

 */
















