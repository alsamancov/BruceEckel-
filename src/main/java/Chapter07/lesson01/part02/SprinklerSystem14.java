package Chapter07.lesson01.part02;

/**
 * Created by Alexey on 11/25/2015.
 */
class WaterSource14{
    private String s;
    WaterSource14(){
        System.out.println("WaterSource14()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem14 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource14 source14 = new WaterSource14();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source14;
    }
    public static void main(String[] args){
        SprinklerSystem14 sprinklers = new SprinklerSystem14();
        System.out.println(sprinklers);
    }
}
