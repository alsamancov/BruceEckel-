package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Instrument07{
    public void play(){}
    static void tune(Instrument07 i){
        i.play();
    }
}
public class Wind07 extends Instrument07{
    public static void main(String[] args){
        Wind07 flute = new Wind07();
        Instrument07.tune(flute);
    }
}
