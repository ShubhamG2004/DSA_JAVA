package round2;

public class PrTwo {

    public static int minHours(int[] piles, int h){
        int res = 0;
        int max = piles[0];
        for(int i : piles){
            if(i > max) max = i;
        }
        for(int curr = 1; curr <= max; curr++){
            int totalHrs = 0;
            for(int i = 0; i < piles.length; i++){
                int bananas = piles[i];
                if(bananas % curr == 0){
                    totalHrs += bananas / curr;
                } else {
                    totalHrs += (bananas/curr) + 1;
                }
            }

            if(totalHrs <= h){
                return curr;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int res = minHours(piles, h);
        System.out.println(res);
    }
}
