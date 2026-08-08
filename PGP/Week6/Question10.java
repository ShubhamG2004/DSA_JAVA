import java.util.Stack;

class Question10 {
    public int celebrity(int[][] mat) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

        // Push all people
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Eliminate non-celebrities
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (mat[a][b] == 1) {
                // a knows b, so a can't be celebrity
                st.push(b);
            } else {
                // a doesn't know b, so b can't be celebrity
                st.push(a);
            }
        }

        int candidate = st.pop();

        // Verify candidate
        for (int i = 0; i < n; i++) {
            if (i == candidate) continue;

            if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }
}