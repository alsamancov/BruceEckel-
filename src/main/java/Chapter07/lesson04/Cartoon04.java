package Chapter07.lesson04;

/**
 * Created by Alexey on 11/18/2015.
 */
class Art04{
    Art04(){
        System.out.println("Art04 constructor");
    }
}
class Drawing04 extends Art04{
    Drawing04(){
        System.out.println("Drawing04 constructor");
    }
}
public class Cartoon04 extends Drawing04{
    public Cartoon04(){
        System.out.println("Cartoon04 constructor");
    }
    public static void main(String[] args){
        Cartoon04 x = new Cartoon04();
    }
}
