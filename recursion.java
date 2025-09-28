package Recursion;


/*
Q1. WAP to print all natural numbers from 1 to n using recursion.
 */
/*
import java.util.Scanner;
public class basic {
    public static void iR(int n){
        if( n == 1){
            System.out.println(n);
            return;
        }
        iR(n-1);
        System.out.println(n);
    }
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    iR(n);
}

}

 */

/*
Q2. WAP to print all natural numbers from n to 1 using recursion.
 */
/*
import java.util.Scanner;
public class basic {
    public static void decre(int n){
        if( n == 0){
            return;
        }

        System.out.println(n);
        decre(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        decre(n);
    }
}

 */

/*
Q3.find the factorial of 10!
 */
/*
import java.util.Scanner;
public class basic {
    public static int fact(int n){
  // base case
    if(n == 0){
        return 1;
    }
    // small problem
  // int SmallProblem = fact(n-1);

    // Self problem
   // int ans = n * SmallProblem;

        // return ans;

    return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial number is "+fact(n));

    }
}
 */

/*
Q4. fibonacci series
 */
/*
import java.util.Scanner;
public class basic {
    public static int fibon(int n){
       // base case
        if(n == 0 || n == 1){
            return n;
        }

        // recursive work
        return fibon(n-1) + fibon(n - 2);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(fibon(i) + " ");
        }

    }
}

 */

/*
Q5. Given an integers , find out the sum of its digits using recursion.
 */
/*
import java.util.Scanner;
public class basic {
    public static int sod(int n){
        if(n >=0 && n <= 9){
            return n;
        }

        return sod(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(sod(n));

    }
}

/*
Return the count of digits in a given numbers n. using recursion
 */
//import java.util.Scanner;
//public class basic {
//    public static int count(int n){
//        if( n >= 0 && n <=9){
//            return 1;
//        }
//        return 1 + count(n/10);
//    }
//    public static void main(String[] args) {
//        System.out.println(count(12345));
//    }
//}
//

/*
Q. print decreasing - increasing.
 */
/*
import java.util.Scanner;
public class basic {
    public static void A(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n +" ");
        A(n - 1);
        System.out.println(n+" ");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        A(n);
    }
}

 */

/*
Q.`a` raised to  the power `b` using recursion.
 */

// first method without recursion.
/*
import java.util.Scanner;
public class basic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a =");
        int a  = sc.nextInt();
        System.out.println("Enter b=");
        int b = sc.nextInt();
        System.out.println(a+" ke power " +b+ " is "+Math.pow(a,b));
    }
}

 */

// Second method
/*
import java.util.Scanner;
public class basic {
    public static int pow(int a, int b){
        if( b == 0) return 1;
        return a * pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a =");
        int a = sc.nextInt();
        System.out.println("b =");
        int b = sc.nextInt();
        System.out.println(a+" ke power "+b+" is "+ pow(a,b));

    }
}
 */

//method 3
/*
import java.util.Scanner;
public class basic {
    public static int pow(int a, int b){
        if( b == 0) return 1;
        int call = pow(a,b/2);
        if( b % 2 == 0)  return call * call;
        else return a * call * call;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a =");
        int a = sc.nextInt();
        System.out.println("b =");
        int b = sc.nextInt();
        System.out.println(pow(a,b));

    }
}

 */

/*
Q. find the reverse of a number using recursion.
 */
/*
import java.util.Scanner;
public class basic {
    public static int rev(int n, int r){
        if( n == 0) return r;
        return rev(n/10,r*10+n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12345;
        System.out.println( rev(n,0));
    }
}
 */

/*
Q. find hcf without using recursion
 */
/*
import java.util.Scanner;

public class basic {
    public static int fact(int n, int m){
        int hcf  = 1;
        for (int i = 2; i <=Math.min(n,m); i++) {
         if( n % i == 0 && m % i == 0){
             hcf = i;
         }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        int n = sc.nextInt();
        System.out.println("Enter b = ");
        int m = sc.nextInt();
        System.out.println(fact(n,m));
            }
        }

 */

/*
using recursion
 */
/*
import java.util.Scanner;
public class basic {
    public static int hcf(int a, int b){
        if( a == 0) return b;
        return hcf(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a & b = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a,b));
    }
}
 */

/*
Q. reverse array from recursion
 */
/*
public class basic {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,9,0};
        print(arr,arr.length-1);
    }
    public static void print(int [] arr, int indx){
        if( indx < 0) return;
        System.out.println(arr[indx]);
        print(arr,indx-1);
    }
}

 */
/*
public class basic {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        rev(arr,0);
    }
    public static void rev(int []arr,int index){
        if( index == arr.length) return;
        rev(arr,index+1);
        System.out.println(arr[index]);
    }
}
 */

/*
        linear search using recursion.
 */

public class recursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 70;
        System.out.println(src(arr,target,0));
    }
    public static boolean src(int [] arr, int target,int index){
        if( index == arr.length) return false;
        if(arr[index] == target) return true;
        return src(arr,target,index+1);
    }
}































