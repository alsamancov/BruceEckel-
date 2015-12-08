package Chapter07.lesson09.part02;

/**
 * Created by Alexey on 12/08/2015.
 */
class Homer08{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}
class Milhouse08{}
class Bart08 extends Homer08{
    void doh(Milhouse08 m){
        System.out.println("doh(Milhouse08)");
    }
}
public class Hide08 {
    public static void main(String[] args){
        Bart08 b = new Bart08();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse08());
    }
}
