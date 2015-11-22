package Chapter06.lesson08.part01.task02;

/**
 * Created by Alex on 15.11.15.
 */
class Soup1_02{
    private Soup1_02(){}
    public static Soup1_02 makeSoup(){
        return new Soup1_02();
    }
}

class Soup2_02{
    private Soup2_02(){}

    private static Soup2_02 ps1 = new Soup2_02();
    public static Soup2_02 access(){
        return ps1;
    }
    public void f(){}
}
public class Lunch02 {
    void testPrivate(){
        //Soup1_02 soup = new Soup1_02();
    }

    void testStatic(){
        Soup1_02 soup1_02 = Soup1_02.makeSoup();
    }
    void testSingleton(){
        Soup2_02.access().f();
    }
}
