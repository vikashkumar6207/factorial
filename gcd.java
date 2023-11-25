public class gcd {

    // // GCD
    public static int greatestCD(int a, int b) {
    while (b != 0) {
    int fact = a % b;
    a = b;
    b = fact;
    }
    return a;
    }

    // // LCM
    public static int Lcm(int a, int b) {
    return (a * b) / greatestCD(a, b);
    }

    public static void main(String[] args) {
        int arr = greatestCD(273, 315);
        System.out.println(arr);
        int lcm = Lcm(2652, 3060);
        System.out.println(Lcm(18, 24));
        System.out.println(lcm);
        
    }

}
