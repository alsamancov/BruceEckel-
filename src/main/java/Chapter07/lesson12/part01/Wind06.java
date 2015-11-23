package Chapter07.lesson12.part01;

/**
 * Created by Alexey on 11/23/2015.
 */
class Instrument06{
    public void play(){
    }
    static void tune(Instrument06 i){
        i.play();
    }
}
public class Wind06 extends Instrument06 {
    public static void main(String[] args){
        Wind06 flute = new Wind06();
        Instrument06.tune(flute);
    }
}
