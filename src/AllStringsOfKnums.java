import java.util.Arrays;

public class AllStringsOfKnums {
    static int a[];

    public static void main(String[] args)
    {
        int n=7;
        a = new int[n];
        printOf(n,4);
    }

    public static void printOf(int n,int k)
    {
        if(n<1)
        {
            System.out.println(Arrays.toString(a));
            return;
        }
        for(int i =0;i<k;i++)
        {
            a[n-1] = i;
            printOf(n-1 , k);
        }
    }
}
