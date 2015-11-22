package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/22/2015.
 */
class Villain03{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain03(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain03 and my name is " + name;
    }
}
public class Orc03 extends Villain03{
    private int orcNumber;
    public Orc03(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc03 orc03 = new Orc03("Limburger", 12);
        System.out.println(orc03);
        orc03.change("Bob", 19);
        System.out.println(orc03);
    }
}

