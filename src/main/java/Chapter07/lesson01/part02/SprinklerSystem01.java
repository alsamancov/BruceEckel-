package Chapter07.lesson01.part02;

/**
 * Created by Alexey on 11/24/2015.
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
    private WaterSource01 source = new WaterSource01();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }
    public static void main(String[] args){
        SprinklerSystem01 sprinklerSystem01 = new SprinklerSystem01();
        System.out.println(sprinklerSystem01);
    }
}
