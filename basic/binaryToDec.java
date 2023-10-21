import java.util.*;

public class binaryToDec{
     public static void BinaryToDecimal(int n){
          int k=n;
          int i=0;
          int decimal=0;
          while(n!=0)
          {
               int digit=n%10;
               decimal=decimal+ (digit*(int)Math.pow(2,i));
               n=n/10;
               i++;
          }
        System.out.print("decimal conv of"+" "+k+" "+"is "+" "+decimal);
     }
     public static void main(String args[]){
          int n=10;
          
          BinaryToDecimal(n);
         
     }
}
