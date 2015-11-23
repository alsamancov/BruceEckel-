package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Instrument01{
    public void play(){}
    static void tune(Instrument01 i){
        i.play();
    }
}
public class Wind01 extends Instrument01{
    public static void main(String[] args){
        Wind01 flute = new Wind01();
        Instrument01.tune(flute);
    }
}
