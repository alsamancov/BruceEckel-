package Chapter07.lesson11.part02;

/**
 * Created by Alexey on 12/11/2015.
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
        return "I'm a Villain and my name is " + name;
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
        Orc07 orc = new Orc07("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
