package Chapter07.lesson05;

/**
 * Created by Alexey on 11/18/2015.
 */
class Game01{
    Game01(int i){
        System.out.println("Game01 constructor");
    }
}
class BoardGame01 extends Game01{
    BoardGame01(int i){
        super(i);
        System.out.println("BoardGame01 constructor");
    }
}
public class Chess01 extends BoardGame01{
    Chess01(){
        super(11);
        System.out.println("Chess01 constructor");
    }
    public static void main(String[] args){
        Chess01 x = new Chess01();
    }
}
