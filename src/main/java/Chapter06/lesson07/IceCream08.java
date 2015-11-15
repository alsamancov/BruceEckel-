package Chapter06.lesson07;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae08{
    private Sundae08(){}
    static Sundae08 makeASundae(){
        return new Sundae08();
    }
}

public class IceCream08 {
    public static void main(String[] args){
        //Sundae08 sundae08 = new Sundae08();
        Sundae08 sundae08 = Sundae08.makeASundae();
    }
}
