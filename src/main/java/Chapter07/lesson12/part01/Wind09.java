package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 12/11/2015.
 */
class Instrument09{
    public void play(){}
    static void tune(Instrument09 i){
        i.play();
    }
}
public class Wind09 extends Instrument09 {
    public static void main(String[] args){
        Wind09 flute = new Wind09();
        Instrument09.tune(flute);
    }
}
