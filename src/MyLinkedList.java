public class MyLinkedList<E> {

    private MyNode head;

    public void add(E ele) {
        MyNode<E> newnode = new MyNode<E>(ele);
        if (head == null) {
            head = newnode;
        } else {
            MyNode temp = head;
            while (temp != null) {
                if (temp.next == null) {
                    temp.next = newnode;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    public void remove(E ele) {

        if (head == null) {
            return;
        }
        if (head.element.equals(ele)) {
            head = head.next;
            return;
        }
        MyNode temp1 = head;
        MyNode temp2 = temp1.next;

        while (temp2 != null) {
            if (temp2.element.equals(ele)) {
                temp1.next = temp2.next;
                return;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    }

    public int size() {
        MyNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public String toString() {
        String str = "[";
        MyNode temp = head;
        while (temp != null) {
            str = str + temp.element + ",";
            temp = temp.next;
        }
        if (str.endsWith(",")) {
            str = str.substring(0, str.length() - 1);
        }
        str = str + "]";
        return str;
    }

    public void reverseList() {
        MyNode temp = null;
        MyNode newHead = null;
        while (head != null) {
            temp=head;
            head = head.next;
            temp.next = newHead;
            newHead=temp;
        }
        head = newHead;
    }

    public boolean isLoopPresent()
    {
        MyNode temp1=head;
        MyNode temp2=head;
        do
        {
            if(temp1 != null)
            {
                temp1 = temp1.next;
            }
            else
            {
                return false;
            }
            if(temp2 != null)
            {
                temp2 = temp2.next;
                if(temp2!=null)
                {
                    temp2=temp2.next;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }while(temp1 != temp2);
        return true;
    }
}

class MyNode<E> {
    E element;
    MyNode<E> next;

    MyNode(E element) {
        this.element = element;
    }
}