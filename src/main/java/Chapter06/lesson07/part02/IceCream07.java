package Chapter06.lesson07.part02;

/**
 * Created by Alexey on 11/22/2015.
 */
class Sundae07{
    private Sundae07(){}
    static Sundae07 makeASundae(){
        return new Sundae07();
    }
}
public class IceCream07 {
    public static void main(String[] args){
        Sundae07 x = Sundae07.makeASundae();
    }
}
