package Chapter07.lesson09.part01;

/**
 * Created by Alexey on 11/20/2015.
 */
class Homer03{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse03{}
class Bart03 extends Homer03{
    void doh(Milhouse03 m){
        System.out.println("doh(Milhouse)");
    }
}
public class Hide03 {
    public static void main(String[] args) {
        Bart03 b = new Bart03();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse03());
    }
}
