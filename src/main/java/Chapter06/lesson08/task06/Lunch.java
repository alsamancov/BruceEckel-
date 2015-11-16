package Chapter06.lesson08.task06;

/**
 * Created by Alexey on 11/16/2015.
 */

class Soup1{
    private Soup1(){
    }
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}

class Soup2{
    private Soup2(){}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}

public class Lunch {
    void testPrivate(){
        //Soup1 soup1 = new Soup1();
    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access().f();
    }
}
