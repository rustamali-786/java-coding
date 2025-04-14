          // Square/Rectangles

// Q 1: print star   *****
 //                  *****
//                   *****

//public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1; i<=3;i++){
//            System.out.println("*****");
//        }
//    }
//}

// Q 2. print star input from user.

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter number of rows : ");
//        int m = sc.nextInt();
//       System.out.println(" enter a number of colums : ");
//       int n = sc.nextInt();
//        for(int i = 1; i<=m;i++){
//            for(int j = 1; j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//    }
//}

// Q:3. print the given pattern.
//       1234
//       1234
//       1234
//       1234

//public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1; i<=4;i++){
//            System.out.println("1234");
//        }
//    }
//}

//   agar yahi user jab 1234... tak print karne ke liye bole to aur kitna lines (rows) lets do this.................

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a rows : ");
//        int m = sc.nextInt();
//        System.out.print(" enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1;i <=m;i++){
//            for(int j = 1; j<=n;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

// Q:4. print this.
//     1 1 1 1
//     2 2 2 2
//     3 3 3 3
//     4 4 4 4

//public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1;i<=4;i++){
//            for(int j = 1; j<=4;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//    }
//}

// agar yahi user input liya to..................................................................................

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" enter a rows : ");
//        int m = sc.nextInt();
//        System.out.print(" enter a colums : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=m;i++){
//            for(int j = 1; j<=n;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }
//}

// Q:5. print the given pattern.
//  A B C D
//  A B C D
//  A B C D
//  A B C D
//public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1; i<=4; i++){
//            for(int j = 65; j<=68; j++ ){
//                System.out.print((char)j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// user se input lets do this..............................................................................

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" enter a rows : ");
//        int m = sc.nextInt();
//        System.out.print(" e nter a number from 65 to 90 : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=m; i++){
//            for(int j = 65; j<=n; j++){
//                System.out.print((char)j + " ");
//            }
//            System.out.println();
//        }
//    }
//}


                 // Star tringle

// Q:1.print the given pattern.

//          *
//          * *
//          * * *
//          * * * *
//

//public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1; i<=4;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//          yahi user se input liya to..........................................................................

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//       // System.out.print(" Enter a  rows : ");
//       // int m = sc.nextInt();
//        System.out.print(" Enter a number  : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//                          ractungle number



// Q2. print the given pattern
//          1
//          1 2
//          1 2 3
//          1 2 3 4
//public class pattern_printing {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//                yahi n times print larna hoga tab...............................................................


//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// Q2. print the given pattern
////        A
//          A B
//          A B C
//          A B C D

//          n times print karna hoga
//import java.util.Scanner;
//public class pattern_printing {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number between 1 to 26 : ");
//       int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char)(j+64)+ " " );
//            }
//            System.out.println();
//        }
//    }
//}



//          Alphanumeric Tringle

//
//          Q3. Print the given pattern n times.
//
//          1
//          A B
//          1 2 3
//          A B C D
//          1 2 3 4 5
//


//          import java.util.Scanner;
//          public class pattern_printing{
//              public static void main(String[] args) {
//                  Scanner sc = new Scanner(System.in);
//                  System.out.print(" Enter a number : ");
//                          int n = sc.nextInt();
//                  for(int i = 1; i<=n;i++){
//                      for(int j= 1;j<=i;j++){
//                          if(i%2!=0){
//                              System.out.print(j+" ");
//                          }
//                          else{
//                              System.out.print((char)(j+64)+ " ");
//                          }
//                      }
//                      System.out.println();
//                  }
//              }
//          }




          //            Star Tringle Ulta

//                   Q4. print the given pattern
//
//
//                               * * * *
//                               * * *
//                               * *
//                               *

//public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1;i<=4;i++){
//            for(int j = 1;j<=5-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//          yahi user nse input yani n times...................................................................


//          import java.util.Scanner;
//          public class pattern_printing {
//              public static void main(String[] args) {
//                  Scanner sc = new Scanner(System.in);
//                  System.out.print(" Enter a number : ");
//                  int n = sc.nextInt();
//                  for (int i = 1; i <= n; i++) {
//                      for (int j = 1; j <= n + 1 - i; j++) {
//                          System.out.print("* ");
//                      }
//                      System.out.println();
//                  }
//              }
//          }


 // Q5. print the given pattern.

//         1 2 3 4
//         1 2 3
//         1 2
//         1

//public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1; i<=4;i++){
//            for(int j = 1; j<=5-i;j++ ){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

          //  for n times......................................................................................
//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n =sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j = 1; j<=n+1-i;j++ ){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// Q6. print the given pattern.

//        A A A A A
//        2 2 2 2
//        C C C
//        4 4
//        E
//
//
//          public class pattern_printing{
//    public static void main(String[] args) {
//        for(int i = 1; i<=5;i++){
//            for(int j = 1; j<=8-i;j++){
//                if(i%2!=0) System.out.print((char)(i+64) + " ");
//                else System.out.print(i+" ");
//                }
//            System.out.println();
//            }
//        }
//    }

          // yani n times tab...............................................................................

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n ; i++ ){
//            for(int j = 1; j <= n + 1 - i ; j++ ) {
//                if(i % 2 != 0) System.out.print( (char) (i+64) + " ");
//                else System.out.print( i+ " " );
//            }
//            System.out.println();
//        }
//    }
//}

// Q7. print the given pattern.

//        A B C D
//        A B C
//        A B
//        A
//

//          public class pattern_printing{
//    public static void main(String[] args) {
//        for(int  i = 1; i<=4; i++){
//            for(int j = 1; j<=5-i;j++){
//                System.out.print((char)(j+64) + " ");
//
//            }
//            System.out.println();
//        }
//    }
//}

//             n times user se.............................................................................

//      import java.util.Scanner;
//      public class pattern_printing{
//          public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);
//              System.out.print(" Enter a number : ");
//              int n = sc.nextInt();
//              for(int i = 1;i<=n;i++){
//                  for(int j = 1; j<= n + 1 - i; j++){
//                      System.out.print((char) (j+64) + " ");
//
//                  }
//                  System.out.println();
//              }
//          }
//      }


// Q8. print the fiven pattern

//           1
//           1 3
//           1 3 5
//           1 3 5 7
//
//          public class pattern_printing{
//              public static void main(String[]args){
//                  for(int i = 1; i<=4;i++){
//                      for(int j = 1;j<=i;j++){
//                          System.out.print(2 * j - 1 + " ");
//                      }
//                      System.out.println();
//                  }
//              }
//}

//          yahi user se n times print karna ha tab............................................................
//
//          import java.util.Scanner;
//          public class pattern_printing{
//              public static void main(String[] args) {
//                  Scanner sc = new Scanner(System.in);
//                  System.out.print(" Enter a number : ");
//                  int n = sc.nextInt();
//                  for(int i = 1; i <= n; i++ ){
//                      for(int j = 1; j <=  i ; j++ ){
//                          System.out.print( (2 * j)  - 1 + " " );
//                      }
//                      System.out.println();
//                  }
//              }
//          }

//
//          Q.9. Print the given pattern (Floyds Tringle).
//
//
//          1
//          2 3
//          4 5 6
//          7 8 9 10
//

//public class pattern_printing{
//    public static void main(String[] args) {
//           int a = 1;
//        for(int i = 1; i<=4;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print(a + " ");
//                a++;
//            }
//            System.out.println();
//        }
//    }
//}

//          n times............................................................................
//
//          import java.util.Scanner;
//          public class pattern_printing{
//              public static void main(String[] args) {
//                  Scanner sc = new Scanner(System.in);
//                  System.out.print(" Enter a number : ");
//                  int n = sc.nextInt();
//                  int a = 1;
//                  for(int i = 1; i<=n;i++){
//                      for(int j  =1; j<=i;j++){
//                          System.out.print(a + " ");
//                         // if(a<10) System.out.print(" ");
//                          a++;
//                      }
//                      System.out.println();
//                  }
//              }
//          }


// Q10. pattern the given pattern. n times
//
//          1
//          0 1
//          1 0 1
//          0 1 0 1
//          1 0 1 0 1
//

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                if(i%2!=0){
//                    if(i%2!=0){
//                        System.out.print(1+" ");
//                    }
//                    else{
//                        System.out.print(0+" ");
//                    }
//                }
//                else{
//                    if(j%2==0){
//                        System.out.print(1+" ");
//                    }
//                    else{
//                        System.out.print(0+" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//          isi ko aur easy (logic build).............................................................

//
//          import java.util.Scanner;
//public class pattern_printing {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
//                    System.out.print(1 + " ");
//                } else {
//                    System.out.print(0 + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//          aur isi ko easy logoc..............................................................



//import java.util.Scanner;
//public class pattern_printing {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter a number :  ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if ((i + j) % 2 == 0)
//                    System.out.print(1 + " ");
//
//                else {
//                    System.out.print(0 + " ");
//                }
//
//                }
//            System.out.println();
//            }
//        }
//    }

//Q11. print the given pattern.
//
//           # # * # #
//           # # * # #
//           * * * * *
//           # # * # #
//           # # * # #

//import java.util.Scanner;
//public class pattern_printing {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter a number : ");
//        int n = sc.nextInt();
//        int midd = n / 2 + 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == midd || j == midd) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("# " );
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//Q12. print the given pattern.
//
////
//                       *
//                       *
//                       *
//                       *
//               * * * * * * * * *
//                       *
//                       *
//                       *
//                       *


//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        int midd = n/2+1;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <=n; j++){
//                if( (i==midd) || (j==midd) ){
//                    System.out.print("*"+" ");
//                }
//                else{
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//          print the given pattern n tims...................................................................
//

//                       * * * * * * * * * * *
//                       *                   *
//                       *                   *
//                       *                   *
//                       *                   *
//                       *                   *
//                       * * * * * * * * * * *
//


//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a row  : ");
//        int m = sc.nextInt();
//        System.out.println(" Enter a column : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= m;i++){
//            for(int j = 1; j <=n;j++){
//                if(i == 1 || i == m || j == 1 || j == n){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//        }
//
//           }
//           System.out.println();
//        }
//    }
//}
//    print the given pattern....... n times..............................

//
//             *       *
//               *   *
//                 *
//               *   *
//             *       *


//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j  =1; j <= n; j++){
//                if(i==j || i+j== n + 1) {
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//          print the given pattern star tringle reverse n times (method 1 ye square dhacha hai)...........................
//
//        *
//      * *
//    * * *
//  * * * *
//
//          import java.util.Scanner;
//          public class pattern_printing{
//              public static void main(String[] args) {
//                  Scanner sc = new Scanner(System.in);
//                  System.out.print(" Enter a number : ");
//                  int n = sc.nextInt();
//                  for(int i = 1; i <= n; i++){
//                      for(int j = 1; j <=n; j++){
//                          if(i + j > n){
//                              System.out.print("* ");
//                          }
//                          else{
//                              System.out.print("  ");
//                          }
//                      }
//                      System.out.println();
//                  }
//              }
//          }


//          method 2 star tringle. n times..................................mathod isse relative hi ham banayege
//          method 1 se nahi isme to ham prin karde rahe hai but aage 1,2,3 ke form aaye to methid 1 se nahi hoga
//          isliye ye hi method yaad kar lete hai

//
//          import java.util.Scanner;
//          public class pattern_printing{
//              public static void main(String[] args) {
//                  Scanner sc = new Scanner(System.in);
//                  System.out.print(" Enter a number : ");
//                  int n = sc.nextInt();
//                  for(int i = 1; i <= n;i++){
//                      for(int j = 1; j <= n-i;j++){
//                          System.out.print(" "+" ");
//                      }
//                      for(int j =1; j<=i;j++){
//                          System.out.print("*"+" ");
//                      }
//                      System.out.println();
//
//                  }
//
//              }
//          }
//
//

//          print the given pattern.
//
//             1
//           1 2
//         1 2 3
//       1 2 3 4


//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j =1; j <= n - i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j = 1; j <= i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

// agar 1,2,3 ke jagah char  puche to (char)(j+64) kar denge

//print the given pattern Rhombus.
//
//
//         * * * *
//       * * * *
//     * * * *
//   * * * *

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j = 1; j <=n-i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j = 1; j<=n;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//print the (star pyramid) n times.........

//          *
//        * * *
//      * * * * *
//     * * * * * * *

//          import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j = 1;j <= n-i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j = 1; j <= 2 * i - 1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//         isi ko nsp and nst method se kar sakte hai without math ke


//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        int nsp = n - 1, nst = 1;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j<=nsp;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j = 1; j <= nst;j++){
//                System.out.print("*"+" ");
//            }
//            nsp--;
//            nst+=2;
//            System.out.println();
//        }
//    }
//}

//print the given pattern. number pyramid


//                    1
//                  1 2 3
//                1 2 3 4 5
//              1 2 3 4 5 6 7


//public class pattern_printing{
//    public static void main(String[]args){
//    for(int i = 1; i<=4;i++){
//        for(int j = 1; j <= 4 - i; j++){
//            System.out.print(" "+" ");
//
//        }
//        for(int j = 1; j <= 2 * i - 1;j++){
//            System.out.print(j+" "); // for char ke liye (char)(64+j)+" "
//        }
//        System.out.println();
//    }
//    }
//          }


//print the given pattern.

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *
//

//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <=n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(" "+" ");
//            }
//            for(int j = 1; j <= n + 1 - i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//isi ko nsp and nst se karete hai..............................................................


//import java.util.Scanner;
//public class pattern_printing{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        int nsp = 0, nst = n;
//        for(int i = 1; i <= n;i++){
//            for(int j = 1; j <= nsp;j++){
//                System.out.print(" "+" ");
//
//            }
//            for(int j = 1; j <= nst; j++){
//                System.out.print("*"+" ");
//            }
//            nsp++;
//            nst--;
//            System.out.println();
//        }
//    }
//}

//print the given pattern.

//           *
//         * * *
//       * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *
//


import java.util.Scanner;
public class pattern_printing{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;
        for(int i = 1; i <= n;i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");

            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }

        nsp = 1;
        nst = 2 * n - 3;
        for(int i = 1; i <= n-1;i++) {
               for(int j= 1; j <=nsp;j++){
                   System.out.print(" "+" ");
               }
               for(int j = 1; j <= nst;j++){
                   System.out.print("*"+" ");
               }
               nsp++;
               nst-=2;
               System.out.println();
           }
        }
    }
























