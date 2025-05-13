package com.basicMaths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.*;


public class StriverBasicMaths {

    public static void main(String[] args) {

        //System.out.println(countDigit(7789));
        //System.out.println(countDigitUsingLog(7789));
        //System.out.println(reverseNumber(7789));
        //System.out.println(checkPalindrome(798));
        //System.out.println(armStrongNumber(371));
        //allDivisorsOFGivenNumber(36);
        //System.out.println(checkPrimeNumber(36));
       // System.out.println(findGCD(11,13));
        //System.out.println(secondWayToBestApproachFindGCD(11,13));
        System.out.println(euclideanAlgorithm(52,10));

    }

    static int countDigit(int n){
        int count=0;
        while (n>0){
           n = n/10;
            count++;
        }
        return count;
    }

    static int countDigitUsingLog(int n){
        // In Above problem we divided 10 so thats why here we use log10.
        // If we divide 2 instead of using this we can use log2 log5 log6.
        // log10(n) time complexity here
        return (int) log10(n)+1;
    }

    static int reverseNumber(int n){
        int reverNumber=0;
        while (n>0){
            int rem = n%10;
            n=n/10;
            reverNumber = (reverNumber*10)+rem;
        }
        return reverNumber;
    }

      static boolean checkPalindrome(int n){
          int temp=n;
          int reverseNumber=0;
           while (n>0){
                int rem = n%10;
                n =n/10;
                reverseNumber = (reverseNumber*10)+rem;
           }
         return temp == reverseNumber;
      }


      static boolean  armStrongNumber(int n){
        int temp=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum += rem*rem*rem;
            n=n/10;
        }

        return sum==temp;
      }

      static void allDivisorsOFGivenNumber(int n){
           List<Integer> divisorsList = new ArrayList<>();
          for (int i = 1; i < sqrt(n); i++) {
                  if(n%i==0){
                      divisorsList.add(i);
                       if ((n/i)!=i){
                           divisorsList.add(n/i);
                       }
                  }
          }
          Collections.sort(divisorsList);
          for (Integer listElement: divisorsList){
              System.out.println(listElement);
          }
      }

      static boolean checkPrimeNumber(int n){
         if (n==1){
              return true;
         }
          for (int i = 2; i < sqrt(n); i++) {
               if(n%2==0){
                   return false;
               }
          }
          return true;
      }


      static int findGCD(int n1,int n2){
        int GCD=1;
          for (int i = 1; i <=min(n1, n2) ; i++) {
              if(n1%i==0 && n2%i==0){

                  if(GCD<i){
                      GCD=i;
                  }
              }
          }
          return GCD;
      }

    static int secondWayToBestApproachFindGCD(int n1,int n2){

        for (int i = min(n1, n2); i >=1 ; i++) {
            if(n1%i==0 && n2%i==0){
                  return i;
            }
        }
        return 1;
    }

     static int euclideanAlgorithm(int n1, int n2) {
        while (n1>0 && n2>0){
              if(n1>n2){
                   n1= n1%n2;
              }else {
                  n2 = n2%n1;
              }
        }
          if (n1==0)
               return n2;
        return n1;
     }

}
