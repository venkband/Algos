import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args)
    {
        int a[]={2,32321,32,134,29,432,54,541,0,-2};
        bubbleSort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static int[] bubbleSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            boolean swaps = false;
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                    swaps=true;
                }
            }
            if(swaps == false)
            {
                break;
            }
        }
        return a;
    }
}
