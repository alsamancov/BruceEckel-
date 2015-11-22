package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Villain07{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain07(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain07 and my name is " + name;
    }
}
public class Orc07 extends Villain07{
    private int orcNumber;
    public Orc07(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc07 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc07 orc07 = new Orc07("Limburger07", 12);
        System.out.println(orc07);
        orc07.change("Bob07", 19);
        System.out.println(orc07);
    }
}
