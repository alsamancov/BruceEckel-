package Chapter07.lesson03.part02;

/**
 * Created by Алексей on 11/30/2015.
 */
class Cleanser03 {
    private String s = "Cleanser03";
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
        Cleanser03 x = new Cleanser03();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent03 extends Cleanser03{
    public void scrub(){
        append(" Detergent03.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent03 x = new Detergent03();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser03.main(args);
    }
}
