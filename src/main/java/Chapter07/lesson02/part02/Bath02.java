package Chapter07.lesson02.part02;

/**
 * Created by Alexey on 11/26/2015.
 */
class Soap02{
    private String s;
    Soap02(){
        System.out.println("Soap02()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class Bath02 {
    private String
    s1 = "Happy",
    s2 = "Happy",
    s3, s4;
    private Soap02 castille;
    private int i;
    private float toy;
    public Bath02(){
        System.out.println("Inside Bath02()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap02();
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
                "toy = " + toy + "\n"+
                "castille = " + castille;
    }
    public static void main(String[] args){
        Bath02 b = new Bath02();
        System.out.println(b);
    }
}
