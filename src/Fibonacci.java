import javax.jnlp.IntegrationService;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    static Map<Integer , Integer> fibValues = new HashMap<Integer, Integer>();

    public static void main(String[] args)
    {
        System.out.println(simpleRecursiveFib(10));
        System.out.println(optimalRecursiveFib(10));
        System.out.println(simpleIterativeFib(10));
        System.out.println(optimalIterativeFib(10));
    }

    /**
     * T(n) = O(2^n) due to repetitive method calculations.
     * S(n) = O(2^n) due to repetitive method calls
     * @param n
     * @return
     */
    public static int simpleRecursiveFib(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return simpleRecursiveFib(n-1)+simpleRecursiveFib(n-2);
        }
    }

    /**
     * T(n) = O(n) for n calculations
     * S(n) = O(n) for n method calls and n sized map
     * @param n
     * @return
     */
    public static int optimalRecursiveFib(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            if(fibValues.containsKey(n))
            {
                return fibValues.get(n);
            }
            else
            {
                int res = optimalRecursiveFib(n-1) + optimalRecursiveFib(n-2);
                fibValues.put(n,res);
                return res;
            }
        }
    }

    /**
     * T(n) = O(n)
     * S(n) = O(n) for array
     * @param n
     * @return
     */
    public static int simpleIterativeFib(int n)
    {
        int[] res = new int[n+1];
        res[0] =1 ;res[1] =1;
        for(int i=2;i<=n;i++)
        {
            res[i] = res[i-1]+res[i-2];
        }
        return  res[n];
    }

    /**
     * O(n) = n
     * S(n) = 1
     * @param n
     * @return
     */
    public static int optimalIterativeFib(int n)
    {
        int res = 0 , a =1 , b=1;
        for(int i=2;i<=n;i++)
        {
            res = a + b;
            a=b;
            b=res;
        }
        return res;
    }
}
