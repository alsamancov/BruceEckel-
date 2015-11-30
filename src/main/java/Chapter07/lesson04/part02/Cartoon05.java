package Chapter07.lesson04.part02;

/**
 * Created by Alexey on 11/30/2015.
 */
class Art05{
    Art05(){
        System.out.println("Art05 constructor");
    }
}
class Drawing05 extends Art05{
    Drawing05(){
        System.out.println("Drawing05 constructor");
    }
}
public class Cartoon05 extends Drawing05{
    public Cartoon05(){
        System.out.println("Cartoon05 constructor");
    }
    public static void main(String[] args){
        Cartoon05 x = new Cartoon05();
    }
}
