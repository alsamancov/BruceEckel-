package Chapter07.lesson05;

/**
 * Created by Alexey on 11/18/2015.
 */
class Game03{
    Game03(int i){
        System.out.println("Game03 constructor");
    }
}
class BoardGame03 extends Game03{
    BoardGame03(int i){
        super(i);
        System.out.println("BoardGame03 constructor");
    }
}
public class Chess03 extends BoardGame03{
    Chess03(){
        super(11);
        System.out.println("Chess03 constructor");
    }
    public static void main(String[] args){
        Chess03 x = new Chess03();
    }
}
