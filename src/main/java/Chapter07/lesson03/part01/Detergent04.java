package Chapter07.lesson03.part01;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser04{
    private String s = "Cleanser04";
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
        Cleanser04 x = new Cleanser04();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent04 extends Cleanser04{
    public void scrub(){
        append(" Detergent04.scrub()");
        super.scrub();
    }

    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent04 x = new Detergent04();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser04.main(args);
    }
}
