package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/22/2015.
 */
class Villain05{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain05(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain05 and my name is " + name;
    }
}
public class Orc05 extends Villain05{
    private int orcNumber;
    public Orc05(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc05 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc05 orc05 = new Orc05("Limburger05", 12);
        System.out.println(orc05);
        orc05.change("Bob05", 19);
        System.out.println(orc05);
    }
}
