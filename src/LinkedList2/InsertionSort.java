package LinkedList2;

import java.util.List;

public class InsertionSort {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = head;

        while (current != null){
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < current.val){
                prev = prev.next;
            }
            ListNode next = current.next;
            current.next = prev.next;
            prev.next = current;
            current = next;
        }
        return dummy.next;

    }
}
