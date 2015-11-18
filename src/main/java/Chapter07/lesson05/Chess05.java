package Chapter07.lesson05;

/**
 * Created by Alexey on 11/18/2015.
 */
class Game05{
    Game05(int i){
        System.out.println("Game05 constructor");
    }
}
class BoardGame05 extends Game05{
    BoardGame05(int i){
        super(i);
        System.out.println("BoardGame05 constructor");
    }
}
public class Chess05 extends BoardGame05{
    Chess05(){
        super(11);
        System.out.println("Chess05 constructor");
    }
    public static void main(String[] args){
        Chess05 x = new Chess05();
    }
}
