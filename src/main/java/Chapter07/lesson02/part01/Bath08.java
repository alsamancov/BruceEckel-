package Chapter07.lesson02.part01;

/**
 * Created by Alexey on 11/17/2015.
 */

class Soap08{
    private String s;
    Soap08(){
        System.out.println("Soap08()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class Bath08 {
    private String
    s1 = "Happy",
    s2 = "Happy",
    s3, s4;
    private Soap08 castille;
    private int i;
    private float toy;
    public Bath08(){
        System.out.println("Inside Bath08()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap08();
    }
    { i = 47; }
    public String toString(){
        if(s4 == null)
            s4 = "Joy";
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }
    public static void main(String[] args){
        Bath08 b = new Bath08();
        System.out.println(b);
    }
}
