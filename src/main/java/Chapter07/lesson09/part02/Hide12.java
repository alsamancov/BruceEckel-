package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer12{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse12{}
class Bart12 extends Homer12{
    void doh(Milhouse12 m){
        System.out.println("doh(Milhouse12)");
    }
}
public class Hide12 {
    public static void main(String[] args){
        Bart12 b = new Bart12();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse12());
    }
}
