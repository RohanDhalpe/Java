import java.util.*;

public class decTobinary{
     public static void DecimalToBinary(int n){
          int k=n;
          int i=0;
          int number=0;
          while(n!=0)
          {
               int rem=n%2;
               number=number+ (rem*(int)Math.pow(10,i));
               n=n/2;
               i++;
          }
        System.out.print(number);
     }
     public static void main(String args[]){
          
          DecimalToBinary(25);
          // 11001
         
     }
}

