abstract class A{
    abstract void Demo();
    abstract void Test();
}

abstract class B extends A{
    void Demo(){
        System.out.println("Demo Method");
    }

    void Test(){
        System.out.println("Test Method");
    }
    
    abstract void Sample();
}

class C extends A{
    void Demo(){
        System.out.println("Demo method 1");
    }
    void Test(){
        System.out.println("Test method 1");
    }
}

class D extends B{
    void Sample(){
        System.out.println("Sample method");
    }
}
public class abstractclass2 {
    public static void main(String [] args){
        D d1 = new D();
        d1.Sample();
        C c1 = new C();
        c1.Demo();
        c1.Test();
    }
    
}
