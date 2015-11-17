package Chapter07.lesson03;

/**
 * Created by Alexey on 11/17/2015.
 */
class Cleanser06{
    private String s = "Cleanser06";
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
        Cleanser06 x = new Cleanser06();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent06 extends Cleanser06 {
    public void scrub(){
        append(" Detergent06.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }
    public static void main(String[] args){
        Detergent06 x = new Detergent06();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser06.main(args);
    }
}
