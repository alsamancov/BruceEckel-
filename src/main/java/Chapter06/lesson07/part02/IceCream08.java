package Chapter06.lesson07.part02;

/**
 * Created by Alexey on 11/22/2015.
 */
class Sundae08{
    private Sundae08(){}
    static Sundae08 makeASundae(){
        return new Sundae08();
    }
}
public class IceCream08 {
    public static void main(String[] args){
        Sundae08 x = Sundae08.makeASundae();
    }
}
