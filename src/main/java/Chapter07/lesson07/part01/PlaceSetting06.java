package Chapter07.lesson07.part01;

/**
 * Created by Alexey on 11/19/2015.
 */
class Plate06{
    Plate06(int i){
        System.out.println("Plate06 constructor");
    }
}
class DinnerPlate06 extends Plate06{
    DinnerPlate06(int i){
        super(i);
        System.out.println("DinnerPlate06 constructor");
    }
}
class Utensil06{
    Utensil06(int i){
        System.out.println("Utensil06 constructor");
    }
}
class Spoon06 extends Utensil06{
    Spoon06(int i){
        super(i);
        System.out.println("Spoon06 constructor");
    }
}
class Fork06 extends Utensil06{
    Fork06(int i){
        super(i);
        System.out.println("Fork06 constructor");
    }
}
class Knife06 extends Utensil06{
    Knife06(int i){
        super(i);
        System.out.println("Knife06 constructor");
    }
}
class Custom06{
    Custom06(int i){
        System.out.println("Custom06 constructor");
    }
}
public class PlaceSetting06 extends Custom06 {
    private Spoon06 sp;
    private Fork06 frk;
    private Knife06 kn;
    private DinnerPlate06 pl;
    public PlaceSetting06(int i){
        super(i + 1);
        sp = new Spoon06(i + 2);
        frk = new Fork06(i + 3);
        kn = new Knife06(i + 4);
        pl = new DinnerPlate06(i + 5);
        System.out.println("PlaceSetting06 constructor");
    }
    public static void main(String[] args){
        PlaceSetting06 x = new PlaceSetting06(9);
    }
}
