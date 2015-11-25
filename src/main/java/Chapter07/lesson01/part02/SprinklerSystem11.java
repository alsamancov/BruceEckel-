package Chapter07.lesson01.part02;

/**
 * Created by Alexey on 11/25/2015.
 */
class WaterSource11{
    private String s;
    WaterSource11(){
        System.out.println("WaterSource11()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem11 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource11 source11 = new WaterSource11();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source11;
    }
    public static void main(String[] args){
        SprinklerSystem11 sprinklers = new SprinklerSystem11();
        System.out.println(sprinklers);
    }
}
