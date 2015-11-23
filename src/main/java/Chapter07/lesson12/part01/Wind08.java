package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Instrument08{
    public void play(){}
    static void tune(Instrument08 i){
        i.play();
    }
}
public class Wind08 extends Instrument08 {
    public static void main(String[] args){
        Wind08 flute = new Wind08();
        Instrument08.tune(flute);
    }
}
