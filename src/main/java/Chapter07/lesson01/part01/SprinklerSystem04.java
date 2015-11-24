package Chapter07.lesson01.part01;

/**
 * Created by Alexey on 11/16/2015.
 */

class WaterSource04{
    private String s;
    WaterSource04(){
        System.out.println("WaterSource04()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem04 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource04 source04 = new WaterSource04();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source04;
    }
    public static void main(String[] args){
        SprinklerSystem04 sprinklerSystem04 = new SprinklerSystem04();
        System.out.println(sprinklerSystem04);
    }
}
