package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer09{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse09{}
class Bart09 extends Homer09{
    void doh(Milhouse09 m){
        System.out.println("doh(Milhouse09)");
    }
}
public class Hide09 {
    public static void main(String[] args){
        Bart09 b = new Bart09();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse09());
    }
}
