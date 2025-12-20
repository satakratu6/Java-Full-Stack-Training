import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");

         int a = sc.nextByte();  /// implicit widening (byte → int)
        System.out.println(a);

        byte b = (byte) sc.nextInt(); // explicit narrowing (int → byte)
        System.out.println(b);

        long c = sc.nextInt(); // implicit widening (int → long)
        System.out.println(c);

        int d = (int) sc.nextLong(); // explicit narrowing (long → int)
        System.out.println(d);

        short e = (short) sc.nextInt(); // explicit narrowing (int → short)
        System.out.println(e);

        int f = sc.nextShort(); // implicit widening (short → int)
        System.out.println(f);

        double g = sc.nextInt(); // implicit widening (int → double)
        System.out.println(g);

        int h = (int) sc.nextDouble();  // explicit narrowing (double → int)
        System.out.println(h);

        byte i = (byte) sc.nextShort(); // explicit narrowing (short → byte)
        System.out.println(i);

        short j = sc.nextByte();   // implicit widening (byte → short)
        System.out.println(j);


        sc.close();
    }
}
