// Tyoes of loop
// there are 3 types of loop
// 1. while loop
// 2. For loop
// 3. Do while loop
// Q: print hello world "n" times.Take "n" as input from user.
//import java.util.Scanner;
//public class loop{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//        int n = sc.nextInt();
//        for(int i = 1 ; i <=n ; i++){
//            System.out.println(" i love you ");
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
public class loop{
    public static void main(String[]args){
        for(int i = 19; i<=190; i= i + 19){
            System.out.println(i);
        }
    }
}