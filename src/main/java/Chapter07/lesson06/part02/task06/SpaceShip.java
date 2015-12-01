package Chapter07.lesson06.part02.task06;

/**
 * Created by Алексей on 12/1/2015.
 */
public class SpaceShip extends SpaceShipControls {
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public static void main(String[] args){
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
