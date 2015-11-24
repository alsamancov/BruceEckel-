package Chapter07.lesson01.part01;

/**
 * Created by Alexey on 11/16/2015.
 */
class WaterSource07{
    private String s;
    WaterSource07(){
        System.out.println("WaterSource07()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem07 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource07 source07 = new WaterSource07();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source07 = " + source07;
    }
    public static void main(String[] args){
        SprinklerSystem07 sprinklerSystem07 = new SprinklerSystem07();
        System.out.println(sprinklerSystem07);
    }
}
