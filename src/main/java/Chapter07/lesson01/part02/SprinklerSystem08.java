package Chapter07.lesson01.part02;

/**
 * Created by Alexey on 11/25/2015.
 */
class WaterSource08{
    private String s;
    WaterSource08(){
        System.out.println("WaterSource08()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem08 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource08 source08 = new WaterSource08();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source08;
    }
    public static void main(String[] args){
        SprinklerSystem08 sprinklerSystem08 = new SprinklerSystem08();
        System.out.println(sprinklerSystem08);
    }
}
