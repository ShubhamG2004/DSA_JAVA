package PGP.Week3;

public class Question9 {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int chunks = 0;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);

            if(max<i+1){
                chunks++;
            }
        }

        return chunks;
    }

    public static void main(String[] args) {
        Question9 question = new Question9();
        int[] arr = {1, 0, 2, 3, 4};
        System.out.println(question.maxChunksToSorted(arr));
    }
}
