abstract class A{
    abstract void Demo();
    abstract void Test();
}

class B extends A{
    void Demo(){
        System.out.println("Demo Method");
    }

    void Test(){
        System.out.println("Test Method");
    }
}
public class abstratcclass1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.Demo();
        b1.Test();        
    }
}
