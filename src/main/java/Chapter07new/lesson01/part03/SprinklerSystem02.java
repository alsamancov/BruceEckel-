package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/16/2016.
 */
class WaterSource02{
    private String s;
    WaterSource02(){
        System.out.println("WaterSource02()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem02 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource02 source02 = new WaterSource02();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source02;
    }
    public static void main(String[] args){
        SprinklerSystem02 sprinklerSystem02 = new SprinklerSystem02();
        System.out.println(sprinklerSystem02);
    }
}
