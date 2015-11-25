package Chapter07.lesson01.part02;

/**
 * Created by Alexey on 11/25/2015.
 */
class WaterSource12{
    private String s;
    WaterSource12(){
        System.out.println("WaterSource12()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem12 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource12 source12 = new WaterSource12();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source12;
    }
    public static void main(String[] args){
        SprinklerSystem12 sprinklers = new SprinklerSystem12();
        System.out.println(sprinklers);
    }
}
