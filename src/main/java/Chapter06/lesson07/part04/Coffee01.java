package Chapter06.lesson07.part04;

/**
 * Created by Alexey on 12/17/2015.
 */
class Latte01{
    private Latte01(){}
    static Latte01 makeALatte(){
        return new Latte01();
    }
}
public class Coffee01 {
    public static void main(String[] args){
        Latte01 x = Latte01.makeALatte();
    }
}
