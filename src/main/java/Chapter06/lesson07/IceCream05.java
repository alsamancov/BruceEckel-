package Chapter06.lesson07;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae05{
    private Sundae05(){}
    static Sundae05 makeASundae(){
        return new Sundae05();
    }
}

public class IceCream05 {
    public static void main(String[] args){
        //Sundae05 x = new Sundae05();
        Sundae05 sundae05 = Sundae05.makeASundae();
    }
}
