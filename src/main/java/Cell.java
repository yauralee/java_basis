import java.util.Random;
import java.util.Scanner;

/**
 * Created by twcn on 9/25/16.
 */
public class Cell {
    int row;
    int col;
    static int num;
    static void drop1(){
//        row++;   //错误，static修饰的方法没有隐式this传递
        num++;  //正确，因为num是静态变量，不用创建对象也能调用
    }


    void drop(){
        row++;
    }
    void moveLeft(int step){
        col -= step;
    }
    void getCellInfo(){
        System.out.print(this.row + " " + this.col);
    }
    public static void main(String[] args){
        Cell c = new Cell();
        c.row = 3;
        c.col = 3;
        c.drop();
        c.getCellInfo();

//        c = null;
//        c.row = 2;  //java.lang.NullPointerException

//        Cell c1 = new Cell();
//        Cell c2 = new Cell(2);
//        Cell c3 = new Cell(2,3);
//
//        int[] arr = new int[4];
//        Cell[] cellArr = new Cell[4];
//        cellArr[0] = new Cell();
//        cellArr[1] = new Cell(2);
//        boolean[] bs = new boolean[2];
//        Random[] rs = new Random[2];
//        Scanner[] ss =  new Scanner[3];
//        cellArr[3].row = 3;  //java.lang.NullPointerException

        Cell[] cs = new Cell[4];  // 定义
        cs[0] = new Cell();  //初始化
        cs[2] = new Cell(1);

        int[] arr = {1,2,3,4};
        Cell[] cs1 = {
                new Cell(3),
                new Cell(),
                new Cell(),
                new Cell(2)
        };

        int[] arr1 = new int[] {1,2,3};
        Cell[] cs2 = new Cell[]{
                new Cell(3),
                new Cell(),
                new Cell(),
                new Cell(2)
        };

        int[][] arr3 = new int[3][];
        arr3[0] = new int[2];
//        arr3[1] = {1,2};  //array initialize is not allow here
        arr3[2] = new int[]{1,2,3};
        arr3[0][1] = 2;
    }

    //构造方法没有返回值，没有void, 用来给成员变量赋值
//    Cell(){
//    }
//    Cell(int n){
//        row = n;
//        col = n;
//    }
//    Cell(int a, int b){
//        row = a;
//        col = b;
//    }
//    Cell(int row1, int col1){
//        row = row1;
//        col = col1;
//    }

    Cell(int row, int col){
        this.row = row;    //第一个row是成员变量，第二个是局部变量，this指代当前对象
        this.col = col;
    }


    //this(）表示调用构造方法
    Cell(int n){
        this(n,n);
    }
    Cell(){
        this(0,0);
    }



}
