package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer11{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse11{}
class Bart11 extends Homer11{
    void doh(Milhouse11 m){
        System.out.println("doh(Milhouse11)");
    }
}
public class Hide11 {
    public static void main(String[] args){
        Bart11 b = new Bart11();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse11());
    }
}
