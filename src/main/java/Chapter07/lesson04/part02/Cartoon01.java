package Chapter07.lesson04.part02;

/**
 * Created by Alexey on 11/30/2015.
 */
class Art01{
    Art01(){
        System.out.println("Art01 constructor");
    }
}
class Drawing01 extends Art01{
    Drawing01(){
        System.out.println("Drawing01 constructor");
    }
}
public class Cartoon01 extends Drawing01{
    public Cartoon01(){
        System.out.println("Cartoon01 constructor");
    }
    public static void main(String[] args){
        Cartoon01 x = new Cartoon01();
    }
}
