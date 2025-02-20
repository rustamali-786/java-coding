package ifelse.java;
 //         Contitional Statement

//                Even Odd

//import java.util.Scanner;
//public class ie {
//   public static void main(String[]args){
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter A Number ");
//       int n = sc.nextInt();
//       if(n%2==0){
//           System.out.println("The Number Is Even");
//       }
//       if(n%2!=0){
//           System.out.println("The Number Is odd");
//       }
//   }
//}
//             Divisible By 5
//import java.util.Scanner;
//public class  ie {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter A Number  ");
//        int n = sc.nextInt();
//        if(n%5==0){
//            System.out.println("yes It Is Divisible by 5");
//        }
//        else{
//            System.out.println("No It Is Not Divisible by 5");
//        }
//    }
//}
//
//
//                Leap Year
//
//import java.util.Scanner;
//public class  ie {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter A Year ");
//        int n = sc.nextInt();
//        if((n % 4 == 0 && n % 100 != 0) || (n % 4 == 400) ){
//            System.out.println("This is Leap Year");
//        }
//        else{
//            System.out.println("This Is Not Leap Year");
//        }
//    }
//}
//// Q Take Integer input And print The Absolute Value Of that Integer.
//
//import java .util.Scanner;
//public class ie {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Inter A Integer Number ");
//        int n = sc.nextInt();
//if(n<0){
//    n = n * (-1);
//}
//        System.out.println("The Absolute Value Is " +n);
//
//
//    }
//}
/// /profit loss

////  Q. If cost price and selling price of an iteam is input through the keyboard WAP to determine whether the seller
////  has made profit or incurred loss. Also determine how much profit he made or loss he incurred.
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//public class  ie {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//          System.out.print("Enter cost Price ");
//          int cp = sc.nextInt();
//          System.out.print("Enter selling price ");
//          int sp = sc.nextInt();
//          if(sp>cp){
//              System.out.print(" your profit is ");
//              System.out.print(sp-cp);
//          }
//          else{
//              System.out.print("your loss is ");
//              System.out.println(cp-sp);
//
//              }
//
//    }
//}

//// Q. Given the length and breadth of  a rectingle WAP to find whether the area of the
////      rectungle is greater than its perimeter.

//  import java.util.Scanner;
//  public class  ie {
//      public static void main(String[]args){
//          Scanner sc =  new Scanner(System.in);
//          System.out.print("Enter here length :");
//          int length = sc.nextInt();
//          System.out.print("Enter here breadth :");
//          int breadth = sc.nextInt();
//          int Area = length * breadth;
//          int perimeter = 2 * (length + breadth);
//          if(Area>perimeter){
//              System.out.println("Area greather than perimeter");
//           }
//       else{
//              System.out.println("perimeter is greater than Area");
//          }
//      }
//}
////   Q. input length,breadth,Square or Not.
//import java.util.Scanner;
//public class  ie {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter here length :");
//        int length = sc.nextInt();
//        System.out.println("Enter here breadth");
//        int breadth = sc.nextInt();
//        if(length==breadth){
//            System.out.println("yes square");
//
//        }
//        else{
//            System.out.println("not square");
//        }
//    }
//}
//// Q. Take Input oercentge of a student and print the grade according to marks.
//// 1. 90_100 Excellent
//// 2. 80_90 very Good
//// 3. 70_80 good
//// 4. 60_70 can do better
//// 5. 50_60 Average
//// 6. 40_50 Bellow Averagew
//// 7. <40 fail
//import java.util.Scanner;
//public class ie {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Percentage :");
//        int n = sc.nextInt();
//        if(n>90){
//            System.out.print("Excellent ");
//        }
//        else if(n>80){
//            System.out.println("Very Good");
//        }
//        else if(n>70){
//            System.out.println("Good");
//        }
//        else if(n>60){
//            System.out.println("Can do better");
//        }
//        else if(n>50){
//            System.out.println("Average");
//        }
//        else if(n>40){
//            System.out.println("bellow Average");
//        }
//        else{
//            System.out.println("Fail");
//        }
//    }
//}
//// Q. Take Positive integer input and tell if it is a three digit
////   number or not.
// import java.util.Scanner;
// public class ie {
//  public static void main(String[]args){
//   Scanner sc =  new Scanner (System.in);
//   System.out.println("Enter here thre digit number :");
//   int n = sc.nextInt();
//   if(n>99 && n<1000){
//    System.out.println("This is a three digit number ");
//   }
//   else{
//    System.out.println("this is not three digit number");
//   }
//  }
// }
//// Q. Take integer Input &tell if it is a2 digit number.

//import java.util.Scanner;
//public class  ie {
// public static void main(String[]args){
//  Scanner sc = new Scanner(System.in);
//  System.out.println("Enter a Digit number : ");
//  int n = sc.nextInt();
//  if(n>9 && n<100) {
//   System.out.println("This is a two digit number ");
//  }
//  else{
//    System.out.println("This is not a two digit number ");
//   }
//  }
// }
//// Q. Take positive integer input and tell if it is divisible by 3 and 5.
//import java.util.Scanner;
//public class  ie {
// public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  System.out.println("Enter a Number : ");
//  int n = sc.nextInt();
//  if (n % 3 == 0 && n % 5 == 0) {
//   System.out.println("this is divisible by 3 and 5");
//  } else {
//   System.out.println("this is not divisible by 3 and 5 ");
//  }
// }
//}
//// Q. Take 3 positive integers input and print the greatest of them.
//import java.util.Scanner;
//public class  ie {
// public static void main(String[]args){
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter here first number : ");
//  int a = sc.nextInt();
//  System.out.print("Enter here Second number : ");
//  int b = sc.nextInt();
//  System.out.print("Enter here third number : ");
//  int c = sc.nextInt();
//  if(a>b && a>c){
//   System.out.println(a+" is largest");
//  }
// else if(b>a && b>c){
//   System.out.println(b+" is largest");
//  }
//  else{
//   System.out.println(c+" is largest");
//  }
// }
//}
//// Q. if the ages of ram,shyam and ajay are input through the
////   the keyvoard,WAP to determine the youngest of the three.
//import java.util.Scanner;
//public class  ie {
// public static void main(String[]args) {
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter here age of Ram : ");
//  int ram = sc.nextInt();
//  System.out.print("Enter here age of Shyam : ");
//  int shyam = sc.nextInt();
//  System.out.print("Enter here age of Ajay : ");
//  int ajay = sc.nextInt();
//  if(ram>shyam && ram>ajay){
//   System.out.println(ram+" Ram is youngest");
//  }
//  else if(shyam>ram && shyam>ajay){
//   System.out.println(shyam+" Shyam is youngest");
//  }
//  else{
//   System.out.println(ajay+" Ajay is youngest");
//  }
//
// }
//}
//// Q. take 3 numbers input and tell if they can be the sides of a triangle.
//import java.util.Scanner;
//public class ie {
// public static void main(String[]args){
//  Scanner sc = new Scanner (System.in);
//  System.out.print(" Enter first side : ");
//  int a = sc.nextInt();
//  System.out.print("Enter Second side : ");
//  int b = sc.nextInt();
//  System.out.print("Enter third Side : ");
//  int c = sc.nextInt();
// if(a+b>c && b+c>a && c+a>b){
//  System.out.println("Valid triangle");
// }
// else{
//  System.out.println("invalid triangle");
// }
//
// }
//}
//     Nested if else

//// Q. Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15.
// import java.util.Scanner;
// public class ie{
//  public static void main(String[]args){
//   Scanner sc = new Scanner(System.in);
//   System.out.print(" Enter a number");
//   int n = sc.nextInt();
//   if(n%3==0 || n%5==0){
//    if(n%15!=0){
//     System.out.println("The number is divisible by 3 or 5");
//    }
//    else{
//     System.out.println("The number is not divisible by3 or 5");
//    }
//   }
//    else{
//     System.out.println("no matching required condition");
//    }
//   }
//  }

 // ham ise without nested if else ke bhi kar sakte hai
//import java.util.Scanner;
//public class ie{
// public static void main(String[]args){
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter a number : ");
//  int n = sc.nextInt();
//  if((n%3==0 || n%5==0) && n%15!=0){
//   System.out.println("The number is divisible by 3 or 5 but not divisible by 15");
//  }
//  else{
//   System.out.println("The required condition not satisfied");
//  }
// }
//}
// import java.util.Scanner;
// public class ie{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a First number : ");
//         int a = sc.nextInt();
//         System.out.print("Enter a Second number : ");
//         int b = sc.nextInt();
//         System.out.print ("Enter a Third number : ");
//         int c = sc.nextInt();
//         if(a>b) {
//             if (a > c) {
//                 System.out.println(a + " a is greatest");
//             } else {
//                 System.out.println(c + " c is greatest");
//             }
//         }
//             else{
//                 if(b>c) {
//                     System.out.println(b + " b is greatest");
//                 }
//                 else{
//                         System.out.println(c + " c is greatest");
//                     }
//             }
//         }
//     }

//// Q. Take 3 positive integers input and print the greatest of them. by nested if else.

//import java.util.Scanner;
//public class ie{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a First Number : ");
//        int a = sc.nextInt();
//        System.out.println("Enter a second number : ");
//        int b = sc.nextInt();
//        System.out.println("Enter a third number : ");
//        int c = sc.nextInt();
//        if (a > b) {
//            if(a>c){
//                System.out.println(a + " is greatest");
//            }
//            else{
//                System.out.println(c+ " is greatest");
//            }
//        }
//        else{
//            if(b>c){
//                System.out.println(b+ " is greatest ");
//            }
//             else{
//                System.out.println(c+ " is greatest");
//            }
//        }
//    }
//}
 //// Q. if the ages of ram,shyam and ajay are input through the keyboard WAP to
////  determine the youngest of the three. by nested if else.

//import java.util.Scanner;
//public class ie{
//    public static void main(String[]args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" enter ram age : ");
//        int ram = sc.nextInt();
//        System.out.print(" enter shyam age : ");
//        int shyam = sc.nextInt();
//        System.out.print(" enter ajay age : ");
//        int ajay = sc.nextInt();
//        if (ram > shyam) {
//            if (ram > ajay) {
//                System.out.println(ram + " ram is youngest");
//            } else {
//                System.out.println(ajay + " eges of ajay means youngest");
//            }
//        } else {
//            if (shyam > ajay) {
//                System.out.println(shyam + " eges of shyam means  youngest ");
//            } else {
//                System.out.println(ajay + " eges of ajay means youngest ");
//            }
//        }
//    }
//}

//// Q. Given three points (x1,y1),(x2,y2),and (x3,y3),
//// WAP to check if all the three points fall on one stright line.

//import java.util.Scanner;
//public class ie{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        double x1 = 1, x2 = 2, x3 = 3, y1 = 1, y2 = 2,y3 = 3;
//        double m1 = (y2-y1)/(x2-x1);
//        double m2 = (y3-y2)/(x3-x2);
//        if(m1==m2){
//            System.out.println(" the three points lie on a single line ");
//
//        }
//        else{
//            System.out.println(" they do not lie in a straight line");
//        }
//    }
//}
// public class ie{
//    public static void main(String[] args) {
//        int x = 3;
//        double y = 3.0;
//                if(x==y)
//        System.out.println("x amd y are equal");
//        else
//        System.out.println("x and y are equal");
//
//    }
//}

//// Q WAP to print the day based on the day number.

//import java.util.Scanner;
//public class ie{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a day : ");
//        int day = sc.nextInt();
//        if(day == 1){
//            System.out.println("Monday");
//        }
//        else if(day==2){
//            System.out.println("Tuesday");
//        }
//        else if(day==3){
//            System.out.println("Wednesday");
//        }
//        else if(day==4){
//            System.out.println("Thrusday");
//        }
//        else if(day==5){
//            System.out.println("Friday");
//        }
//        else if(day==6){
//            System.out.println("Saturday");
//        }
//        else if(day==7){
//            System.out.println("Sunday");
//        }
//        else{
//            System.out.println("not valid day ");
//        }
//    }
//}

//// isi ko easy karne ke liye (switch case) la use karte hai.

//import java.util.Scanner;
//public class ie{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int day = sc.nextInt();
//        switch (day)   {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not a valid day");
//
//        }
//    }
//
//}
