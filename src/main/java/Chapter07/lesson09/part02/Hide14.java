package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer14{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse14{}
class Bart14 extends Homer14{
    void doh(Milhouse14 m){
        System.out.println("doh(Milhouse14)");
    }
}
public class Hide14 {
    public static void main(String[] args){
        Bart14 b = new Bart14();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse14());
    }
}
