package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae05{
    private Sundae05(){}
    static Sundae05 makeASundae(){
        return new Sundae05();
    }
}
public class IceCream05 {
    public static void main(String[] args) {
        //Sundae05 x = new Sundae05();
        Sundae05 x = Sundae05.makeASundae();
    }
}
