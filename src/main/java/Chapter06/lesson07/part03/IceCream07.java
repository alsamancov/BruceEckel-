package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae07{
    private Sundae07(){}
    static Sundae07 makeASundae(){
        return new Sundae07();
    }
}
public class IceCream07 {
    public static void main(String[] args){
        //Sundae07 x = new Sundae07();
        Sundae07 x = Sundae07.makeASundae();
    }
}
