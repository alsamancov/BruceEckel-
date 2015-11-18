package Chapter07.lesson05;

/**
 * Created by Alexey on 11/18/2015.
 */
class Game02{
    Game02(int i){
        System.out.println("Game02 constructor");
    }
}
class BoardGame02 extends Game02{
    BoardGame02(int i){
        super(i);
        System.out.println("BoardGame02 constructor");
    }
}
public class Chess02 extends BoardGame02{
    Chess02(){
        super(11);
        System.out.println("Chess02 constructor");
    }
    public static void main(String[] args){
        Chess02 x = new Chess02();
    }
}
