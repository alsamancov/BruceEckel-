package Chapter06.lesson07;

/**
 * Created by Alex on 15.11.15.
 */

class Sundae02{
    private Sundae02(){}
    static Sundae02 makeASundae(){
        return new Sundae02();
    }
}
public class IceCream02 {
    public static void main(String[] args){
        //Sundae02 sundae02 = new Sundae02();
        Sundae02 sundae02 = Sundae02.makeASundae();
    }
}
