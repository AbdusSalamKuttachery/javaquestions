package com.javacodesnippets;

//import java.math.BigInteger;

public class LeadingZeroesInFactorial
{

   public static void main(String[] args)
   {
      int num = 1;
      for (int i = 5; i < 30; i++)
      {

         System.out.print(i + " /" + fact(i) + "/");

      System.out.println(Math.floor(i / 5));
   }

   }

   public static long fact(int a)
   {

      long fact = 1L;

      for (int i = 0; i < a; i++)
      {
         fact = fact * (i + 1);
      }
      return fact;

   }

}
