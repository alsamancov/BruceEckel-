package Chapter06.lesson07;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae07{
    private Sundae07(){}
    static Sundae07 makeASundae(){
        return new Sundae07();
    }
}

public class IceCream07 {
    public static void main(String[] args){
        //Sundae07 sundae07 = new Sundae07();
        Sundae07 sundae07 = Sundae07.makeASundae();
    }
}
