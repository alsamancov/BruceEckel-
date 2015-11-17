package Chapter07.lesson03;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser10{
    private String s = "Cleanser10";
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
        Cleanser10 x = new Cleanser10();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent10 extends Cleanser10{
    public void scrub(){
        append(" Detergent10.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent10 x = new Detergent10();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser10.main(args);
    }
}
