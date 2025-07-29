public class array2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[][] shub = {{13,6,24},{23,9,54},{43,23,54}};
        

        System.out.println(shub[0]);
        System.out.println(shub[1]);
        System.out.println(shub[2]);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+shub[i][j] +" ");
                System.out.println();
            }
        }
        
    }
}
