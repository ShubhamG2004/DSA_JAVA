import java.util.Scanner;

class String1{

    static boolean palidrone(String s, int l, int r)
    {
        if(l>=r){
            return true;
        }
        return (s.charAt(l)==s.charAt(r) && palidrone(s, l+1, r-1));
    }
    static String RemoveOccurance(String s, int idx){
        if(idx>=s.length()) return "";

        String smallans= RemoveOccurance(s, idx+1);

        char currentidx = s.charAt(idx);

        if(currentidx != 'a')
        {
            return currentidx + smallans;
        }
        else{
            return smallans;
        }

    }

    static String reverse(String ans, int idx){
        if(idx >= ans.length())
        return "";

        String smallans = reverse(ans, idx+1);

        return smallans + ans.charAt(idx);
    }
    public static void main(String[] args) {
        // String ans = "shubham";

        Scanner sc =new Scanner(System.in);
        String ans = sc.nextLine();
        System.out.println("Reverse String");
        System.out.println(reverse(ans, 0));  

        System.out.println("Palidrone or not");
        System.out.println(palidrone(ans,0,ans.length()-1));

        System.out.println("Remove Occurance");
        System.out.println(RemoveOccurance(ans,0));

    }
}