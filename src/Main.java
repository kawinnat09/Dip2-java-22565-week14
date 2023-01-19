interface Car{
    public void methodCar();
}

interface Cat{
    public void methodCat();
}

interface A{

    public void methodA();
}

class B {
    public void methodB() {
        System.out.println("method  of class B");
    }
}

class C extends B implements A, Car{
    public void methodA(){
        System.out.println("method of interface A");
    }
    public void methodCar() {
        System.out.println("method of interface Car");
    }

    public void methodC(){
        System.out.println("method  of class C");
    }
}

class D extends B implements Cat{
    public void methodCat(){
        System.out.println("method of class Cat");
    }
    //    public void methodA(){
//        System.out.println("method of interface A");
//    }
    public void methodD(){
        System.out.println("method  of class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj1 = new C();
        D obj2 = new D();
//        D obj3 = new D();
        obj1.methodA();
        obj1.methodB();
        obj1.methodC();
        obj1.methodCar();
        obj2.methodD();
    }
}