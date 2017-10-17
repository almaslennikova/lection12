package ru.tsystems.javafortesters;

/**
 * Show different variables.
 */
public class VariblesClass {

   int classScope = 1; //if no assignment by default all integer primitives with class scope is equal to 0

   public void testScope() {
      int methodScope = 1;
      {
         int blockScope = 1;
         classScope += blockScope; //short syntax is the same as classScope = classScope + blockScope
      }
      classScope += methodScope;
      //classScope += methodScope + blockScope;
      System.out.println("classScope=" + classScope);
   }

   public class CharVariables {//some inner class

      public void test() {
         char cx = 'x';
         char cy = 'y';
         char c1 = 126;
         char c2 = 128;
         char c3 = 65535;
         char u1 = '\u0061';
         //char c4 = c3 + 1;

         System.out.println("x=y " + (cx == cy));
         System.out.println("x=x " + (cx == cy - 1));
         System.out.println("c1=" + c1);
         System.out.println("c1+1=" + (c1+1));
         System.out.println("c2=" + c2); //http://learn.parallax.com/support/reference/ascii-table-0-127
         System.out.println("c2+1=" + (c2+1));
         System.out.println("c3+1=" + (c3+1));
         System.out.println("u1=" + u1);
      }

   }

   public class IntegerVariables {

      public void test() {
         byte b = (byte) 383;
         short s = 1;
         short s2 = (short) (s + 2);
         s2 += 2; //implicit cast in action
         int whatAmI1 = 0177;
         int whatAmI2 = 0x7f;
         int whatAmI3 = 0b1111111;
         int mil = 2147483647;
         long mil2 = 2147483648l;
         int mil3 = mil + 5;
         long phoneNuber = 8_812_690_12_34l;

         System.out.println(b);
         System.out.println(s2);
         System.out.println((whatAmI1==whatAmI2) && (whatAmI1==whatAmI3));
         //System.out.println(whatAmI1);
         System.out.println(mil3);
         System.out.println(phoneNuber);
      }

   }

   public class FloatVariables {

      public void test() {
         float f1 = 1.2345f;
         double d1 = 1.2345, d2 = 12345e10-4;
         byte b1 = (byte) -129.99d;
         byte b2 = (byte) -125.99d;

         double res = (b1 - 29) / f1 * d1;

         System.out.println(f1);
         System.out.println(d1==d2);
         //System.out.println(d1);
         //System.out.println(d2);
         System.out.println("b1=" + b1);
         System.out.println("b2=" + b2);
         System.out.println(res);
      }

   }

}
