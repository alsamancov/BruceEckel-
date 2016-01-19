package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/19/2016.
 */
class WaterSource12{
    private String s;
    WaterSource12(){
        System.out.println("WaterSource12()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem12 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource12 source12 = new WaterSource12();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source12;
    }
    public static void main(String[] args){
        SprinklerSystem12 sprinklerSystem12 = new SprinklerSystem12();
        System.out.println(sprinklerSystem12);
    }
}
