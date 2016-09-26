/**
 * Created by twcn on 9/25/16.
 */

//父类的引用可以指向子类的对象，但通过父类的引用只能访问父类所定义的成员，不能访问子类扩展的部分
public class UpTest {
    public static void main(String[] args) {
        Moo o = new Moo();
        o.m = 5;
        o.say();
//		o.n = 3;  //编译错误,父类对象不能访问子类成员变量

        Noo oo = new Noo();
        oo.n = 5;
        oo.show();
        oo.m = 4; //编译正确，子类对象可以访问父类的成员变量和方法
        oo.say();


       //能点出来什么，看的是类型，不是对象
        Moo o1 = new Noo();  //向上造型
        o1.m = 5;
        o1.say();
//		o1.n = 2;  //编译错误，不能访问子类的成员变量和方法
//		o1.show();
    }
}

class Moo{
    int m;
    void say(){}
}

class Noo extends Moo{
    int n;
    void show(){}
}

