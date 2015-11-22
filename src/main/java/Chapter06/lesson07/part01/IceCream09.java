package Chapter06.lesson07.part01;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae09{
    private Sundae09(){}
    static Sundae09 makeASundae(){
        return new Sundae09();
    }
}

public class IceCream09 {
    public static void main(String[] args){
        //Sundae09 sundae09 = new Sundae09();
        Sundae09 sundae09 = Sundae09.makeASundae();
    }
}
