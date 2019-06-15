public class DSTests {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        System.out.println(list);
        System.out.println(list.size());
        list.add("2.35");
        list.add("7.321");
        System.out.println(list);
        System.out.println(list.size());
        list.add("6.23");
        list.add("2.23");
        list.add("4.35");
        list.add("5.35");
        System.out.println(list);
        System.out.println(list.size());
        list.remove("5.35");
        list.remove("100.0");
        System.out.println(list);
        System.out.println(list.size());
    }
}
