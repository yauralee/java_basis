/**
 * Created by twcn on 9/25/16.
 */
public class Outer {
    private int time;
    private Inner inner;

    Outer(int time){          //有参构造
        this.time = time;
        inner = new Inner();   //在构造中创建了Inner对象
        inner.timeInc();
    }


    public void printTime(){
        System.out.println(time);
    }


    class Inner{
        public void timeInc(){
            time++;
            Outer.this.time++;    //完整版，即time前有隐式的Outer对象传递
        }
    }


    public static void main(String[] args){
        Outer outer = new Outer(100);
        outer.printTime();
    }

}
