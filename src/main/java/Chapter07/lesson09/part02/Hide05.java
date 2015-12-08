package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer05{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse05{}
class Bart05 extends Homer05{
    void doh(Milhouse05 m){
        System.out.println("doh(Milhouse05)");
    }
}
public class Hide05 {
    public static void main(String[] args){
        Bart05 b = new Bart05();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse05());
    }
}
