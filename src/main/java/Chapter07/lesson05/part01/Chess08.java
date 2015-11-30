package Chapter07.lesson05.part01;

/**
 * Created by Alexey on 11/18/2015.
 */
class Game08{
    Game08(int i){
        System.out.println("Game08 constructor");
    }
}
class BoardGame08 extends Game08{
    BoardGame08(int i){
        super(i);
        System.out.println("BoardGame08 constructor");
    }
}
public class Chess08 extends BoardGame08{
    Chess08(){
        super(11);
        System.out.println("Chess08 constructor");
    }
    public static void main(String[] args){
        Chess08 x = new Chess08();
    }
}
