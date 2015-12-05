package Chapter07.lesson07.part022;

/**
 * Created by Alexey on 12/05/2015.
 */
class BedPlace01{
    BedPlace01(int i){
        System.out.println("BedPlace01 constructor");
    }
}
class Bed01 extends BedPlace01{
    Bed01(int i){
        super(i);
        System.out.println("Bed01 constructor");
    }
}
class BedLinen01{
    BedLinen01(int i){
        System.out.println("BedLinen01 constructor");
    }
}
class Pillowcase01 extends BedLinen01{
    Pillowcase01(int i){
        super(i);
        System.out.println("Pillowcase01 constructor");
    }
}
class Sheet01 extends BedLinen01{
    Sheet01(int i){
        super(i);
        System.out.println("Sheet01 constructor");
    }
}
class DuvetCover01 extends BedLinen01{
    DuvetCover01(int i){
        super(i);
        System.out.println("DuvetCover01 constructor");
    }
}
class Sleeper01{
    Sleeper01(int i){
        System.out.println("Sleeper01 constructor");
    }
}
public class BedSetting01 extends Sleeper01{
    private Pillowcase01 pc;
    private Sheet01 sht;
    private DuvetCover01 dc;
    private Bed01 bd;
    public BedSetting01(int i){
        super(i + 1);
        pc = new Pillowcase01(i + 2);
        sht = new Sheet01(i + 3);
        dc = new DuvetCover01(i + 4);
        bd = new Bed01(i + 5);
        System.out.println("BedSetting01 constructor");
    }
    public static void main(String[] args){
        BedSetting01 x = new BedSetting01(9);
    }
}
