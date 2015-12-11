package Chapter07.lesson12.part02;

/**
 * Created by Alexey on 12/11/2015.
 */
class Instrument03{
    public void play(){}
    static void tune(Instrument03 i){
        i.play();
    }
}
public class Wind03 extends Instrument03{
    public static void main(String[] args){
        Wind03 flute = new Wind03();
        Instrument03.tune(flute);
    }
}
