package Chapter07.lesson04;

/**
 * Created by Alexey on 11/18/2015.
 */
class Art10{
    Art10(){
        System.out.println("Art10 constructor");
    }
}
class Drawing10 extends Art10{
    Drawing10(){
        System.out.println("Drawing10 constructor");
    }
}
public class Cartoon10 extends Drawing10{
    Cartoon10(){
        System.out.println("Cartoon10 constructor");
    }
    public static void main(String[] args){
        Cartoon10 x = new Cartoon10();
    }
}
