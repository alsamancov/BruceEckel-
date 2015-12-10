package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
 */
class Engine04{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel04{
    public void inflate(int psi){}
}
class Window04{
    public void rollup(){}
    public void rolldown(){}
}
class Door04{
    public Window04 window = new Window04();
    public void open(){}
    public void close(){}
}
public class Car04 {
    public Engine04 engine = new Engine04();
    public Wheel04[] wheel = new Wheel04[4];
    public Door04
    left = new Door04(),
    right = new Door04();
    public Car04(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel04();
        }
    }
    public static void main(String[] args){
        Car04 car = new Car04();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
