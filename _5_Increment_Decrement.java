public class _5_Increment_Decrement {

    public static void main(String[] args) {

        // =========================================
        // INCREMENT OPERATORS
        // =========================================

        // POST INCREMENT (x++)
        // First use value, then increase

        int a = 10;

        System.out.println(a++); // 10
        // a becomes 11 after printing

        System.out.println(a);   // 11


        // PRE INCREMENT (++b)
        // First increase, then use value

        int b = 20;

        System.out.println(++b); // 21
        // b becomes 21 before printing

        System.out.println(b);   // 21


        // =========================================
        // DECREMENT OPERATORS
        // =========================================

        // POST DECREMENT (x--)
        // First use value, then decrease

        int c = 30;

        System.out.println(c--); // 30
        // c becomes 29 after printing

        System.out.println(c);   // 29


        // PRE DECREMENT (--d)
        // First decrease, then use value

        int d = 40;

        System.out.println(--d); // 39
        // d becomes 39 before printing

        System.out.println(d);   // 39


        // =========================================
        // MIXED EXAMPLES
        // =========================================

        int x = 5;

        int y = x++; // first assign, then increment

        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 5


        int p = 5;

        int q = ++p; // first increment, then assign

        System.out.println("p = " + p); // 6
        System.out.println("q = " + q); // 6

    }
}