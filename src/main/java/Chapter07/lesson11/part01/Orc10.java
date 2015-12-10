package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 12/10/2015.
 */
class Villain10{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain10(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc10 extends Villain10{
    private int orcNumber;
    public Orc10(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc10 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc10 orc = new Orc10("Limburger10", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
