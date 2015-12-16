package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae04{
    private Sundae04(){}
    static Sundae04 makeASundae(){
        return new Sundae04();
    }
}
public class IceCream04 {
    public static void main(String[] args){
        //Sundae04 x = new Sundae04();
        Sundae04 x = Sundae04.makeASundae();
    }
}
