package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/22/2015.
 */
class Villian02{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villian02(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villian and my name is " + name;
    }
}
public class Orc02 extends Villian02{
    private int orcNumber;
    public Orc02(String name, int orcNumber){
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
        Orc02 orc02 = new Orc02("Limburger", 12);
        System.out.println(orc02);
        orc02.change("Bob", 19);
        System.out.println(orc02);
    }
}
