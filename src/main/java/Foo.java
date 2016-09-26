/**
 * Created by twcn on 9/25/16.
 */
public class Foo {

    public static final int NUM = 100;

    public static void main(String[] args) {
        Foo foo = new Foo();
    }
    static{
        System.out.println("Load Foo.class");
    }
    public Foo(){
        System.out.println("Foo()");
    }
}
class Gooo{
    public static void main(String[] args){
        System.out.println("Foo.NUM");
    }
}

class Employee{
    private final int num = 100;   //final变量声明同时初始化
    public void testFinal(){
//        num = 99;                //final的变量不可改变
    }
}






