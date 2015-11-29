package Chapter07.lesson03.part01;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser01{
    private String s = "Cleanser";
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
        Cleanser01 x = new Cleanser01();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent01 extends Cleanser01 {
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent01 x = new Detergent01();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser01.main(args);
    }
}
