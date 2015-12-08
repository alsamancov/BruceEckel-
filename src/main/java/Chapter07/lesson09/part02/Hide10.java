package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer10{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse10{}
class Bart10 extends Homer10{
    void doh(Milhouse10 m){
        System.out.println("doh(Milhouse10)");
    }
}
public class Hide10 {
    public static void main(String[] args){
        Bart10 b = new Bart10();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse10());
    }
}
