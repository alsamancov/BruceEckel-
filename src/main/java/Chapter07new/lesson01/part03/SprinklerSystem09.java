package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/16/2016.
 */
class WaterSource09{
    private String s;
    WaterSource09(){
        System.out.println("WaterSource01()");
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
                "i = " + i + " " + "f = " + " " +
                "source = " + source09;
    }
    public static void main(String[] args){
        SprinklerSystem09 sprinklerSystem09 = new SprinklerSystem09();
        System.out.println(sprinklerSystem09);
    }
}
