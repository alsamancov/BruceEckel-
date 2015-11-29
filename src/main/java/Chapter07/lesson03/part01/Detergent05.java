package Chapter07.lesson03.part01;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser05{
    private String s = "Cleanser05";
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
        Cleanser05 x = new Cleanser05();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent05 extends Cleanser05{
    public void scrub(){
        append(" Detergent05.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent05 x = new Detergent05();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser05.main(args);
    }
}
