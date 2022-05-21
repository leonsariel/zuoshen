package LinkedList;

public class Common {

    public static void printCommon(ListNode alist, ListNode blist) {
        if (alist == null  && blist == null) {
            System.out.println("null");
        }

        ListNode pointer1 = alist;
        ListNode pointer2 = blist;
        while (pointer1 != null || pointer2 != null) {

            if (pointer1 == null || pointer2 == null) {
                break;
            }

            if (pointer1.val < pointer2.val) {
                pointer1 = pointer1.next;
            }

            if (pointer1.val > pointer2.val) {
                pointer2 = pointer2.next;
            }

            if (pointer1.val == pointer2.val) {
                System.out.println(pointer1.val);
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }

        }


    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        ListNode.printNode(a);

        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        three.next = four;
        four.next = five;
        five.next = null;
        

        printCommon(a, three);

    }
}
