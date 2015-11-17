package Chapter07.lesson03;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser09{
    private String s = "Cleanser09";
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
        Cleanser09 x = new Cleanser09();
        x.dilute(); x.apply();x.scrub();
        System.out.println(x);
    }
}
public class Detergent09 extends Cleanser09{
    public void scrub(){
        append(" Detergent09.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent09 x = new Detergent09();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser09.main(args);
    }
}
