public class Factorial {
    public static void main(String[] args)
    {
        System.out.println(factIterative(10));
        System.out.println(factRecusrion(10));
    }

    /**
     * this is an iterative approach.
     * @param n
     * @return
     */
    public static int factIterative(int n)
    {
        int res =1;
        for(int i=1;i<=n;i++)
        {
            res = res * i;
        }
        return res;
    }

    public static int factRecusrion(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factRecusrion(n-1);
        }
    }
}
