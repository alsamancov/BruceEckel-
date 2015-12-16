package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae08{
    private Sundae08(){}
    static Sundae08 makeASundae(){
        return new Sundae08();
    }
}
public class IceCream08 {
    public static void main(String[] args){
        //Sundae08 x = new Sundae08();
        Sundae08 x = Sundae08.makeASundae();
    }
}
