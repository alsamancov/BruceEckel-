package Chapter07new.lesson01.part03;

/**
 * Created by Alexey on 01/19/2016.
 */
class WaterSource13{
    private String s;
    WaterSource13(){
        System.out.println("WaterSource13()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem13 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource13 source13 = new WaterSource13();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source13;
    }
    public static void main(String[] args){
        SprinklerSystem13 sprinklerSystem13 = new SprinklerSystem13();
        System.out.println(sprinklerSystem13);
    }
}
