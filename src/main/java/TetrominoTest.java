/**
 * Created by twcn on 9/25/16.
 */
public class TetrominoTest {
    public static void main(String[] args) {

        T t = new T(2,5);
        t.print();

        //向上转型
        printCell(t);

//        Tetromino j = new J(2,3);
//        printCell(j);
    }


    public static void printCell(Tetromino tet){
        System.out.print("..........");
    }
}
