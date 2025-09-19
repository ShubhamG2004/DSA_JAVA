package OOP.Class_Object;

public class ComplexNumber {
    static class ComplexNum{
        int a;
        int b;

        void display(){
            System.out.println(a+b+"i");
        }
    }
    public static void main(String args){
        ComplexNum obj = new ComplexNum();
        obj.a = 2;
        obj.b =12;
        obj.display();
    }
}
