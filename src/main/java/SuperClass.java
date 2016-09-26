/**
 * Created by twcn on 9/25/16.
 */
public class SuperClass {
    public static void main(String[] args){
        Boo b = new Boo();
    }
}

class AAoo{
//    AAoo(){
//        System.out.print("父类构造");
//    }
    AAoo(int a){
        System.out.print(a);
    }
}
class Boo extends AAoo{
    Boo(){
        super(1);
//        super();  //默认存在
        System.out.print("子类构造");
    }
}
