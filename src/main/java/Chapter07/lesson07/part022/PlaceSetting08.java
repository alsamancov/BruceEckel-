package Chapter07.lesson07.part022;

/**
 * Created by Alexey on 12/06/2015.
 */
class Plate08{
    Plate08(int i){
        System.out.println("Plate08 constructor");
    }
}
class DinnerPlate08 extends Plate08{
    DinnerPlate08(int i){
        super(i);
        System.out.println("DinnerPlate08 constructor");
    }
}
class Utensil08{
    Utensil08(int i){
        System.out.println("Utensil08 constructor");
    }
}
class Spoon08 extends Utensil08{
    Spoon08(int i){
        super(i);
        System.out.println("Spoon08 constructor");
    }
}
class Fork08 extends Utensil08{
    Fork08(int i){
        super(i);
        System.out.println("Fork08 constructor");
    }
}
class Knife08 extends Utensil08{
    Knife08(int i){
        super(i);
        System.out.println("Knife08 constructor");
    }
}
class Custom08{
    Custom08(int i){
        System.out.println("Custom08 constructor");
    }
}
public class PlaceSetting08 extends Custom08{
    private Spoon08 sp;
    private Fork08 frk;
    private Knife08 kn;
    private DinnerPlate08 pl;
    public PlaceSetting08(int i){
        super(i + 1);
        sp = new Spoon08(i + 2);
        frk = new Fork08(i + 3);
        kn = new Knife08(i + 4);
        pl = new DinnerPlate08(i + 5);
        System.out.println("PlaceSetting08 constructor");
    }
    public static void main(String[] args){
        PlaceSetting08 x = new PlaceSetting08(9);
    }
}
