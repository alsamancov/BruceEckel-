package Chapter07.lesson11.part02;

/**
 * Created by Alexey on 12/11/2015.
 */
class Villain02{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain02(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc02 extends Villain02{
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
        return "Orc02 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc02 orc = new Orc02("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
