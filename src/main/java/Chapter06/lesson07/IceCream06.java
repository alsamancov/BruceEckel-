package Chapter06.lesson07;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae06{
    private Sundae06(){}
    static Sundae06 makeASundae(){
        return new Sundae06();
    }
}

public class IceCream06 {
    public static void main(String[] args){
        //Sundae06 sundae06 = new Sundae06();
        Sundae06 sundae06 = Sundae06.makeASundae();
    }
}
