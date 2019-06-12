public class Searching {
    public static void main(String[] args)
    {
        int sear[] = {10,2,45,65,0,7,32,-1};
        int binarsear[] = {10,20,23,34,45,65};

        System.out.println(linearSearch(sear,-1));
        System.out.println(binaryIterativeSearch(binarsear,100));
        System.out.println(binaryRecursiveSearch(binarsear,100 , 0 , binarsear.length));
    }

    /**
     * T = O(n)
     * @param a
     * @param ele
     * @return
     */
    public static int linearSearch(int a[] , int ele)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * T=O(logn)
     * @param b
     * @param ele
     * @return
     */
    public static int binaryIterativeSearch(int b[] ,int ele)
    {
        int left=0;
        int right=b.length;

        while(left < right)
        {
            int mid =(left + right)/2;
            if(b[mid] == ele)
            {
                return mid;
            }
            else if(b[mid] > ele)
            {
                right = mid-1;
            }
            else if (b[mid] < ele)
            {
                left = mid+1;
            }
        }
        return -1;
    }

    /**
     * T=O(logn)
     * @param a
     * @param ele
     * @param left
     * @param right
     * @return
     */
    public static int binaryRecursiveSearch(int a[] , int ele , int left, int right)
    {
        if(left >= right)
        {
            return -1;
        }
        int mid = (left + right)/2;
        if(a[mid] == ele)
        {
            return mid;
        }
        else if(a[mid] > ele)
        {
            return binaryRecursiveSearch(a,ele , left , mid-1);
        }
        else
        {
            return binaryRecursiveSearch(a,ele,mid+1,right);
        }
    }
}
