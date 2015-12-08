package Chapter07.lesson10.part01;

/**
 * Created by Alexey on 12/08/2015.
 */
class Engine09{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel09{
    public void inflate(int psi){}
}
class Window09{
    public void rollup(){}
    public void rolldown(){}
}
class Door09{
    public Window09 window09 = new Window09();
    public void open(){}
    public void close(){}
}
public class Car09 {
    public Engine09 engine09 = new Engine09();
    public Wheel09[] wheel09 = new Wheel09[4];
    public Door09
    left = new Door09(),
    right = new Door09();
    public Car09(){
        for(int i = 0; i < 4; i++){
            wheel09[i] = new Wheel09();
        }
    }
    public static void main(String[] args){
        Car09 car09 = new Car09();
        car09.left.window09.rollup();
        car09.wheel09[0].inflate(72);
    }
}
