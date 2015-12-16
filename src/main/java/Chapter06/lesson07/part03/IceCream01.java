package Chapter06.lesson07.part03;

/**
 * Created by Alexey on 12/16/2015.
 */
class Sundae01{
    private Sundae01(){}
    static Sundae01 makeASundae(){
        return new Sundae01();
    }
}

public class IceCream01 {
    public static void main(String[] args){
        //Sundae01 x = new Sundae01();
        Sundae01 x = Sundae01.makeASundae();
    }
}
