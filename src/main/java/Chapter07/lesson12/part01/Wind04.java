package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Instrument04{
    public void play(){}
    static void tune(Instrument04 i){
        i.play();
    }
}
public class Wind04 extends Instrument04 {
    public static void main(String[] args){
        Wind04 flute = new Wind04();
        Instrument04.tune(flute);
    }
}
