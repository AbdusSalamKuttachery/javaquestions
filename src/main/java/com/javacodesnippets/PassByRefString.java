package com.javacodesnippets;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class PassByRefString
{
   public static void main(String[] args)
   {
      TestMethod();
   }

   private static void TestMethod()
   {
      System.out.println("Hello World!");

      List<String> data = new ArrayList<>();

      data.add("RD");
      data.add("EC");

      String strValue = data.get(0);

      strValue = "ORG";

      System.out.println(data);
   }
}
