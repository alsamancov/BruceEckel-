package Chapter07.lesson04.part02;

/**
 * Created by Alexey on 11/30/2015.
 */
class Art08{
    Art08(){
        System.out.println("Art08 constructor");
    }
}
class Drawing08 extends Art08{
    Drawing08(){
        System.out.println("Drawing08 constructor");
    }
}
public class Cartoon08 extends Drawing08{
    Cartoon08(){
        System.out.println("Cartoon08 constructor");
    }
    public static void main(String[] args){
        Cartoon08 x = new Cartoon08();
    }
}
