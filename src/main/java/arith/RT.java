package arith;

public class RT {

    public static int succ(int n) {
        return n + 1;
    }

    public static int pred(int n) {
        if(n == 0) {
            return 0;
        } else {
            return n - 1;
        }
    }

    public static boolean isZero(int n) {
        return n == 0;
    }
}


