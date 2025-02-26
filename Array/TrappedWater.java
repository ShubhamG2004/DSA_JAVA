class TrappedWater{
    static void trapWater(int[] height){
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];
        int n=height.length;

        int max=height[0];
        leftmax[0] = height[0];
        

        for(int i =1;i<n;i++){
            if(height[i]>max){
                max=height[i];
            }
            leftmax[i] = Math.max(height[i],max);
        }

        rightmax[n-1] = height[n-1];
        max=height[n-1];
        for(int i=n-1;i>=0;i--){
            if(height[i]>max){
                max=height[i];
            }
            rightmax[i] = Math.max(max,height[i]);
        }
        
        int trappedWater = 0;

        for(int i=0;i<n;i++){
            int water = (Math.min(leftmax[i],rightmax[i])) - height[i];
            trappedWater += water;
        }
        System.out.println();
        System.out.println(trappedWater);
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        trapWater(height);
    }
}