package Chapter07.lesson07.part022;

/**
 * Created by Alexey on 12/04/2015.
 */
class Plate05{
    Plate05(int i){
        System.out.println("Plate05 constructor");
    }
}
class DinnerPlate05 extends Plate05{
    DinnerPlate05(int i){
        super(i);
        System.out.println("DinnerPlate05 constructor");
    }
}
class Utensil05{
    Utensil05(int i){
        System.out.println("Utensil05 constructor");
    }
}
class Spoon05 extends Utensil05{
    Spoon05(int i){
        super(i);
        System.out.println("Spoon05 constructor");
    }
}
class Fork05 extends Utensil05{
    Fork05(int i){
        super(i);
        System.out.println("Fork05 constructor");
    }
}
class Knife05 extends Utensil05{
    Knife05(int i){
        super(i);
        System.out.println("Knife05 constructor");
    }
}
class Custom05{
    Custom05(int i){
        System.out.println("Custom05 constructor");
    }
}
public class PlaceSetting05 extends Custom05{
    private Spoon05 sp;
    private Fork05 frk;
    private Knife05 kn;
    private DinnerPlate05 pl;
    public PlaceSetting05(int i){
        super(i + 1);
        sp = new Spoon05(i + 2);
        frk = new Fork05(i + 3);
        kn = new Knife05(i + 4);
        pl = new DinnerPlate05(i + 5);
        System.out.println("PlaceSetting05 constructor");
    }
    public static void main(String[] args){
        PlaceSetting05 x = new PlaceSetting05(9);
    }
}
