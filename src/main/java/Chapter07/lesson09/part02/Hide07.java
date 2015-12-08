package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer07{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse07{}
class Bart07 extends Homer07{
    void doh(Milhouse07 m){
        System.out.println("doh(Milhouse07");
    }
}
public class Hide07 {
    public static void main(String[] args){
        Bart07 b = new Bart07();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse07());
    }
}
