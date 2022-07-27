package com.javacodesnippets;

import java.util.List;

import com.javacodesnippets.util.Employee;

/**
 * Hello world!
 *
 */
public class IsEmptyForList
{
   public static void main(String[] args)
   {
      TestMethod();
   }

   private static void TestMethod()
   {
      System.out.println("Hello World!");
      Employee emp = new Employee("RD", 5);
      Employee emp1 = new Employee("EC", 7);

      // List<Employee> data = new ArrayList<Employee>();
      List<Employee> data = null;

      // data.add(emp);
      // data.add(emp1);

      // Employee emp3 = data.get(0);

      // emp3.setName("ORG");

      if (data.isEmpty())
      {
         System.out.println("List is Empty");
      }
      else
      {
         System.out.println("List is NOT Empty");
      }

      // System.out.println(data);
   }
}
