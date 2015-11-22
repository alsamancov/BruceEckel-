package Chapter06.lesson07.part01;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae01{
    private Sundae01(){}
    static Sundae01 makeASundae(){
        return new Sundae01();
    }
}

public class IceCream01 {
    public static void main(String[] args){
        //Sundae x = new Sundae();
        Sundae01 sundae01 = Sundae01.makeASundae();
    }
}
