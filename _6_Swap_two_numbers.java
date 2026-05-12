public class _6_Swap_two_numbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        // swap(a, b);
        // withoutthird(a, b);
        // withoutthird_type2(a,b);
        singleline(a,b);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    static void withoutthird(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    static void withoutthird_type2(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    static void singleline(int a, int b) {
        a = (a + b) - (b = a);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
