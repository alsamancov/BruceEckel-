package Chapter07.lesson07.part022;

/**
 * Created by Alexey on 12/04/2015.
 */
class Plate07{
    Plate07(int i){
        System.out.println("Plate07 constructor");
    }
}
class DinnerPlate07 extends Plate07{
    DinnerPlate07(int i){
        super(i);
        System.out.println("DinnerPlate07 constructor");
    }
}
class Utensil07{
    Utensil07(int i){
        System.out.println("Utensil07 constructor");
    }
}
class Spoon07 extends Utensil07{
    Spoon07(int i){
        super(i);
        System.out.println("Spoon07 constructor");
    }
}
class Fork07 extends Utensil07{
    Fork07(int i){
        super(i);
        System.out.println("Fork07 constructor");
    }
}
class Knife07 extends Utensil07{
    Knife07(int i){
        super(i);
        System.out.println("Knife07 constructor");
    }
}
class Custom07{
    Custom07(int i){
        System.out.println("Custom07 constructor");
    }
}
public class PlaceSetting07 extends Custom07{
    private Spoon07 sp;
    private Fork07 frk;
    private Knife07 kn;
    private DinnerPlate07 pl;
    public PlaceSetting07(int i){
        super(i + 1);
        sp = new Spoon07(i + 2);
        frk = new Fork07(i + 3);
        kn = new Knife07(i + 4);
        pl = new DinnerPlate07(i + 5);
        System.out.println("PlaceSetting07 constructor");
    }
    public static void main(String[] args){
        PlaceSetting07 x = new PlaceSetting07(9);
    }
}
