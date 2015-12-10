package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 12/10/2015.
 */
class Villain11{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain11(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc11 extends Villain11{
    private int orcNumber;
    public Orc11(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc11 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc11 orc = new Orc11("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
