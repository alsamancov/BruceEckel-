package Chapter07.lesson02;

/**
 * Created by Alexey on 11/17/2015.
 */
class Soap10{
    private String s;
    Soap10(){
        System.out.println("Soap10()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class Bath10 {
    private String
    s1 = "Happy",
    s2 = "Happy",
    s3, s4;
    private Soap10 castille;
    private int i;
    private float toy;
    public Bath10(){
        System.out.println("Inside Bath10()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap10();
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
        Bath10 bath10 = new Bath10();
        System.out.println(bath10);
    }
}
