package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 12/11/2015.
 */
class Instrument10{
    public void play(){}
    static void tune(Instrument10 i){
        i.play();
    }
}
public class Wind10 extends Instrument10{
    public static void main(String[] args){
        Wind10 flute = new Wind10();
        Instrument10.tune(flute);
    }
}
