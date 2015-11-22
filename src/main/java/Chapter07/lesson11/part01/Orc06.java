package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/22/2015.
 */
class Villain06{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain06(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain06 and my name is " + name;
    }
}
public class Orc06 extends Villain06{
    private int orcNumber;
    public Orc06(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc06 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc06 orc06 = new Orc06("Limburger06", 12);
        System.out.println(orc06);
        orc06.change("Bob06", 19);
        System.out.println(orc06);
    }
}
