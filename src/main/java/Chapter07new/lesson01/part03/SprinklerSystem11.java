package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/18/2016.
 */
class WaterSource11{
    private String s;
    WaterSource11(){
        System.out.println("WaterSource11()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem11 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource11 source11 = new WaterSource11();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source11;
    }
    public static void main(String[] args){
        SprinklerSystem11 sprinklerSystem11 = new SprinklerSystem11();
        System.out.println(sprinklerSystem11);
    }
}
