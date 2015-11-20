package Chapter07.lesson09.part01;

/**
 * Created by Alexey on 11/20/2015.
 */
class Homer06{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse06{}

class Bart06 extends Homer06{
    void doh(Milhouse06 m){
        System.out.println("doh(Milhouse)");
    }
}
public class Hide06 {
    public static void main(String[] args) {
        Bart06 b = new Bart06();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse06());
    }
}
