package Chapter07.lesson07.part022;

/**
 * Created by Alexey on 12/03/2015.
 */
class Plate03{
    Plate03(int i){
        System.out.println("Plate03 constructor");
    }
}
class DinnerPlate03 extends Plate03{
    DinnerPlate03(int i){
        super(i);
        System.out.println("DinnerPlate03 constructor");
    }
}
class Utensil03{
    Utensil03(int i){
        System.out.println("Utensil03 constructor");
    }
}
class Spoon03 extends Utensil03{
    Spoon03(int i){
        super(i);
        System.out.println("Spoon03 constructor");
    }
}
class Fork03 extends Utensil03{
    Fork03(int i){
        super(i);
        System.out.println("Fork03 constructor");
    }
}
class Knife03 extends Utensil03{
    Knife03(int i){
        super(i);
        System.out.println("Knife03 constructor");
    }
}
class Custom03 {
    Custom03(int i){
        System.out.println("Custom03 constructor");
    }
}
public class PlaceSetting03 extends Custom03{
    private Spoon03 sp;
    private Fork03 frk;
    private Knife03 kn;
    private DinnerPlate03 pl;
    public PlaceSetting03(int i){
        super(i + 1);
        sp = new Spoon03(i + 2);
        frk = new Fork03(i + 3);
        kn = new Knife03(i + 4);
        pl = new DinnerPlate03(i + 5);
        System.out.println("PlaceSetting03 constructor");
    }
    public static void main(String[] args){
        PlaceSetting03 x = new PlaceSetting03(9);
    }
}
