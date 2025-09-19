package OOP.PolyMorphism;

public class Method_Overloading {
    static class MthOveload{
        int add(int a, int b){
            return a+b;
        }

        double add(double a, double  b){
            return a+b;
        }
    }
    public static void main(String[] args) {
        // Creating the Object

        MthOveload mObj = new MthOveload();
        int intAdd = mObj.add(12,12);
        double douAdd = mObj.add(23.1, 12.2);

        System.out.println(intAdd);
        System.out.println(douAdd);
    }
}
