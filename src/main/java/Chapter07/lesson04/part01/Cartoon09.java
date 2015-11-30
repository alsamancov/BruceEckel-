package Chapter07.lesson04.part01;

/**
 * Created by Alexey on 11/18/2015.
 */
class Art09{
    Art09(){
        System.out.println("Art09 constructor");
    }
}
class Drawing09 extends Art09{
    Drawing09(){
        System.out.println("Drawing09 constructor");
    }
}
public class Cartoon09 extends Drawing09{
    Cartoon09(){
        System.out.println("Cartoon09 constructor");
    }
    public static void main(String[] args){
        Cartoon09 x = new Cartoon09();
    }
}
