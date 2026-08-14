@FunctionalInterface
interface Greeting{
    void sayHello();
}
class FunInterfaceWithoutLambda{
    public static void main(String[] args) {
        Greeting g = new Greeting(){
            public void sayHello(){
                System.out.println("Hello!");
            }
        };

        g.sayHello();
    }
}