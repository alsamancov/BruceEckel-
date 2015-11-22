package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/22/2015.
 */
class Villian{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villian(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villian and my name is " + name;
    }
}
public class Orc01 extends Villian {
    private int orcNumber;
    public Orc01(String name, int orcNumber){
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
        Orc01 orc01 = new Orc01("Limburger", 12);
        System.out.println(orc01);
        orc01.change("Bob", 19);
        System.out.println(orc01);
    }
}
