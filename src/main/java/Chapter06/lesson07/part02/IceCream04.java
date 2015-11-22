package Chapter06.lesson07.part02;

/**
 * Created by Alexey on 11/22/2015.
 */
class Sundae04{
    private Sundae04(){}
    static Sundae04 makeASundae(){
        return new Sundae04();
    }
}
public class IceCream04 {
    public static void main(String[] args){
        Sundae04 x = Sundae04.makeASundae();
    }
}
