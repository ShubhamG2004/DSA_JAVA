class MergeTwoLinkedList{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if(list1 != null) {
            current.next = list1;
        }

        if(list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoLinkedList merger = new MergeTwoLinkedList();

        // list1: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // list2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode merged = merger.mergeTwoLists(list1, list2);
        // print merged list
        while (merged != null) {
            System.out.print(merged.val + (merged.next != null ? " -> " : ""));
            merged = merged.next;
        }
        System.out.println();
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}