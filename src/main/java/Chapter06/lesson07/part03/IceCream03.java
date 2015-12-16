package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae03{
    private Sundae03(){}
    static Sundae03 makeASundae(){
        return new Sundae03();
    }
}
public class IceCream03 {
    public static void main(String[] args){
        //Sundae03 x = new Sundae03();
        Sundae03 x = Sundae03.makeASundae();
    }
}
