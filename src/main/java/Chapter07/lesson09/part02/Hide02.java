package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer02{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse02 {}
class Bart02 extends Homer02{
    void doh(Milhouse02 m){
        System.out.println("doh(Milhouse02)");
    }
}
public class Hide02 {
    public static void main(String[] args){
        Bart02 b = new Bart02();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse02());
    }
}
