package Chapter07.lesson05.part02;

/**
 * Created by Alexey on 11/30/2015.
 */
class Game04{
    Game04(int i){
        System.out.println("Game04 constructor");
    }
}
class BoardGame04 extends Game04{
    BoardGame04(int i){
        super(i);
        System.out.println("BoardGame04 constructor");
    }
}
public class Chess04  extends BoardGame04{
    Chess04(){
        super(11);
        System.out.println("Chess04 constructor");
    }
    public static void main(String[] args){
        Chess04 x = new Chess04();
    }
}
