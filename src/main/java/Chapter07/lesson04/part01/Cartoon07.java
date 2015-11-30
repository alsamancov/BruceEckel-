package Chapter07.lesson04.part01;

/**
 * Created by Alexey on 11/18/2015.
 */
class Art07{
    Art07(){
        System.out.println("Art07 constructor");
    }
}
class Drawing07 extends Art07{
    Drawing07(){
        System.out.println("Drawing07 constructor");
    }
}
public class Cartoon07 extends Drawing07{
    Cartoon07(){
        System.out.println("Cartoon07 constructor");
    }
    public static void main(String[] args){
        Cartoon07 x = new Cartoon07();
    }
}
