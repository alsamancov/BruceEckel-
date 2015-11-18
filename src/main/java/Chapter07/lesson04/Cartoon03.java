package Chapter07.lesson04;

/**
 * Created by Alexey on 11/17/2015.
 */
class Art03{
    Art03(){
        System.out.println("Art03 constructor");
    }
}

class Drawing03 extends Art03{
    Drawing03(){
        System.out.println("Drawing03 constructor");
    }
}
public class Cartoon03 extends Drawing03{
    public Cartoon03(){
        System.out.println("Cartoon03 constructor");
    }
    public static void main(String[] args){
        Cartoon03 x = new Cartoon03();
    }
}
