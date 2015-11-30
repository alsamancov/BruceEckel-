package Chapter07.lesson05.part02;

/**
 * Created by Alexey on 11/30/2015.
 */
class Game07{
    Game07(int i){
        System.out.println("Game07 constructor");
    }
}
class BoardGame07 extends Game07{
    BoardGame07(int i){
        super(i);
        System.out.println("BoardGame07 constructor");
    }
}
public class Chess07 extends BoardGame07{
    Chess07(){
        super(11);
        System.out.println("Chess07 constructor");
    }
    public static void main(String[] args){
        Chess07 x = new Chess07();
    }
}
