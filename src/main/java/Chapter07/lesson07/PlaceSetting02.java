package Chapter07.lesson07;

/**
 * Created by Alexey on 11/19/2015.
 */
class Plate02{
    Plate02(int i){
        System.out.println("Plate02 constructor");
    }
}
class DinnerPlate02 extends Plate02{
    DinnerPlate02(int i){
        super(i);
        System.out.println("DinnerPlate02 constructor");
    }
}
class Utensil02{
    Utensil02(int i){
        System.out.println("Utensil02 constructor");
    }
}
class Spoon02 extends Utensil02{
    Spoon02(int i){
        super(i);
        System.out.println("Spoon02 constructor");
    }
}
class Fork02 extends Utensil02{
    Fork02(int i){
        super(i);
        System.out.println("Fork02 constructor");
    }
}
class Knife02 extends Utensil02{
    Knife02(int i){
        super(i);
        System.out.println("Knife02 constructor");
    }
}
class Custom02{
    Custom02(int i){
        System.out.println("Custom02 constructor");
    }
}
public class PlaceSetting02 extends Custom02{
    private Spoon02 sp;
    private Fork02 frk;
    private Knife02 kn;
    private DinnerPlate02 pl;
    public PlaceSetting02(int i){
        super(i + 1);
        sp = new Spoon02(i + 2);
        frk = new Fork02(i + 3);
        kn = new Knife02(i + 4);
        pl = new DinnerPlate02(i + 5);
        System.out.println("PlaceSetting02 constructor");
    }
    public static void main(String[] args){
        PlaceSetting02 x = new PlaceSetting02(9);
    }
}
