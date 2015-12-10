package Chapter07.lesson10.part02;

/**
 * Created by Alexey on 12/10/2015.
 */
class Engine08{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel08{
    public void inflate(int psi){}
}
class Window08{
    public void rollup(){}
    public void rolldown(){}
}
class Door08{
    public Window08 window = new Window08();
    public void open(){}
    public void close(){}
}
public class Car08 {
    public Engine08 engine = new Engine08();
    public Wheel08[] wheel = new Wheel08[4];
    public Door08
    left = new Door08(),
    right = new Door08();
    public Car08(){
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel08();
        }
    }
    public static void main(String[] args){
        Car08 car = new Car08();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}
