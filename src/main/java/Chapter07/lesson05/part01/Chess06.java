package Chapter07.lesson05.part01;

/**
 * Created by Alexey on 11/18/2015.
 */
class Game06{
    Game06(int i){
        System.out.println("Game06 constructor");
    }
}
class BoardGame06 extends Game06{
    BoardGame06(int i){
        super(i);
        System.out.println("BoardGame06 constructor");
    }
}
public class Chess06 extends BoardGame06{
    Chess06(){
        super(11);
        System.out.println("Chess06 constructor");
    }
    public static void main(String[] args){
        Chess06 x = new Chess06();
    }
}
