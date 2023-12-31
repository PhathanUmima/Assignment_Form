import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main {
   public static void main(String args[]) {
      Main obj = new Main();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Roman Number in capital letters of I and X: ");
      String inputRoman= sc.nextLine();
      System.out.println("The Integer value of given Roman number is:"+obj.romanToInt(inputRoman));
   }
   int NumValue(char rom){
      if (rom == 'I')
         return 1;
      if (rom == 'V')
         return 5;
      if (rom == 'X')
         return 10;
      return -1;
   } 
   int romanToInt(String str) {
      int sum = 0;
      for (int i=0; i<str.length(); i++) {
         int s1 = NumValue(str.charAt(i));
         if (i+1 <str.length()) {
            int s2 = NumValue(str.charAt(i+1));
            if (s1 >= s2) {
               sum = sum + s1;
            }
            else {
               sum = sum - s1;
            } 
         }
         else {
            sum = sum + s1;
         } 
      }
      return sum;
   } 
}
