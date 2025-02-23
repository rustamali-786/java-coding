// Tyoes of loop
// there are 3 types of loop
// 1. while loop
// 2. For loop
// 3. Do while loop
// Q: print I Love You "n" times.Take "n" as input from user.
//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1 ; i <=n ; i++){
//            System.out.println("  i love you ");
//        }
//    }
//}
//// Q: print number from 1 to 10.
//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//      for(int i = 1; i<=10; i++){
//          System.out.println(i);
//      }
//
//    }
//}

////// Q: print number from 73 to 829.
//public class loop{
//    public static void main(String[]args){
//        for( int i = 73; i<=829; i++){
//            System.out.println(i);
//        }
//    }
//}
//
//// Q: print number from 1 to n.

//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            System.out.println(i);
//        }
//    }
//}

//// Q: print all the even number from 1 to 100.

//public class loop{
//    public static void main(String[]args){
//
//        for(int i = 1; i<=100; i++){
//          if(i%2==0){
//              System.out.println(i);
//          }
//        }
//
//    }
//}

//// Q: print all the odd number from 1 to 100.

//public class loop{
//    public static void main(String[]args){
//        for(int i = 1; i<=100; i++){
//            if(i%2!=0){
//                System.out.println(i);
//            }
//        }
//    }
//}

//// Q: print all the number from 1 to 100 which are divisible by 3.

//public class loop{
//    public static void main(String[]args){
//        for(int i = 1; i<=100; i++){
//            if(i%3==0){
//                System.out.println(i);
//            }
//        }
//    }
//}

//// Q: print the table of 19.
// method 1

//public class loop{
//    public static void main(String[]args){
//         for(int i = 19; i<=190; i++){
//             if(i%19==0){
//                 System.out.println(i);
//             }
//         }
//    }
//}

// method 2
//public class loop{
//    public static void main(String[] args) {
//        for(int i = 19; i<=190; i=i+19){
//                System.out.println(i);
//            }
//        }
//    }
//// Q: print the table of "n".here "n"is a integer which user will input.

//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=10; i++){
//            System.out.println(i*n);
//        }
//    }
//}
// Q: Print number from 10 to 1.

//public class loop{
//    public static void main(String[] args) {
//        for(int i = 10; i >=  1; i--){
//            System.out.println(i);
//        }
//    }
//
//}

//// Q: print all the even number from 1 to 100.
//public class loop{
//    public static void main(String[] args) {
//        for(int i = 2; i<=100;i = i + 2){
//            System.out.println(i);
//        }
//    }
//}

// WAP 100 to 1 by divisible by 3.
//public class loop{
//    public static void main(String[] args) {
//        for(int i = 99; i>=1; i = i - 3){
//            System.out.println(i);
//        }
//    }
//}

// Q: Display this AP-1,3,5,7,9......... upto "n" terms.

//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a Number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= 2 * n - 1; i = i + 2 ){
//            System.out.print(i+ " ");
//        }
//
//    }
//}

// Q: Disply this AP- 4,7,10,13,16............. upto "n" terms.
//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a Number : ");
//        int n = sc.nextInt();
//        for(int i = 4; i <= 3 * n + 1; i = i + 3){
//            System.out.print(i+ " ");
//        }
//    }
//}

           // Yaaaaa
//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter a Number : ");
//        int n = sc.nextInt();
//        int a = 4, d = 3;
//        for(int i = 1;  i<=n;  i++){
//            System.out.print(a+ " ");
//            a+=d;
//        }
//    }
//}

// Q: Display this GP-1,2,4,8,16,32,....... upto "n" term.
//import java.util.Scanner;
//public class loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        int a = 1, r = 2;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//            a *= r;
//        }
//    }
//}
// Q: Display this GP-3,12,48,....... upto "n" terms.
//import java.util.Scanner;
//public class loop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        int a = 3, r = 4;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//            a *= r;
//        }
//    }
//}

// Q: WAP to check if a number is prime or compositive number .
// import java.util.Scanner;
// public class loop{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter a number : ");
//         int n = sc.nextInt();
//         boolean flag = false;
//         for( int i = 2; i < n ; i++) {
//             if (n % i == 0) {
//                 flag = true;
//                 break;
//             }
//         }
//if(n==1)
//    System.out.println(" Neither prime nor compositive ");
//else if ( flag == false)
//    System.out.println(" Prime number ");
//else
//    System.out.println("compositive number ");
//     }
// }

// Q: WAP to print odd number from 1 to 100 with continue.

//public class loop {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++){
//            if (i % 2 == 0)  continue;
//                System.out.println(i);
//            }
//        }
//    }

//public class loop{
//    public static void main(String[]args) {
//        int i = 5;
//        do {
//            System.out.println(i);
//
//            i++;
//        }
//        while(i<=2);
//    }
//}
// Predict the output

//public class loop {
//    public static void main(String[] args) {
//        int x = 1;
//        while(x==1)
//            x = x - 1;
//        System.out.println(x);
//    }
//}
// Q: predict the output.
//public class loop{
//    public static void main(String[] args) {
//        int x  =4, y = 0;
//        while(x>=0){
//            x--;
//            y++;
//            if(x==y)
//                continue;
//            else{
//                System.out.println(x +" "+y  );
//            }
//        }
//    }
//}
// Q: WAP to count digits of a given numbers.
//import java.util.Scanner;
//public class loop{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter a number : ");
//        int n = sc.nextInt();
//        int count = 0;
//        while(n!=0) {
//            n = n/10;
//            count++;
//        }
//        System.out.println(count);
//    }
//}

// Q: print I Love You "n" times.Take "n" as input from user.
// Q: print number from 1 to 10.
// Q: print number from 73 to 829.
// Q: print number from 73 to 829.
// Q: print number from 1 to n.
// Q: print all the even number from 1 to 100.
// Q: Q: print all the odd number from 1 to 100.
// Q: print all the number from 1 to 100 which are divisible by 3.
// Q: print the table of 19.
// Q: print the table of "n".here "n"is a integer which user will input.
// Q: Print number from 10 to 1.
// Q: print all the even number from 1 to 100 method 2.
// Q: print all the odd number from 1 to 100 method 2.
// WAP 100 to 1 by divisible by 3.
//  Q: Display this AP-1,3,5,7,9......... upto "n" terms.
// Q: Disply this AP- 4,7,10,13,16............. upto "n" terms.
// Q: Disply this AP- 4,7,10,13,16............. upto "n" terms method 2.
// Q: Display this GP-1,2,4,8,16,32,....... upto "n" term.
// Q: Display this GP-3,12,48,....... upto "n" terms.
// Q: WAP to check if a number is prime or compositive number .
// Q: WAP to print odd number from 1 to 100 with continue.
// Predict the output
//

// Q: predict the output.
// /public class loop{
//    public static void main(String[] args) {
//       int x  =4, y = 0;
//     while(x>=0){
//           x--;
//           y++;
//            if(x==y)
//               continue;
//          else{
//              System.out.println(x +" "+y  );
//          }
//       }
//    }
//}
