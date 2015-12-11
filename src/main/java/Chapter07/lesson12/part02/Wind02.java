package Chapter07.lesson12.part02;

/**
 * Created by Alexey on 12/11/2015.
 */
class Instrument02{
    public void play(){}
    static void tune(Instrument02 i){
        i.play();
    }
}
public class Wind02 extends Instrument02{
    public static void main(String[] args){
        Wind02 flute = new Wind02();
        Instrument02.tune(flute);
    }
}
