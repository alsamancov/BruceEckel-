package Chapter07.lesson06.task05;

/**
 * Created by Alexey on 11/18/2015.
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
