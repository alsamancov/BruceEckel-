package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae02{
    private Sundae02(){}
    static Sundae02 makeASundae(){
        return new Sundae02();
    }
}
public class IceCream02 {
    public static void main(String[] args){
        //Sundae02 x = new Sundae02();
        Sundae02 x = Sundae02.makeASundae();
    }
}
