package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/16/2016.
 */
class WaterSource03{
    private String s;
    WaterSource03(){
        System.out.println("WaterSource03()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem03 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource03 source03 = new WaterSource03();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source03;
    }
    public static void main(String[] args){
        SprinklerSystem03 sprinklerSystem03 = new SprinklerSystem03();
        System.out.println(sprinklerSystem03);
    }
}
