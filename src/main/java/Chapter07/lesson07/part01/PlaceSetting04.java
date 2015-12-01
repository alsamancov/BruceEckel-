package Chapter07.lesson07.part01;

/**
 * Created by Alexey on 11/19/2015.
 */
class Plate04{
    Plate04(int i){
        System.out.println("Plate04 constructor");
    }
}
class DinnerPlate04 extends Plate04{
    DinnerPlate04(int i){
        super(i);
        System.out.println("DinnerPlate04 constructor");
    }
}
class Utensil04{
    Utensil04(int i){
        System.out.println("Utensil04 constructor");
    }
}
class Spoon04 extends Utensil04{
    Spoon04(int i){
        super(i);
        System.out.println("Spoon04 constructor");
    }
}
class Fork04 extends Utensil04{
    Fork04(int i){
        super(i);
        System.out.println("Fork04 constructor");
    }
}
class Knife04 extends Utensil04{
    Knife04(int i){
        super(i);
        System.out.println("Knife04 constructor");
    }
}
class Custom04{
    Custom04(int i){
        System.out.println("Custom04 constructor");
    }
}
public class PlaceSetting04 extends Custom04{
    private Spoon04 sp;
    private Fork04 frk;
    private Knife04 kn;
    private DinnerPlate04 pl;
    public PlaceSetting04(int i){
        super(i + 1);
        sp = new Spoon04(i + 2);
        frk = new Fork04(i + 3);
        kn = new Knife04(i + 4);
        pl = new DinnerPlate04(i + 5);
        System.out.println("PlaceSetting04 constructor");
    }
    public static void main(String[] args){
        PlaceSetting04 x = new PlaceSetting04(9);
    }
}
