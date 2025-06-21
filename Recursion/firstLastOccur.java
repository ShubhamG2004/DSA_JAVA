public class firstLastOccur {
    public static void main(String[] args) {
        String arr = "abcbabc";
        findFirstLast(arr,0,'a' );
    }
    static int firstIndex = -1;
    static int lastIndex = -1;
    static void findFirstLast(String arr, int idx, char target){
        if(idx == arr.length()){
            System.out.println("First Occurrence: " + firstIndex);
            System.out.println("Last Occurrence: " +  lastIndex);
            return;
        }
        if(arr.charAt(idx) == 'a'){
            if(firstIndex == -1) {
                firstIndex = idx; 
            }
            lastIndex = idx; 
        }
        findFirstLast(arr, idx+1, target);
    }

}
