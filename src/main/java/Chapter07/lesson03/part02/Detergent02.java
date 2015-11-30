package Chapter07.lesson03.part02;

/**
 * Created by Алексей on 11/30/2015.
 */

class Cleanser02{
    private String s = "Cleanser02";
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
        Cleanser02 x = new Cleanser02();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent02 extends Cleanser02{
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent02 x = new Detergent02();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing class:");
        Cleanser02.main(args);
    }
}
