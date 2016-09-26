/**
 * Created by twcn on 9/25/16.
 */
public class payment {
    public static void main(String[] args){
        ICBCImpl impl = new ICBCImpl();
        impl.icbc();
        impl.saveMoney();

        ICBC icbc = new ICBCImpl();
        icbc.saveMoney();
//        icbc.icbc();  //不能调用
    }

}

interface UnionPay{
    void saveMoney();
    void getMoney();
    void changePwd();
}
interface ICBC extends UnionPay{
    void onlinePay();
}
interface ABC extends UnionPay{
    void payTelCharge();
}
class ICBCImpl implements ICBC{
    public void saveMoney(){}
    public void getMoney(){}
    public void changePwd(){}
    public void onlinePay(){}
    void icbc(){}
}
class ABCImpl implements ABC{
    public void saveMoney(){}
    public void getMoney(){}
    public void changePwd(){}
    public void payTelCharge(){}
    void abc(){}
}
class ABCATM{
    UnionPay card;
    void insertCard(UnionPay card){
        this.card = card;
    }
    void payPhone(){
        if (card instanceof ABCImpl){
            ABCImpl abc = (ABCImpl)card;
            abc.payTelCharge();
            System.out.print("支付成功");
        }else{
            System.out.print("无法支付");
        }
    }
}