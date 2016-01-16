package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/16/2016.
 */
class WaterSource05{
    private String s;
    WaterSource05(){
        System.out.println("WaterSource05()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem05 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource05 source05 = new WaterSource05();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source05;
    }
    public static void main(String[] args){
        SprinklerSystem05 sprinklerSystem05 = new SprinklerSystem05();
        System.out.println(sprinklerSystem05);
    }
}
