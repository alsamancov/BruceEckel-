package Chapter07.lesson07.part01;

/**
 * Created by Alexey on 11/19/2015.
 */
class Plate01{
    Plate01(int i){
        System.out.println("Plate constructor");
    }
}
class DinnerPlate01 extends Plate01{
    DinnerPlate01(int i){
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}
class Utensil01{
    Utensil01(int i){
        System.out.println("Utensil constructor");
    }
}
class Spoon01 extends Utensil01{
    Spoon01(int i){
        super(i);
        System.out.println("Spoon constructor");
    }
}
class Fork01 extends Utensil01{
    Fork01(int i){
        super(i);
        System.out.println("Fork constructor");
    }
}
class Knife01 extends Utensil01{
    Knife01(int i){
        super(i);
        System.out.println("Knife constructor");
    }
}
class Custom01{
    Custom01(int i){
        System.out.println("Custom constructor");
    }
}
public class PlaceSetting01 extends Custom01{
    private Spoon01 sp;
    private Fork01 frk;
    private Knife01 kn;
    private DinnerPlate01 pl;
    public PlaceSetting01(int i){
        super(i + 1);
        sp = new Spoon01(i + 2);
        frk = new Fork01(i + 3);
        kn = new Knife01(i + 4);
        pl = new DinnerPlate01(i + 5);
        System.out.println("PlaceSetting01 constructor");
    }
    public static void main(String[] args){
        PlaceSetting01 x = new PlaceSetting01(9);
    }
}
