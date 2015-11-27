package Chapter07.lesson02.part022;

/**
 * Created by Alexey on 11/27/2015.
 */
class Soap03{
    private String s;
    Soap03(){
        System.out.println("Soap03()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class Bath03 {
    private String
    s1 = "Happy",
    s2 = "Happy",
    s3, s4;
    private Soap03 castille;
    private int i;
    private float toy;
    public Bath03(){
        System.out.println("Inside Bath03()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap03();
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
        Bath03 b = new Bath03();
        System.out.println(b);
    }
}
