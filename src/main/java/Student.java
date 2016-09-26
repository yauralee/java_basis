/**
 * Created by twcn on 9/25/16.
 */
public class Student {
    String name;
    int age;
    String address;

    Student(String name, int age, String address){
        System.out.println("执行构造");
        name = name;
        age = age;
        address = address;
    }
    Student(){
        System.out.println("overload无参构造");
    }
    public static void main(String[] args){
        Student student = new Student("liyu", 18, "here");
        Student student2 = new Student();
    }
}
