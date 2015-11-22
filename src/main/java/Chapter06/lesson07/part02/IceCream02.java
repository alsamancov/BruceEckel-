package Chapter06.lesson07.part02;

/**
 * Created by Alexey on 11/22/2015.
 */
class Sundae02{
    private Sundae02(){}
    static Sundae02 makeASundae(){
        return new Sundae02();
    }
}
public class IceCream02 {
    public static void main(String[] args){
        Sundae02 x = Sundae02.makeASundae();
    }
}
