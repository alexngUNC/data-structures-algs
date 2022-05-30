import java.util.Arrays;

public class swapEnds {
    int size;
    int[] D = new int[size];

    public swapEnds(){}

    public static int del_f() {
        D = Arrays.copyOfRange(D, 1, D.length);
        return D[0];
    }

    public static void main(String args[]) {
        D.del_f();
    }
}
