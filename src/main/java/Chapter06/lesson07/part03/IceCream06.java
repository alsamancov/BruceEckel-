package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae06{
    private Sundae06(){}
    static Sundae06 makeASundae(){
        return new Sundae06();
    }
}
public class IceCream06 {
    public static void main(String[] args){
        //Sundae06 x = new Sundae06();
        Sundae06 x = Sundae06.makeASundae();
    }
}
