package Chapter07.lesson04.part01;

/**
 * Created by Alexey on 11/18/2015.
 */
class Art06{
    Art06(){
        System.out.println("Art06 constructor");
    }
}
class Drawing06 extends Art06{
    Drawing06(){
        System.out.println("Drawing06 constructor");
    }
}
public class Cartoon06 extends Drawing06{
    Cartoon06(){
        System.out.println("Cartoon06 constructor");
    }

    public static void main(String[] args) {
        Cartoon06 x = new Cartoon06();
    }
}
