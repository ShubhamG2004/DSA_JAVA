class algebra{
    int a,b;
    algebra(int x, int y)
    {
        System.out.println("Hello Shubham!!!");
        a=x;
        b=y;
    }
    int add()
    {
        return a+b;
    }
    int sub()
    {
        return a-b;
    }
    int mul()
    {
        return a*b;
    }
    int div()
    {
        return a/b;                                                                                                                                                                                                                                      
    }
}

public class constru {
    public static void main(String []args)
    {
        algebra a= new algebra(9,7);
        System.out.println(a.add());
        System.out.println(a.sub());
        System.out.println(a.mul());
        System.out.println(a.div());
    }
}
