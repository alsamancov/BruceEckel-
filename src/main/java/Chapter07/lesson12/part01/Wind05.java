package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Instrument05{
    public void play(){}
    static void tune(Instrument05 i){
        i.play();
    }
}
public class Wind05 extends Instrument05 {
    public static void main(String[] args){
        Wind05 flute = new Wind05();
        Instrument05.tune(flute);
    }
}
