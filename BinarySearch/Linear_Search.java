import java.util.ArrayList;

class Linear_Search{

    static ArrayList<Integer> allIndexices(ArrayList<Integer> a,int n, int target, int idx){
        ArrayList<Integer> ans= new ArrayList<>();
        if(idx>=n) return ans;

        if(a.get(idx)==target)
        {
            ans.add(idx);
        }

        ArrayList<Integer> smallans = allIndexices(a, n, target, idx+1);
        ans.addAll(smallans);
        return ans;
        
        

    }

    static void findIndex(int[] a,int n, int target, int idx)
    {
        if(idx>=n) 
        return;

        if(a[idx]==target){
            System.out.print(idx+" ");
        }

        findIndex(a, n, target, idx+1);
    }

    static boolean search(int[] a, int n, int target, int idx){
     if(idx>=n) 
     return false;

     if(a[idx]==target){
        return true;
     }

     return search(a, n, target, idx+1);
    }
    public static void main(String []args)
    {
        int a[]={1,2,3,4,5,4};
        int target=4;
        System.out.println("Searching the Element");

        if(search(a,a.length,target,0))
        {
            System.out.println("Found!!");
        }
        else{
        System.out.println("Not Found!!");
        }

        findIndex(a, a.length, target, 0);

        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : a) {
            ans.add(num);
        }

        System.out.println(allIndexices(ans,a.length, target, 0));

    }

   
}