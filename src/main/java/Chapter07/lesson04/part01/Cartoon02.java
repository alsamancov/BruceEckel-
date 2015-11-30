package Chapter07.lesson04.part01;

/**
 * Created by Alexey on 11/17/2015.
 */
class Art02{
    Art02(){
        System.out.println("Art02 constructor");
    }
}

class Drawing02 extends Art02{
    Drawing02(){
        System.out.println("Drawing02 constructor");
    }
}
public class Cartoon02 extends Drawing02{
    public Cartoon02(){
        System.out.println("Cartoon02 constructor");
    }
    public static void main(String[] args){
        Cartoon02 x = new Cartoon02();
    }
}
