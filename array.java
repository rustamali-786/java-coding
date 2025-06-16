
//               Array

// kuch important bate
// 1. A collection of similar types of data elements
// 2. A data sturucture which is stored at continuous location
// 3. An index data structure
//
//         But in java anarray is internally an object
//
// 1. Since array is an object , it is always created dynamically.
// 2. since array are created at runtime, java stores them in heap area.
// 3. theyare created using the keybword new.
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter Array Size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println(" Enter Array Elements: ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//
//}
////
//
//   Q1. given an array of marks of students,if the mark of any student is
//       less than 35 print its roll number. roll number here refers to the
//        index of the array.
//
//
//      import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        int[] marks = {100, 95, 4, 21, 36, 96, 21, 33, 34, 25,};
//        for (int i = 0; i <= marks.length; i++) {
//            if (marks[i] < 35) {
//                System.out.println(i);
//
//            }
//
//        }
//    }
//}
// // Q2. calculate the sum of all elements in the given array.
//import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter array size: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println(" Enter elements : ");
//        for(int i = 0; i < n; i++){
//            arr[i]= sc.nextInt();

import java.util.Arrays;
import java.util.Scanner;

////        }
//        int sum = 0;
//        for(int i = 0; i < n; i++){
//            sum = sum + arr[i];
//        }
//        System.out.print(sum);
//    }
//}
//
// ********************************** Linear search.******************************************
//
// Q3. find the element x in the array. Take and x as input.
//
//import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       int [] array = {2,3,4,8,9,7,10,15,25,36,};
//        System.out.println(" Enter x = ");
//        int x = sc.nextInt();
//        boolean flag = false;
//        for(int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                flag = true;   // mil gaya
//                break;
//            }
//        }
//            if(flag == false) {
//                System.out.println(" nahi mila ");
//            }
//            else{
//                    System.out.println(" mil gaya ");
//                }
//            }
//        }
//
//
// Q4.  Find the maximum value out of all the elements in the arrays.
//
//public class array{
//    public static void main(String[]args){
//        int [] array = {2,6,54,32,58,47,562,5,6,558,263,3,25,10,35,89,45,28,36,78,41,36,};
//        int max = 0;
//        for(int i = 0; i < array.length; i++){
//            if(array[i]>max){
//               max = array[i];
//            }
//        }
//        System.out.println(max);
//    }
//}
//
// Q5. find the second largest element in the given array.
//
//public class array{
//    public static void main(String[] args) {
//        int []array = {2,5,6,4,10,23,2,10,30,45,4};
//        int fmax = 0;  // first maxiumx
//        for(int i = 0; i < array.length; i++){
//            if (array[i] > fmax) {
//                fmax = array[i];
//            }
//        }
//        int smax = -1; // second maximum
//        for(int i = 0; i < array.length; i++){
//            if(array[i]>smax && array[i]!=fmax){
//                smax = array[i];
//            }
//        }
//        System.out.println(fmax);
//        System.out.println(smax);
//    }
//}
//
// Q6. count the number of elements in given array greater than a given number.
//import java.util.Scanner;
//public class array{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] array = {12,2,53,0,5,20,2,1,23,2,25};
//        System.out.println(" Enter x = ");
//        int x = sc.nextInt();
//        int count = 0;
//        for(int i = 0; i < array.length; i++){
//        if(array[i] > x){
//            count++;
//        }
//    }
//        System.out.println(count);
//    }
//}
//
// Q7.  you have been a random integer aray of size N. You are required to find
//       and return largest element present in the array.
//
//         if n<=1 or all the elements are same in the array then return then -2147483648 or -2^31
//          (it is the smallest value of the the range of integer)
//
//         #  Test No 1-- {2,13,4,1,3,6,8,28}
//           ANS- (Output : 13)
//
//         #  Test 2-- {9,3,6,2,9}
//            ANS- (Output: 5)
//
//         #  Test 3-- {6,6,6,6,6,6}
//            ANS- (Output: -2147483648)
//

//       ***************** By sorting method****************


//             Without function

//public class array {
//    public static void main(String[] args) {
//        int [] arr = {2,13,4,1,3,6,8,28};
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);
//    }
//}




//               with function


//public class array{
//
//    public static void main(String[] args) {
//        int [] arr = {2,13,4,1,3,6,8,28};
//        System.out.println(slargest(arr));
//    }
//
//    public static int slargest(int [] arr ){
//        Arrays.sort(arr);
//        return arr[arr.length-2];
//    }
//}



// Q count the number of element  (5,6,5,1,6,5,3,45,2,6,45,2,5,4,6,78,5,6,5,4 ) and take x from iput.

//import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int []arr = {2,5,6,2,6,5};
//        System.out.println(" Enter X = ");
//        int x = sc.nextInt();
//        int Results = fun1(arr, x);
//        System.out.println(" count number is  " + Results);
//
//
//    }
//
//    public static int fun1(int[] arr, int x) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                count++;
//            }
//        }
//        return count;
//    }
//}


 // Q. find the last occurences of an element x in the givem array.
//       {1,5,3,7,2,5,2}

//    import java.util.Scanner;
//   public class array{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] arr = {1,5,3,7,2,5,2};
//        System.out.println(" Enter X: ");
//        int x = sc.nextInt();
//        int results = fun1(arr , x);
//        System.out.println(" The last index number is :"+ results);
//
//    }
//
//    public static int fun1(int [] arr, int x) {
//        int lastdigit = -1;
//        for(int i = 0 ; i < arr.length; i++){
//            if(arr[i] == x){
//                lastdigit = i;
//            }
//        }
//        return lastdigit;
//
//    }
//}



 /*

Q.  check the given array is sorted or not. input from user.

  */

 //   import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter size of array: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println(" Enter element: ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//         boolean results = sorted(arr);
//        System.out.println(" is sorted " + results);
//
//
//    }
//
//    public static boolean sorted(int []arr) {
//        boolean check = true;
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] < arr[i-1] ){
//                // not sorted
//                check = false;
//                break;
//            }
//        }
//        return check;
//
//    }
//
//}


/*
 Q. find the smallest and greatest number of the element.
 */

//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter size of element: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println(" Enter size of element: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int [] results = fun1(arr);
//        System.out.println(results[0]);
//        System.out.println(results[1]);
//
//
//    }
//
//    public static int[] fun1(int[] arr) {
//        Arrays.sort(arr);
//        int[] ans = {arr[0], arr[arr.length - 1]};
//        return ans;
//    }
//
//}


// Q. find the total number of pair in the aray whose sum is equal to the given value.
//
//    import java.util.Scanner;
//public class array{
//    public static int targetsum(int[] arr, int target){
//        int n = arr.length;
//        int ans = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = i + 1; j < n; j++){
//                if(arr[i] + arr[j] == target){
//                 ans++;
//                }
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter size of element: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println(" Enter element: ");
//        for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//        }
//        System.out.println(" Enter target sum: ");
//        int target = sc.nextInt();
//        System.out.println(targetsum(arr, target));
//
//
//    }
//
//
//
//}


//public class array{
//    public static int targetsum(int [] arr, int target){
//        int ans = 0;
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            for(int j = i + 1; j < n; j++ ){
//                for(int k = j + 1; k < n; k++){
//                    if(arr[i] + arr[j] + arr[k] == target ){
//                        ans++;
//                    }
//            }
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] arr = {1,5,9,2,4,8};
//        System.out.println(" Enter sum of target = ");
//        int target = sc.nextInt();
//        int results = targetsum(arr , target );
//        System.out.println(results);
//    }
//}



// ................Array manipulation.............
// Q.Find the unique number in a given Array where all elements are being repeated
//  twice with one being unique.

public class array{
    public static int repeated(int arr){
        int check = 1;
        for(int i = 0; i < arr.length)
    }
}























































































































