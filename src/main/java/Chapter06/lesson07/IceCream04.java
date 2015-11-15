package Chapter06.lesson07;

/**
 * Created by Alex on 15.11.15.
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
        Sundae04 sundae04 = Sundae04.makeASundae();
    }
}
