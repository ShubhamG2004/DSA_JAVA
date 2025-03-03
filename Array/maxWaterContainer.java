class maxWaterContainer{
    public static int maxContiner(int[] height){
        int n = height.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int width = j-i;
                int h = Math.min(height[i],height[j]);
                int area = width * h;
                ans = Math.max(ans,area);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        int k =maxContiner(height);

        System.out.println(k);
    }
}