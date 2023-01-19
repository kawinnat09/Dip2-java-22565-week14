interface Human{
    String hello = "Hello";
    void sayHello();
}

class Elon implements Human{
    String name = "Mr.Elon Mask";
    public void methodElon(){
        System.out.println(this.name);
    }
    public void sayHello(){
        System.out.println(hello + " Mr.Mark Zuckerberg " + name);
    }
}

public class interfaceTest extends Elon implements Human{
    public void sayHello(){
        System.out.println(hello + " Mr.Mark Zuckerberg" + name);
    }

    public static void main(String[] args){
        interfaceTest obj1 = new interfaceTest();
        Elon obj2 = new Elon();
        obj1.sayHello();
        obj2.methodElon();
    }
}