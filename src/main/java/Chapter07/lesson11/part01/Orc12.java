package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 12/11/2015.
 */
class Villain12{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain12(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain12 and my name is " + name;
    }
}
public class Orc12 extends Villain12{
    private int orcNumber;
    public Orc12(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc12 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc12 orc = new Orc12("Limburger12", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
