package Chapter07.lesson04.part01;

/**
 * Created by Alexey on 11/18/2015.
 */
class Art11{
    Art11(){
        System.out.println("Art11 constructor");
    }
}
class Drawing11 extends Art11{
    Drawing11(){
        System.out.println("Drawing11 constructor");
    }
}
public class Cartoon11 extends Drawing11{
    Cartoon11(){
        System.out.println("Cartoon11 constructor");
    }
    public static void main(String[] args){
        Cartoon11 x = new Cartoon11();
    }
}
