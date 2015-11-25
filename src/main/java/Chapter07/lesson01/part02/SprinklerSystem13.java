package Chapter07.lesson01.part02;

/**
 * Created by Alexey on 11/25/2015.
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
        SprinklerSystem13 sprinklers = new SprinklerSystem13();
        System.out.println(sprinklers);
    }
}
