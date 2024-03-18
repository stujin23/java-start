package dependcencyoff;

public class ABMain {
    public static void main(String[] args) {
        A a = new A("Aclass");
        System.out.println(a.aField);
        System.out.println(a.aMethod());

        B b = new B("Bclass");
        System.out.println(b.bField);
        System.out.println(b.bMethod());
    }
}
class A{
    String aField;
    public A(String aField){
        this.aField = aField;
    }

    String aMethod() {
        return "A.method";
    }
}
class B{
    String bField;
    public B(String bField){
        this.bField = bField;
    }

    public String bMethod() {
        return "B.method";
    }
}