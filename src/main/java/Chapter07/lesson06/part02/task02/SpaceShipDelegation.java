package Chapter07.lesson06.part02.task02;

/**
 * Created by Алексей on 12/1/2015.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls =
            new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name = name;
    }
    public void back(int velocity){
        controls.back(velocity);
    }
    public void up(int velocity){
        controls.up(velocity);
    }
    public void down(int velocity){
        controls.down(velocity);
    }
    public void forward(int velocity){
        controls.forward(velocity);
    }
    public void right(int velocity){
        controls.right(velocity);
    }
    public void left(int velocity){
        controls.left(velocity);
    }
    public void turboBoost(){
        controls.turboBoost();
    }
    public static void main(String[] args){
        SpaceShipDelegation protector =
                new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
