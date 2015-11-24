package Chapter07.lesson01.part01;

/**
 * Created by Alex on 16.11.15.
 */
class WaterSource09{
    private String s;
    WaterSource09(){
        System.out.println("WaterSource09()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem09 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource09 source09 = new WaterSource09();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source09;
    }
    public static void main(String[] args){
        SprinklerSystem09 sprinklerSystem09 = new SprinklerSystem09();
        System.out.println(sprinklerSystem09);
    }
}
