package Chapter06.lesson07;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae03{
    private Sundae03(){}
    static Sundae03 makeASundae(){
        return new Sundae03();
    }
}

public class IceCream03 {
    public static void main(String[] args){
        //Sundae03 x = new Sundae03();
        Sundae03 sundae03 = Sundae03.makeASundae();
    }
}
