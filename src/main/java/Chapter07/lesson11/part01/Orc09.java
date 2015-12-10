package Chapter07.lesson11.part01;

/**
 * Created by Alexey on 12/10/2015.
 */
class Villain09{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain09(String name){
        this.name = name;
    }
    public String toString(){
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc09 extends Villain09{
    private int orcNumber;
    public Orc09(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc09 " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args){
        Orc09 orc = new Orc09("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
