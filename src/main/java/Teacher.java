/**
 * Created by twcn on 9/25/16.
 */
public class Teacher extends Person {
    int salary;
    void teach(){}
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        a.aa = 0;
//        a.bb = 0;
        c.aa = 0;
        c.bb = 0;
        c.cc = 0;

    }
}


class A{
    int aa;
}

class B extends A {
    int bb;
}

class C extends B{
    int cc;
}

