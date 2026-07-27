import java.util.*;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public Node constructBinaryTree(int[] pre, int[] preMirror) {

        for (int i = 0; i < preMirror.length; i++) {
            map.put(preMirror[i], i);
        }

        return build(pre, preMirror, 0, pre.length - 1, 0, preMirror.length - 1);
    }

    private Node build(int[] pre, int[] preMirror,
                       int preL, int preR,
                       int mirL, int mirR) {

        if (preL > preR)
            return null;

        Node root = new Node(pre[preL]);

        if (preL == preR)
            return root;

        int leftRoot = pre[preL + 1];

        int idx = map.get(leftRoot);

        int rightSize = idx - mirL;
        int leftSize = preR - preL - rightSize;

        root.left = build(pre, preMirror,
                preL + 1,
                preL + leftSize,
                idx,
                mirR);

        root.right = build(pre, preMirror,
                preL + leftSize + 1,
                preR,
                mirL + 1,
                idx - 1);

        return root;
    }
}