package Chapter07.lesson03.part01;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser08{
    private String s = "Cleanser08";
    public void append(String a){
        s += a;
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }
    public String toString(){
        return s;
    }
    public static void main(String[] args){
        Cleanser08 x = new Cleanser08();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent08 extends Cleanser08{
    public void scrub(){
        append(" Detergent08.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent08 x = new Detergent08();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser08.main(args);
    }
}
