package PGP.Week9;

class ListNode {
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

public class Question8 {

    // Merge K Sorted Lists
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;

        return divide(lists, 0, lists.length - 1);
    }

    // Divide and Conquer
    private ListNode divide(ListNode[] lists, int left, int right) {

        if (left == right)
            return lists[left];

        int mid = left + (right - left) / 2;

        ListNode l1 = divide(lists, left, mid);
        ListNode l2 = divide(lists, mid + 1, right);

        return merge(l1, l2);
    }

    // Merge Two Sorted Lists
    private ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if (l1 != null)
            temp.next = l1;

        if (l2 != null)
            temp.next = l2;

        return dummy.next;
    }

    // Create Linked List
    static ListNode createList(int[] arr) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for (int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }

    // Print Linked List
    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        Question8 obj = new Question8();

        // Test Case:
        // [[1,4,5],[1,3,4],[2,6]]

        ListNode l1 = createList(new int[]{1, 4, 5});
        ListNode l2 = createList(new int[]{1, 3, 4});
        ListNode l3 = createList(new int[]{2, 6});

        ListNode[] lists = {l1, l2, l3};

        System.out.println("Input Lists:");

        printList(l1);
        printList(l2);
        printList(l3);

        ListNode ans = obj.mergeKLists(lists);

        System.out.println("\nMerged List:");

        printList(ans);
    }
}