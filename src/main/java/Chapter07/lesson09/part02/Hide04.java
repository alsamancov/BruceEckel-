package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer04{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse04{}
class Bart04 extends Homer04{
    void doh(Milhouse04 m){
        System.out.println("doh(Milhouse04)");
    }
}
public class Hide04 {
    public static void main(String[] args){
        Bart04 b = new Bart04();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse04());
    }
}
