package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer13{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse13{}
class Bart13 extends Homer13{
    void doh(Milhouse13 m){
        System.out.println("doh(Milhouse13)");
    }
}
public class Hide13 {
    public static void main(String[] args){
        Bart13 b = new Bart13();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse13());
    }
}
