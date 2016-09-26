/**
 * Created by twcn on 9/25/16.
 */
public class InnerClass {
//    Baby baby = new Baby();
}

class Mother{
    String name;
    Mother(String name){
        this.name = name;
    }

    class Baby{
        void MotherName(){
            System.out.print(name);
            System.out.print(Mother.this.name);
//            System.out.print(this.name); //错误
        }
    }
}
