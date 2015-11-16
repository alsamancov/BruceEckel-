package Chapter07.lesson01;

/**
 * Created by Alexey on 11/16/2015.
 */
class WaterSource06{
    private String s;
    WaterSource06(){
        System.out.println("WaterSource06()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem06 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource06 source06 = new WaterSource06();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + " " + "f = " + f + " " +
                "source = " + source06;
    }
    public static void main(String[] args){
        SprinklerSystem06 sprinklerSystem06 = new SprinklerSystem06();
        System.out.println(sprinklerSystem06);
    }
}
