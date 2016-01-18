package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/18/2016.
 */
class WaterSource10{
    private String s;
    WaterSource10(){
        System.out.println("WaterSource10()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem10 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource10 source10 = new WaterSource10();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source10;
    }
    public static void main(String[] args){
        SprinklerSystem10 sprinklerSystem10 = new SprinklerSystem10();
        System.out.println(sprinklerSystem10);
    }
}
