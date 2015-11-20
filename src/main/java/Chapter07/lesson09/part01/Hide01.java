package Chapter07.lesson09.part01;

/**
 * Created by Alexey on 11/20/2015.
 */

class Homer01{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse01{}

class Bart01 extends Homer01{
    void doh(Milhouse01 m){
        System.out.println("doh(Milhouse)");
    }
}
public class Hide01 {
    public static void main(String[] args){
        Bart01 b = new Bart01();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse01());
    }
}
