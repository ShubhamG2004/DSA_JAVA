class Question4{
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();

        int[] testCases = {1, 2, 3, 4, 16, 18, 0, -8};

        for (int testCase : testCases) {
            System.out.println(testCase + " -> " + question4.isPowerOfTwo(testCase));
        }
    }
}