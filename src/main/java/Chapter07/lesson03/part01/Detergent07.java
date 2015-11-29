package Chapter07.lesson03.part01;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser07{
    private String s = "Cleanser07";
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
        Cleanser07 x = new Cleanser07();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent07 extends Cleanser07 {
    public void scrub(){
        append(" Detergent07.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent07 x = new Detergent07();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser07.main(args);
    }
}
