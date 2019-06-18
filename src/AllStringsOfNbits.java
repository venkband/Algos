import java.util.Arrays;

public class AllStringsOfNbits {
    static int a[] ;
    public static void main(String[] arga)
    {
        int n=8;
        a = new int[n];
        printBits(n);
    }

    public static void printBits(int n)
    {
        if(n<1)
        {
            System.out.println(Arrays.toString(a));
            return;
        }

        a[n-1] = 0;
        printBits(n-1);

        a[n-1] = 1;
        printBits(n-1);
    }
}
