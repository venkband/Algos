public class StringReverse {
    public static void main(String[] args)
    {
        String str = "asdfghjklmnbvc";
        StringBuffer res = new StringBuffer();
        res.append(str);
        System.out.println(res.reverse());//using inbuilt function.

        //System.out.println(str.toUpperCase());
        //System.out.println(str);

        String res1 = new StringReverse().stringreverse(str);
        System.out.println(res1);
    }

    /**
     * reverse a string without using inbuilt method.
     * @param a
     * @return
     */
    String stringreverse(String a)
    {
        String temp="";
        for(int i=a.length()-1;i>=0;i--)
        {
            temp = temp + a.charAt(i);
        }
        return temp;
    }
}
