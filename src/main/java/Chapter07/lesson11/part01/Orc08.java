package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Villain08{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain08(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain08 and my name is " + name;
    }
}
public class Orc08 extends Villain08{
    private int orcNumber;
    public Orc08(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc08 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc08 orc08 = new Orc08("Limburger08", 12);
        System.out.println(orc08);
        orc08.change("Bob08", 19);
        System.out.println(orc08);
    }
}
