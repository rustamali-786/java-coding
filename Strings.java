/*
Q. count the number of vowels in a given string.
 */
/*
import java.util.Scanner;
public class Strings {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char here: =>");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
            System.out.println("vowel number is " + count);
        }
    }

 */
/*
public class Strings {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(palin(x));
    }
    public static boolean palin(int x){
        if( x < 0) return false;
        int Ori = x;
        int rev = 0;
        while( x != 0){
            int digits = x%10;
            rev = rev * 10 + digits;
            x = x/10;
        }
        if( Ori == x) return true;
        else return false;
    }
}

 */

/*
Q. print all substring.
 */
/*
public class Strings {
    public static void main(String[] args) {
        String str = "Rustam";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.print(str.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}

 */

/*
Q. reverse string.
 */
/*
public class Strings {
    public static void main(String[] args) {
        String s = "Rustam";
        StringBuilder sb = new StringBuilder(s);
      //  sb.reverse();
        int i = 0, j = sb.length()-1;
        while(i <= j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}

 */













































