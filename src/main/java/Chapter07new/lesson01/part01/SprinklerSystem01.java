package Chapter07new.lesson01.part01;

/**
 * Created by Alexey on 01/13/2016.
 */

class WaterSource01{
    private String s;
    WaterSource01(){
        System.out.println("WaterSource01()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem01 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource01 source01 = new WaterSource01();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source01;
    }
    public static void main(String[] args){
        SprinklerSystem01 sprinklerSystem01 = new SprinklerSystem01();
        System.out.println(sprinklerSystem01);
    }
}
