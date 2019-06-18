public class TowersOfHanoi {

    public static void main(String[] args)
    {
        towerOfhanaiRecursive(4 ,'A','C','B'); //moving from A to C using B
    }

    public static void towerOfhanaiRecursive(int n,char from , char to,char aux)
    {
        if(n==1)
        {
            System.out.println("moving disk 1 from "+ from + " to " + to );
            return;
        }
        towerOfhanaiRecursive(n-1,from,aux,to);
        System.out.println("moving disk "+ n + " from " + from + " to " + to );

        towerOfhanaiRecursive(n-1,aux,to,from);
    }
}
