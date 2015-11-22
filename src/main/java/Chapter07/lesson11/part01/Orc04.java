package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 11/22/2015.
 */
class Villain04{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain04(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc04 extends Villain04 {
    private int orcNumber;
    public Orc04(String name, int orcNumber){
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
        Orc04 orc04 = new Orc04("Limburger04", 12);
        System.out.println(orc04);
        orc04.change("Bob04", 19);
        System.out.println(orc04);
    }
}
