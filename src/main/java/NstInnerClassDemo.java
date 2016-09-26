/**
 * Created by twcn on 9/25/16.
 */
public class NstInnerClassDemo {
    public static void main(String[] args){
//        Inter1 o1 = new Inter1(); //错误
        Inter1 o2 = new Inter1() {
          void someMethod(){}
        };       //内部类

        Inter3 o3 = new Inter3() {
            @Override
            public void show() {

            }
        };

//        Inter3 o4 = new Inter3() {};  //错误 需要重写方法
//        }
    }
}
interface Inter1{}
interface Inter3{
    void show();
}